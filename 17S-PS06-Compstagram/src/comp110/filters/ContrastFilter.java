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
public class ContrastFilter implements Filter {

	public Image process(Image input) {
		// TODO:
		Image pixel = input.copy();
		for (int wide = 0; wide < pixel.getWidth(); wide++) {
			for (int tall = 0; tall < pixel.getHeight(); tall++) {
				Color ygg = pixel.getPixel(wide, tall);
				double contrast = (0.5 - _amount) * 2.0;

				double deltaR = ((ygg.getRed() - 0.5) * contrast);
				double R = ygg.getRed() - deltaR;
				ygg.setRed(R);

				double deltaG = ((ygg.getGreen() - 0.5) * contrast);
				double G = ygg.getGreen() - deltaG;
				ygg.setGreen(G);

				double deltaB = ((ygg.getBlue() - 0.5) * contrast);
				double B = ygg.getBlue() - deltaB;
				ygg.setBlue(B);
			}

		}
		return pixel;

	}

	/*
	 * 110-provided code below. You should understand what it all does but you
	 * should not modify.
	 */

	private double _amount;

	public ContrastFilter(double amount) {
		_amount = amount;
	}

	public double getAmount() {
		return _amount;
	}

	public void setAmount(double amount) {
		_amount = amount;
	}

	public String toString() {
		return "Contrast";
	}

}