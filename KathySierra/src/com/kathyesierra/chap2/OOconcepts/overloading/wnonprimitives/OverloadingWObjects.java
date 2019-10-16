package com.kathyesierra.chap2.OOconcepts.overloading.wnonprimitives;

class Animal {
}

class Horse extends Animal {
}

class useAnimals {
	public void doStuff(Animal a) {
		System.out.println("using animals");
	}

	public void doStuff(Horse a) {
		System.out.println("using Horse");
	}
}

public class OverloadingWObjects {

	public static void main(String[] args) {

		Animal animal = new Animal();
		Horse horse = new Horse();
		useAnimals use = new useAnimals();
		Animal animal1 = new Horse();

		use.doStuff(animal1); // the reference type decides which overloaded
								// method to invoke not the object type

		use.doStuff(animal);
		use.doStuff(horse);
	}

}
