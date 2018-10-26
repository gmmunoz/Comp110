package comp110.filters;

import comp110.Color;
import comp110.Image;

/**
 * Author:gabriela munoz
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
public class BorderFilter implements Filter {

	public Image process(Image input) {

		int thickness = (int) (((input.getWidth() * _amount)) / 2);
		Image copy = input.copy();
		for (int wide = 0; wide < input.getWidth(); wide++) {
			for (int tall = 0; tall < input.getHeight(); tall++) {
				if (wide < thickness || wide >= input.getWidth() - thickness || tall < thickness
						|| tall >= input.getHeight() - thickness) {
					copy.setPixel(wide, tall, _color);
				}
			}
		}
		return copy;
	}

	/*
	 * 110-provided code below. You should understand what it all does but you
	 * should not modify.
	 */

	private double _amount;
	private Color _color;

	public BorderFilter(double amount, Color color) {
		_amount = amount;
		_color = color;
	}

	public double getAmount() {
		return _amount;
	}

	public void setAmount(double amount) {
		_amount = amount;
	}

	public Color getColor() {
		return _color;
	}

	public void setColor(Color color) {
		_color = color;
	}

	public String toString() {
		return "Border";
	}

}