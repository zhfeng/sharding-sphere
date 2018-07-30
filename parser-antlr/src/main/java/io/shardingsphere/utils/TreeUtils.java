package io.shardingsphere.utils;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class TreeUtils {
	public static ParseTree getAncestorByClass(ParseTree node, Class<?> clazz) {
		if (node == null) {
			return null;
		}

		ParseTree parentNode = node.getParent();
		while (parentNode != null) {
			if (isSameType(parentNode.getClass(), clazz)) {
				return parentNode;
			}
			parentNode = parentNode.getParent();
		}
		return null;
	}

	public static ParseTree getAncestorUtilToClass(ParseTree node, Class<?> clazz) {
		if (node == null) {
			return null;
		}

		ParseTree parent = node.getParent();
		while (parent != null) {
			if (isSameType(parent.getClass(), clazz)) {
				return parent;
			}
			parent = parent.getParent();
		}

		return null;
	}

	public static ParseTree getFirstChildByClass(ParseTree node, Class<?> clazz) {
		if (node == null) {
			return null;
		}

		while (node != null) {
			if (isSameType(node.getClass(), clazz)) {
				return node;
			}
			node = node.getChild(0);
		}

		return null;
	}

	public static List<ParserRuleContext> getChildByClass(ParseTree node, Class<?> clazz) {
		if (node == null) {
			return null;
		}

		List<ParserRuleContext> childs = new ArrayList<>();
		for (int i = 0; i < node.getChildCount(); i++) {
			ParseTree child = node.getChild(i);
			if (isSameType(child.getClass(), clazz)) {
				if (child instanceof ParserRuleContext) {
					childs.add((ParserRuleContext) child);
				}
			}
		}

		return childs;
	}

	public static List<ParseTree> getAllDescendantByClass(ParseTree node, Class<?> clazz) {
		if (node == null) {
			return null;
		}

		List<ParseTree> childs = new ArrayList<>();
		if (isSameType(node.getClass(), clazz)) {
			childs.add(node);
		}

		int count = node.getChildCount();
		if (count == 0) {
			return childs;
		}

		List<ParseTree> childNodes = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			ParseTree child = node.getChild(i);

			int childCount = child.getChildCount();
			for (int j = 0; j < childCount; j++) {
				childNodes.add(child.getChild(j));
			}
		}

		for (ParseTree child : childNodes) {
			List<ParseTree> retChilds = getAllDescendantByClass(child, clazz);
			if (retChilds != null) {
				childs.addAll(retChilds);
			}
		}

		return childs;
	}

	public static List<ParseTree> getAllTopDescendantByClass(ParseTree node, Class<?> clazz) {
		if (node == null) {
			return null;
		}

		List<ParseTree> childs = new ArrayList<>();
		if (isSameType(node.getClass(), clazz)) {
			childs.add(node);
			return childs;
		}

		int count = node.getChildCount();
		if (count == 0) {
			return childs;
		}

		List<ParseTree> childNodes = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			ParseTree child = node.getChild(i);
			if (isSameType(child.getClass(), clazz)) {
				childs.add(child);
			} else {
				int childCount = child.getChildCount();
				for (int j = 0; j < childCount; j++) {
					childNodes.add(child.getChild(j));
				}
			}
		}

		if (childs.isEmpty()) {
			for (ParseTree child : childNodes) {
				List<ParseTree> retChilds = getAllTopDescendantByClass(child, clazz);
				if (retChilds != null) {
					childs.addAll(retChilds);
				}
			}
		}

		return childs;
	}

	public static ParseTree getFirstDescendant(ParseTree node, Class<?> type, boolean onlyChild) {
		if (node == null) {
			return null;
		}

		if (isSameType(node.getClass(), type)) {
			return node;
		}

		int count = node.getChildCount();
		if (count == 0) {
			return null;
		}

		List<ParseTree> childNodes = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			ParseTree child = node.getChild(i);

			if (isSameType(child.getClass(), type)) {
				return child;
			}

			if (!onlyChild) {
				for (int j = 0; j < child.getChildCount(); j++) {
					childNodes.add(child.getChild(j));
				}
			}
		}

		if (!onlyChild) {
			for (ParseTree childNode : childNodes) {
				ParseTree retNode = getFirstDescendant(childNode, type, onlyChild);
				if (retNode != null) {
					return retNode;
				}
			}
		}

		return null;
	}

	public static TerminalNode getFirstTerminalByType(ParseTree node, int type) {
		if (node == null) {
			return null;
		}

		if (node instanceof TerminalNode) {
			TerminalNode terminal = (TerminalNode) node;
			if (terminal.getSymbol().getType() == type) {
				return terminal;
			} else {
				return null;
			}
		}

		int count = node.getChildCount();
		if (count == 0) {
			return null;
		}

		List<ParseTree> nonterminalChildNodes = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			ParseTree child = node.getChild(i);

			if (child instanceof TerminalNode) {
				TerminalNode terminal = (TerminalNode) child;
				if (terminal.getSymbol().getType() == type) {
					return terminal;
				}
			} else {
				int childCount = child.getChildCount();
				for (int j = 0; j < childCount; j++) {
					nonterminalChildNodes.add(child.getChild(j));
				}
			}
		}

		for (ParseTree nonterminalNode : nonterminalChildNodes) {
			TerminalNode retNode = getFirstTerminalByType(nonterminalNode, type);
			if (retNode != null) {
				return retNode;
			}
		}

		return null;
	}

	public static List<TerminalNode> getAllTerminalByType(ParseTree node, int type) {
		List<TerminalNode> retNodes = new ArrayList<>();
		if (node == null) {
			return retNodes;
		}

		if (node instanceof TerminalNode) {
			TerminalNode terminal = (TerminalNode) node;
			if (terminal.getSymbol().getType() == type) {
				retNodes.add(terminal);
			} else {
				return retNodes;
			}
		}

		int count = node.getChildCount();
		if (count == 0) {
			return retNodes;
		}

		List<ParseTree> nonTerminalChilds = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			ParseTree child = node.getChild(i);

			// if("?".equals(child.getText())) {
			// if(child.getClass() == LiterContext.class) {
			// System.out.println(1);
			// }
			// }
			if (child instanceof TerminalNode) {
				TerminalNode terminal = (TerminalNode) child;
				// System.out.println(terminal.getText()+"===="
				// +terminal.getSymbol().getType());
				if (terminal.getSymbol().getType() == type) {
					retNodes.add(terminal);
				}
			} else {
				int childCount = child.getChildCount();
				for (int j = 0; j < childCount; j++) {
					nonTerminalChilds.add(child.getChild(j));
				}
			}
		}

		int childCount = nonTerminalChilds.size();
		for (int j = 0; j < childCount; j++) {
			List<TerminalNode> childRetNodes = getAllTerminalByType(nonTerminalChilds.get(j), type);
			if (childRetNodes != null) {
				retNodes.addAll(childRetNodes);
			}
		}

		return retNodes;
	}

	public static boolean isSameType(Class<?> c1, Class<?> c2) {
		return c1 == c2 || c2.isAssignableFrom(c1);
	}
}
