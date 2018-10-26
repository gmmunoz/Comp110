package comp110;

import javafx.scene.paint.Color;

/*
 * Author: <Gabriela Munoz>
 *
 * ONYEN: <gmmunoz>
 *
 * UNC Honor Pledge: I certify that no unauthorized aids or assistance has been 
 * received or used in the completion of this work. I collaborated with
 * no one other than official COMP110 UTAs on this code.
 */
public class Runner {

	public static void main(String[] args) {

		// You are ready to begin working on the FaceShape of your emoji!

		Canvas canvas = new Canvas();

		// When you start working on Mouth, and other components
		// of your emoji, you'll need to modify the the code below
		// as described in the Mouth section of the problem set.

		FaceShape aFaceShape = new FaceShape(Color.ORANGE);
		canvas.draw(aFaceShape.shapes());

		Nose anose = new Nose();
		canvas.draw(anose.shapes());

		Eye aneye = new Eye(Color.BLACK);
		canvas.draw(aneye.shapes());

		Mouth mouth = new Mouth();
		canvas.draw(mouth.shapes());

	}

}