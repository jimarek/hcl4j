package com.bertramlabs.plugins.hcl4j.RuntimeSymbols;

public class AttributeExpr extends Variable {

	public AttributeExpr(String name) {
		super(name);
	}
	public EvalSymbol attribute;
}
