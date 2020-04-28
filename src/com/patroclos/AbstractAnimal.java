package com.patroclos;

public abstract class AbstractAnimal {
	
	protected String field1;
	
	public AbstractAnimal(String field1) {
		this.field1 = field1;
	}
	
	public abstract void doStuff();

}
