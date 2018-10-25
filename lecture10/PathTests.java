package comp110.lecture10;

import comp110.Console;

public class PathTests {

	public static void main(String[] args) {

		Console console = new Console();

		// TODO: Add parameters to these points
		Point a = new Point();
		Point b = new Point();
		Point c = new Point();
		Point d = new Point();
		Point[] sample = new Point[] { a, b, c, d };

		Path path = new Path(sample);

		console.print("Path: " + path);
		console.print("Highest: " + path.getHighestPoint());
		console.print("Quadrant 1? " + path.isInQuadrant(1));
		console.print("Quadrant 2? " + path.isInQuadrant(2));

	}

}
