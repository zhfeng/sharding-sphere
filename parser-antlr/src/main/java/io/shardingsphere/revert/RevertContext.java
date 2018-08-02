package io.shardingsphere.revert;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RevertContext {
	private String originSQL;
	private Object[] originParams;
	private String selectSQL;
	private Object[] selectParams;
	private String revertSQL;
	private Object[] revertParams;
	
}
