package com.kathyesierra.chap1.enums;

/* Enum declaed outside a class */
enum CoffeeSize {
	BIG(10), SMALL(6), MEDIUM(8);

	/* Constructors for enum */

	private CoffeeSize(int ounce) {
		this.ounce = ounce;
	}

	/* Member variable for enum */
	private int ounce;

	/* Getter method for enum */

	public int getOunce() {
		return ounce;
	}

}

class Coffee {
	CoffeeSize size;
}

/* Enum declared inside a class */
class Coffee1 {
	enum CoffeeSize1 {
		GRANDE, MINI_GRANDE, POCKET
	}

	CoffeeSize1 size1;
}

public class PracticeWEnums {

	public static void main(String[] args) {

		Coffee drink = new Coffee();
		drink.size = CoffeeSize.MEDIUM;
		System.out.println(drink.size.getOunce());

		Coffee1 drink1 = new Coffee1();
		drink1.size1 = Coffee1.CoffeeSize1.POCKET; // For Enum declared within a
													// class .

		/*
		 * switch(drink.size){ case BIG: break; case MEDIUM: break; case SMALL:
		 * break; default: break;
		 * 
		 * }
		 */
	}

}
