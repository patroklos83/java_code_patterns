package com.patroclos;

public interface ITest {

	public final String field1 = "field1";



	default void doDefaultStuff() {
		doPrivateStuff();
	}

	private void doPrivateStuff() {
		System.out.println("do default stuff..." + field1);
	}
}
