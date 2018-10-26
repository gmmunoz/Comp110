package comp110.filters;

import comp110.Color;
import comp110.Image;

/**
 * Author:Gabriela Munoz
 *
 * ONYEN:gmmunoz
 *
 * Collaborator(s):
 *
 * UNC Honor Pledge: I certify that no unauthorized assistance has been received
 * or given in the completion of this work. I certify that I understand and
 * could now rewrite on my own, without assistance from collaborators or course
 * staff, the problem set code I am submitting.
 */
public class ColorizeFilter implements Filter {

	public Image process(Image input) {
		// TODO:
		Image pixel = input.copy();
		double targetR = _color.getRed();
		double targetB = _color.getBlue();
		double targetG = _color.getGreen();
		for (int wide = 0; wide < pixel.getWidth(); wide++) {
			for (int tall = 0; tall < pixel.getHeight(); tall++) {
				Color colorize = pixel.getPixel(wide, tall);

				double deltaR = (colorize.getRed() - targetR) * this.getAmount();
				double r = colorize.getRed() - deltaR;
				colorize.setRed(r);

				double deltaB = (colorize.getBlue() - targetB) * this.getAmount();
				double b = colorize.getBlue() - deltaB;
				colorize.setBlue(b);

				double deltaG = (colorize.getGreen() - targetG) * this.getAmount();
				double g = colorize.getGreen() - deltaG;
				colorize.setGreen(g);

			}
		}

		return pixel;
	}

	/*
	 * 110-provided code below. You should understand what it all does but you
	 * should not modify.
	 */

	private double _amount;

	private Color _color;

	public ColorizeFilter(double amount, Color color) {
		this._amount = amount;
		this._color = color;
	}

	public double getAmount() {
		return this._amount;
	}

	public void setAmount(double amount) {
		this._amount = amount;
	}

	public Color getColor() {
		return this._color;
	}

	public void setColor(Color color) {
		this._color = color;
	}

	public String toString() {
		return "Colorize";
	}

}