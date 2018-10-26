package comp110.filters;

import comp110.Color;
import comp110.Image;

/**
 * Author: Gabriela Munoz
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
public class SaturationFilter implements Filter {

	public Image process(Image input) {
		// TODO:
		Image copy = input.copy();
		double saturation = (0.5 - _amount) * 2;

		// copy.getPixel(copy.getWidth(),copy.getHeight());
		for (int wide = 0; wide < copy.getWidth(); wide++) {
			for (int tall = 0; tall < copy.getHeight(); tall++) {

				Color boob = copy.getPixel(wide, tall);

				double red = boob.getRed();
				double green = boob.getGreen();
				double blue = boob.getBlue();

				// avg fourmula of colors/3 (double)
				double average = (red + blue + green) / 3;
				Color saturated = new Color(average, average, average);

				double changeRed = (red - saturated.getRed()) * saturation;
				double changeGreen = (green - saturated.getGreen()) * saturation;
				double changeBlue = (blue - saturated.getBlue()) * saturation;

				double opRed = red - changeRed;
				double opGreen = green - changeGreen;
				double opBlue = blue - changeBlue;

				boob.setRed(opRed);
				boob.setGreen(opGreen);
				boob.setBlue(opBlue);
			}
		}
		return copy;
	}

	/*
	 * 110-provided code below. You should understand what it all does but you
	 * should not modify.
	 */
	private double _amount;

	public SaturationFilter(double amount) {
		_amount = amount;
	}

	public double getAmount() {
		return _amount;
	}

	public void setAmount(double amount) {
		_amount = amount;
	}

	public String toString() {
		return "Saturation";
	}

}