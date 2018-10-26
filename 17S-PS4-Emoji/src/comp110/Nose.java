package comp110;

import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.scene.paint.Color;

//field
public class Nose {
	private Color _tone;

	// constructor
	public Nose() {
	}

	// methods
	public Group shapes() {
		Group aGroup = new Group();
		aGroup.getChildren().add(this.makeNose());
		aGroup.getChildren().add(this.makesidetri());
		aGroup.getChildren().add(this.makeside());
		aGroup.getChildren().add(this.makehole());
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

	public Path makeNose() {
		Path nose = new Path();

		MoveTo moveTo = new MoveTo();
		moveTo.setX(-2.0);
		moveTo.setY(2.0);
		nose.getElements().add(moveTo);

		LineTo lineto = new LineTo();
		lineto.setX(0.0);
		lineto.setY(0.0);
		nose.getElements().add(lineto);
		nose.setStroke(Color.BLACK);

		return nose;

	}

	public Path makesidetri() {
		Path triangle = new Path();

		MoveTo moveTo = new MoveTo();
		moveTo.setX(-1.90);
		moveTo.setY(2.0);
		triangle.getElements().add(moveTo);

		LineTo lineto = new LineTo();
		lineto.setX(2.0);
		lineto.setY(2.0);
		triangle.getElements().add(lineto);
		triangle.setStroke(Color.BLACK);

		return triangle;
	}

	public Path makeside() {
		Path triangle = new Path();

		MoveTo moveTo = new MoveTo();
		moveTo.setX(2.0);
		moveTo.setY(2.0);
		triangle.getElements().add(moveTo);

		LineTo lineto = new LineTo();
		lineto.setX(0.0);
		lineto.setY(0.0);
		triangle.getElements().add(lineto);
		triangle.setStroke(Color.BLACK);

		return triangle;
	}

	public Rectangle makehole() {
		Rectangle _nose = new Rectangle();
		_nose.setX(-0.75);
		_nose.setY(0.0);
		_nose.setWidth(1.5);
		_nose.setHeight(1.5);
		_nose.setFill(Color.BLACK);
		return _nose;
	}
}
