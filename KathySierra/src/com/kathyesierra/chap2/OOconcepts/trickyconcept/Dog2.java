package com.kathyesierra.chap2.OOconcepts.trickyconcept;

import java.io.IOException;

class Animal {
	public void eat() throws Exception {
		System.out.println("All animals eats");
	}
}

public class Dog2 extends Animal {

	public void eat(String s) throws IOException {
	}

	public static void main(String[] args) throws Exception {

		Animal animal = new Dog2();
		Dog2 dog = new Dog2();

		// animal.eat(); //wont compile .
		dog.eat("Cooper");// Calling the overloaded method
		dog.eat(); // calling the overridden method
	}

}
