package io.shardingsphere.util;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class TreeUtil {
	public static ParseTree getAncestorByClass(ParseTree node, Class<?> clazz) {
		if (node == null) {
			return null;
		}

		while (node.getParent() != null) {
			node = node.getParent();
			if (node.getParent().getClass() == clazz) {
				return node.getParent();
			}
		}
		return null;
	}

	public static ParseTree getAncestorUtilToClass(ParseTree node, Class<?> clazz) {
		if (node == null) {
			return null;
		}
		ParseTree parent = node.getParent();
		ParseTree retNode = null;
		while (parent != null) {
			if (parent.getClass() == clazz) {
				retNode = parent;
				break;
			}
			parent = parent.getParent();
		}

		return retNode;
	}

	public static ParseTree getFirstChildByClass(ParseTree node, Class<?> clazz) {
		if (node == null) {
			return null;
		}

		while (node != null) {
			if (node.getClass() == clazz) {
				break;
			}
			node = node.getChild(0);
		}

		return node;
	}

	public static List<ParserRuleContext> getChildByClass(ParseTree node, Class<?> clazz) {
		if (node == null) {
			return null;
		}

		List<ParserRuleContext> childs = new ArrayList<>();
		for (int i = 0; i < node.getChildCount(); i++) {
			ParseTree child = node.getChild(i);
			if (child.getClass() == clazz) {
				if (child instanceof ParserRuleContext) {
					childs.add((ParserRuleContext) child);
				}
			}
		}

		return childs;
	}

	public static ParseTree getFirstChildByParent(ParseTree node, Class<?> parentClass) {
		ParseTree retNode = getFirstChildByClass(node, parentClass);

		if (retNode != null) {
			return retNode.getChild(0);
		}
		return null;
	}

	public static ParseTree getFirstDescendant(ParseTree node, Class<?> type, boolean onlyChild) {
		if (node == null) {
			return null;
		}

		int count = node.getChildCount();
		if (count == 0) {
			return null;
		}

		List<ParseTree> nonterminalNodes = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			ParseTree child = node.getChild(i);

			if (child.getClass() == type) {
				return child;
			}

			if (!onlyChild) {
				nonterminalNodes.add(child);
			}
		}

		if (!onlyChild) {
			for (ParseTree nonterminalNode : nonterminalNodes) {
				count = nonterminalNode.getChildCount();
				for (int i = 0; i < count; i++) {
					ParseTree retNode = getFirstDescendant(nonterminalNode.getChild(i), type, onlyChild);
					if (retNode != null) {
						return retNode;
					}
				}
			}
		}

		return null;
	}

	public static TerminalNode getFirstTerminalByType(ParseTree node, int type) {
		if (node == null) {
			return null;
		}

		int count = node.getChildCount();
		if (count == 0) {
			return null;
		}

		List<ParseTree> nonterminalNodes = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			ParseTree child = node.getChild(i);

			if (child instanceof TerminalNode) {
				TerminalNode terminal = (TerminalNode) child;
				if (terminal.getSymbol().getType() == type) {
					return terminal;
				} else {
					nonterminalNodes.add(child);
				}
			}
		}

		for (ParseTree nonterminalNode : nonterminalNodes) {
			count = nonterminalNode.getChildCount();
			for (int i = 0; i < count; i++) {
				TerminalNode retNode = getFirstTerminalByType(nonterminalNode.getChild(i), type);
				if (retNode != null) {
					return retNode;
				}
			}
		}
		return null;
	}

	public static List<TerminalNode> getAllTerminalByType(ParseTree node, int type) {
		if (node == null) {
			return null;
		}

		int count = node.getChildCount();
		if (count == 0) {
			return null;
		}

		List<TerminalNode> retNodes = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			ParseTree child = node.getChild(i);

			if (child instanceof TerminalNode) {
				TerminalNode terminal = (TerminalNode) child;
				if (terminal.getSymbol().getType() == type) {
					retNodes.add(terminal);
				} else {
					count = child.getChildCount();
					for (int j = 0; j < count; j++) {
						TerminalNode retNode = getFirstTerminalByType(child.getChild(j), type);
						if (retNode != null) {
							retNodes.add(retNode);
						}
					}
				}
			}
		}

		return retNodes;
	}

}
