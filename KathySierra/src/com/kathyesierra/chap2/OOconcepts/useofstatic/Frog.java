package com.kathyesierra.chap2.OOconcepts.useofstatic;

public class Frog {

	static int frogCount;

	public Frog() {
		frogCount += 1;
	}

	public static void main(String[] args) {

		Frog[] frog = { new Frog(), new Frog(), new Frog() };
		
		System.out.println(frogCount);

	}
}
