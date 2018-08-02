package io.shardingsphere.revert.builder.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.shardingsphere.revert.DMLType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SQLPartInfo {
	private DMLType type;
	private String sql;
	private List<String> updateColumns = new ArrayList<>();
	private List<String> updateTables = new ArrayList<>();
	private Map<String, String> tableAlias = new HashMap<>();
	private String updateConditionString;
	private List<Integer> whereParamIndexRange = new ArrayList<>();
	
}
