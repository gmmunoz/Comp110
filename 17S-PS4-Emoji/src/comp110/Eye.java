package comp110;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Eye {

	// field
	private Color _irisColor;
	// private Eye _lefteye;
	// private Eye _righteye;

	// constructor
	public Eye(Color iriscolor) {
		_irisColor = iriscolor;
	}

	// methods
	public Group shapes() {
		// Declare a local variable and initialize it to a new Group instance.
		Group aGroup = new Group();
		aGroup.getChildren().add(this.makeeye());
		return aGroup;
	}

	// // Getter Method
	// public Eye getLeftEye() {
	// return _lefteye;
	//
	// }
	//
	// public Eye getRightEye() {
	// return _righteye;
	// }

	public Color getIrisColor() {
		return _irisColor;
	}

	// Setter Method
	public void setIrisColor(Color irisColor) {
		_irisColor = irisColor;
	}

	public Circle makeeye() {
		Circle circle = new Circle();
		circle.setCenterX(4.0);
		circle.setCenterY(-4.0);
		circle.setRadius(2.5);
		circle.setStroke(Color.BLACK);
		circle.setStrokeWidth(0.5);
		circle.setFill(_irisColor);
		return circle;
	}
}
