package comp110.lecture10;

import comp110.Console;

public class PointTests {

	public static void main(String[] args) {

		Console console = new Console("Point Tests");

		Point a = new Point();
		Point b = new Point();

		console.print("a: " + a.toString());
		console.print("a.getQuadrant(): " + a.getQuadrant());
		console.print("a.maximum(): " + a.maximum());

		console.print("b: " + b.toString());
		console.print("b.getQuadrant(): " + b.getQuadrant());
		console.print("b.maximum(): " + b.maximum());

	}

}