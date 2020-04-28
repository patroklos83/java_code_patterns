package com.patroclos.creationalpatterns;

public class OneInstanceSingleton {
	
	
	private static OneInstanceSingleton instance;
	
	private OneInstanceSingleton() {};
	
	public static OneInstanceSingleton getInstance() {
		if (instance == null)
			instance = new  OneInstanceSingleton();
		return instance;
	}
	
	
	public void doStuff() {
		System.out.println("Just one singleton instance...");
	}

}
