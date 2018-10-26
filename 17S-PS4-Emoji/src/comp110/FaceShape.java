package comp110;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo;

public class FaceShape {

	// Field
	private Color _tone;
	private Circle _pumpkin;
	private FaceShape _faceshape;

	// Constructor
	public FaceShape(Color tone) {
		_tone = tone;

	}

	// Methods
	public Group shapes() {
		// Declare a local variable and initialize it to a new Group instance.
		Group aGroup = new Group();
		aGroup.getChildren().add(this.makeStem());

		Circle pumpkin = new Circle();
		pumpkin.setCenterX(0.0);
		pumpkin.setCenterY(0.0);
		pumpkin.setRadius(10.0);
		// pumpkin.setStroke(Color.ORANGE);
		pumpkin.setFill(_tone);
		aGroup.getChildren().add(pumpkin);

		// TODO: Draw your FaceShape by adding one or more shapes to aGroup.
		// Remember to add a child to aGroup: aGroup.getChildren().add(<shape>);

		// You will need to import the class of every shape you use.
		// For a list of classes, see the Library Class Reference at the end
		// of the write-up or view the official Java documentation:
		// https://docs.oracle.com/javase/8/javafx/api/javafx/scene/shape/package-summary.html

		// * Requirement: One shape in aGroup must have its fill property
		// set to the _tone instance variable.

		// Finally we return the group to the caller of this method.
		return aGroup;
	}

	// Getter Method
	public Color getTone() {
		return _tone;
	}

	// Setter Method
	public void setTone(Color tone) {
		_tone = tone;
	}

	public FaceShape getFaceShape() {
		return _faceshape;
	}

	public Path makeStem() {
		Path stem = new Path();

		MoveTo moveTo = new MoveTo();
		moveTo.setX(5.0);
		moveTo.setY(1.0);
		stem.getElements().add(moveTo);

		QuadCurveTo curve = new QuadCurveTo();
		curve.setX(0.0);
		curve.setY(-15.0);
		curve.setControlX(0.0);
		curve.setControlY(0.0);
		stem.getElements().add(curve);
		stem.setStroke(Color.DARKGOLDENROD);

		return stem;
	}

}