package com.kathyesierra.chap2.OOconcepts.overloading;

class Adder {
	public int add(int x, int y) {
		return x + y;
	}

	/*Overloaded method*/
	public double add(double a, double b) throws ArithmeticException {
		return a + b;
	}
}

public class TestAdder extends Adder {

	public static void main(String[] args) {

		TestAdder addition = new TestAdder();

		int result = addition.add(5, 7);
		double result1 = addition.add(5.0, 7.0);
		
		System.out.println(result);
		System.out.println(result1);
	}

}
