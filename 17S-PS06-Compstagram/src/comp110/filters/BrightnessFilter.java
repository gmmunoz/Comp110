package comp110.filters;

import comp110.Color;
import comp110.Image;

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
public class BrightnessFilter implements Filter {

	public Image process(Image input) {
		// TODO

		Image copy = input.copy();
		double brightness = (_amount - 0.5) * 2;

		// copy.getPixel(copy.getWidth(),copy.getHeight());
		for (int wide = 0; wide < copy.getWidth(); wide++) {
			for (int tall = 0; tall < copy.getHeight(); tall++) {

				Color boob = copy.getPixel(wide, tall);

				double red = boob.getRed();
				double green = boob.getGreen();
				double blue = boob.getBlue();

				red = red + (brightness * red);
				green = green + (brightness * green);
				blue = blue + (brightness * blue);

				boob.setRed(red);
				boob.setGreen(green);
				boob.setBlue(blue);
			}
		}
		return copy;
	}

	/*
	 * 110-provided code below. You should understand what it all does but you
	 * should not modify.
	 */

	private double _amount;

	public BrightnessFilter(double amount) {
		_amount = amount;
	}

	public String toString() {
		return "Brightness";
	}

	public double getAmount() {
		return _amount;
	}

	public void setAmount(double amount) {
		_amount = amount;
	}

}