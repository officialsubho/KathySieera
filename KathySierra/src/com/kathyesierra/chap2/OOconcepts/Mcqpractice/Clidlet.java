package com.kathyesierra.chap2.OOconcepts.Mcqpractice;

class Clidder {
	private final void flipper() {
		System.out.println("Clidder");
	}
}

public class Clidlet extends Clidder {
	
	/*
	 * The flipper method in superclass is marked private and hence not visible
	 * here in the subclass . The flipper method defined below is part of the
	 * subclass and is not the one in the superclass .
	 */
	public final void flipper() {
		System.out.println("Clidlet");
	}

	public static void main(String[] args) {
		new Clidlet().flipper();
	}
}
