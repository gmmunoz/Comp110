package comp110.lecture10;

import comp110.Console;

public class Point {

	// Fields
	private double _x, _y;

	// Constructors
	public Point() {
		Console console = new Console();
		_x = console.promptDouble("x");
		_y = console.promptDouble("y");
		console.close();
	}

	// TODO: add a constructor with parameters

	// Methods
	public double getX() {
		return _x;
	}

	public double getY() {
		return _y;
	}

	public int getQuadrant() {
		if (_x > 0 && _y > 0) {
			return 1;
		} else if (_x < 0 && _y > 0) {
			return 2;
		} else if (_x < 0 && _y < 0) {
			return 3;
		} else if (_x > 0 && _y < 0) {
			return 4;
		} else {
			return 0;
		}
	}

	public double maximum() {
		if (_x > _y) {
			return _x;
		}
		return _y;
	}

	public String toString() {
		return "(" + _x + ", " + _y + ")";
	}

}