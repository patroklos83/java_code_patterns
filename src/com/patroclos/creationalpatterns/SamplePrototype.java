package com.patroclos.creationalpatterns;

public class SamplePrototype extends Prototype{

	private final String id = "id-343-xx";
	
	public String getId() {
		return this.id;
	}
	
	@Override
	public Prototype clone() throws CloneNotSupportedException {
		return (SamplePrototype)super.clone();
	}


}
