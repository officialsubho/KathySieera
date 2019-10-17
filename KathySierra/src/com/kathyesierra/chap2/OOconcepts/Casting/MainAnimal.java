package com.kathyesierra.chap2.OOconcepts.Casting;

class Animal {
	public void makeNoise() {
		System.out.println("General noise");
	}
}

class Dog extends Animal {

	@Override
	public void makeNoise() {

		System.out.println("Bark");
	}

	public void playDead() {
		System.out.println("playful and friendly");
	}
}

public class MainAnimal {

	public static void main(String[] args) {

		Animal[] animal = { new Animal(), new Dog(), new Animal() };

		/* Watch the loop closely here */

		for (Animal a : animal) {
			a.makeNoise();
			if (a instanceof Dog) {
				/*
				 * casting the animal object to the Dog reference . this is
				 * downcasting
				 */
				Dog d = (Dog) a;
				d.playDead();

			}

			Dog d1 = new Dog();
			Animal a1 = d1; // this is upcasting . no explicit cast needed

		}

	}
}
