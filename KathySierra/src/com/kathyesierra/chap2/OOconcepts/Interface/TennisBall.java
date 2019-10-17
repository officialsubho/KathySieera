package com.kathyesierra.chap2.OOconcepts.Interface;

public class TennisBall extends Ball {

	@Override
	public void bounce() {
		System.out.println("this ball bounces");

	}

	@Override
	public int setBouncefactor(int bf) {
		return bf ;

	}

	@Override
	void bespherical() {
		// TODO Auto-generated method stub

	}

}
