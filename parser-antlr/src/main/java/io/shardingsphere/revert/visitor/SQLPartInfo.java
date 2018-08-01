package io.shardingsphere.revert.visitor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SQLPartInfo {
	private String sql;
	private List<String> updateColumns;
	private List<String> updateTables;
	private Map<String, String> tableAlias = new HashMap<>();
	private String updateConditionString;
}
