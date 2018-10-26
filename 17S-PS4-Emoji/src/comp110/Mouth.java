package comp110;

import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.scene.paint.Color;

public class Mouth {

	// constructor
	public Mouth() {

	}

	// methods
	public Group shapes() {
		// Declare a local variable and initialize it to a new Group instance.
		Group aGroup = new Group();
		aGroup.getChildren().add(this.makeMouth());
		return aGroup;
	}

	public Rectangle makeMouth() {
		Rectangle _mouth = new Rectangle();
		_mouth.setX(-5.0);
		_mouth.setY(4.0);
		_mouth.setWidth(10.0);
		_mouth.setHeight(2.0);
		_mouth.setFill(Color.BLACK);
		return _mouth;
	}

}
