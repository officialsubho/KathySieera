package com.kathysierra.chap1.abstractclass;

/*An abstract class cannot be instantiated*/

public abstract class AbstractVehicle {

	private String model;
	private String make;
	private int year;

	public abstract void goFast();

	public abstract void goUpHill();

	public abstract void impressNeighbours();

	/* An abstract class can have non-abstract methods in it as well */
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

}
