package com.kathyesierra.chap1.access.modifiers;

class Zoo {
	public String coolMethod() {
		return "woow";

	}
}

public class Public extends Zoo {

	public void buildAZoo() {
		Zoo zoo = new Zoo();
		System.out.println(zoo.coolMethod()); // this is calling the
												// coolmethod() in the Zoo class
												// .

		System.out.println(this.coolMethod()); // this is calling the
												// coolmethod() in the zoo
												// object .
	}

}
