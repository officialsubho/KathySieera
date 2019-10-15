package com.kathyesierra.chap2.OOconcepts;

class GameShape {

	public void displayShape() {
		System.out.println("Displaying the shape");
	}
}

/* Inheritance */
class PlayerPiece extends GameShape implements Animatable {

	public void movePiece() {
		System.out.println("Move the piece");
	}

	@Override
	public void Animate() {
		System.out.println("Animate the piece");

	}
}

class TilePiece extends GameShape {
	@Override
	public void displayShape() {
		System.out.println("Displaying the black tilepiece");
	}

	public void getAdjacentTile() {
		System.out.println("Adjacent tile found");
	}
}

public class Main {

	public static void main(String[] args) {

		PlayerPiece player = new PlayerPiece();
		TilePiece tile = new TilePiece();

		/*
		 * Below all are valid declarations . All are seperate reference
		 * variables but pointing to the same obejct . Gameshape , TilePiece and
		 * PlayerPiece reference variables can invoke the displayShape() method
		 * out of all the reference variables.
		 */
		Object o = player;
		GameShape shape = player;
		Animatable animal = player;

		doShapes(player);
		doShapes(tile);

		/*
		 * The compiler will allow only methods in class Gameshape to be invoked
		 * when using a reference to a Gameshape. It does not matter to which
		 * object its pointing.
		 */

		// shape.getAdjacentTile();
	}

	private static void doShapes(GameShape shape) {

		shape.displayShape();
	}

}

interface Animatable {

	public void Animate();
}
