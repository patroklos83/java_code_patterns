package com.patroclos;

import com.patroclos.creationalpatterns.Car;
import com.patroclos.creationalpatterns.OneInstanceSingleton;
import com.patroclos.creationalpatterns.SamplePrototype;

public class App {

	public static void main(String[] args) {
	
		//Builder pattern
		Car car = new Car
				.Builder(2)
				.setModel("toyota")
				.setYearManufactured(1998)
				.build();
		System.out.println(car.toString());
		
		//Singleton Pattern
		OneInstanceSingleton singleton = OneInstanceSingleton.getInstance();
		singleton.doStuff();
		
		//Prototype Pattern
		try {
			SamplePrototype newPrototype = (SamplePrototype) new SamplePrototype().clone();
			System.out.println("protoype id cloned is : " + newPrototype.getId());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Test Interface Default method
		TestImpl testInterfaceImpl = new TestImpl();
		testInterfaceImpl.doDefaultStuff();

		AbstractAnimal dog = new Dog("someValue");
		dog.doStuff();
	}

}
