package com.kathyesierra.chap2.OOconcepts.overloadingvsriding;

class Animal {
	public void eat() {
		System.out.println("general eating");
	}
}

class Horse extends Animal {

	@Override
	public void eat() {
		System.out.println("Horse eating hay");
	}

	public void eat(String s) {
		System.out.println(s + " eats stuff");
	}

}

public class Main {

	public static void main(String[] args) {

		Animal animal = new Animal();
		Animal horse = new Horse();
		Horse horse1 = new Horse();

		animal.eat();

		/*
		 * This seems to be a very important concept at this point for me . For
		 * overloading , the reference type decides which method will b called
		 * at Runtime . For overriding , it is the object type which
		 * determines that.See the two methods below to understand this concept
		 * .
		 */

		horse.eat();
		horse1.eat("Doneky");
	}

}
