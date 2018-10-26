package comp110;

/**
 * Author: Gabriela Munoz
 *
 * ONYEN: gmmunoz
 *
 * Collaborator(s):
 *
 * UNC Honor Pledge: I certify that no unauthorized assistance has been received
 * or given in the completion of this work. I certify that I understand and
 * could now rewrite on my own, without assistance from collaborators or course
 * staff, the problem set code I am submitting.
 */
public class Color {

	// TODO: 1.1 Declare instance variables
	private double _red;
	private double _green;
	private double _blue;

	// TODO: 1.4 Declare & define constructor
	public Color(double red, double green, double blue) {
		this.setRed(red);
		this.setGreen(green);
		this.setBlue(blue);
	}

	// TODO: 1.2 Declare & define getters
	public double getRed() {
		return _red;
	}

	public double getGreen() {
		return _green;
	}

	public double getBlue() {
		return _blue;
	}

	// TODO: 1.3 Declare & define setters
	public void setRed(double Red) {
		if (Red < 0) {
			_red = 0.0;
		} else if (Red > 1) {
			_red = 1.0;
		} else if (Red >= 0 && Red <= 1) {
			_red = Red;
		}
	}

	public void setGreen(double Green) {
		if (Green < 0) {
			_green = 0.0;
		} else if (Green > 1) {
			_green = 1.0;
		} else if (Green >= 0 && Green <= 1) {
			_green = Green;
		}
	}

	public void setBlue(double Blue) {
		if (Blue < 0) {
			_blue = 0.0;
		} else if (Blue > 1) {
			_blue = 1.0;
		} else if (Blue >= 0 && Blue <= 1) {
			_blue = Blue;
		}
	}

	// TODO: 1.5 Declare & define copy method
	public Color copy() {
		Color color = new Color(_red, _green, _blue);
		return color;
	}
}