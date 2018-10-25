package comp110.lecture12;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo;
import javafx.scene.shape.Circle;

public class Flower {

	// Fields
	private int _petals;
	private Color _color;
	private double _x;

	// Constructor
	public Flower() {
		_petals = 8;
		_color = Color.RED;
		_x = 0.0;
	}

	// Getter and Setter Methods
	public void setPetals(int petals) {
		_petals = petals;
	}

	public int getPetals() {
		return _petals;
	}

	public void setColor(Color color) {
		_color = color;
	}

	public Color getColor() {
		return _color;
	}

	public void setX(double x) {
		_x = x;
	}

	public double getX() {
		return _x;
	}

	public Group getShapes() {
		Group shapes = new Group();

		shapes.getChildren().add(this.makeStem());

		// Add petals
		for (int i = 0; i < _petals / 2; i++) {
			Ellipse petal = this.makePetal();
			petal.setRotate(180.0 / (_petals / 2) * i);
			shapes.getChildren().add(petal);
		}

		// TODO: Add the stamen
		shapes.getChildren().add(this.makeStamen());

		// Move the group along the x axis based on the _x field
		shapes.setTranslateX(_x);

		return shapes;
	}

	// TODO: declare and define a makeStamen method
	public Circle makeStamen() {
		Circle stamen = new Circle();
		stamen.setRadius(10.0);
		stamen.setStroke(Color.YELLOW);
		return stamen;
	}

	public Ellipse makePetal() {
		Ellipse petal = new Ellipse();
		petal.setRadiusX(20.0);
		petal.setRadiusY(5.0);
		petal.setFill(_color);
		return petal;
	}

	public Path makeStem() {
		Path stem = new Path();

		// A Path is made up of PathElements
		// For more checkout:
		// https://docs.oracle.com/javase/8/javafx/api/javafx/scene/shape/Path.html
		MoveTo moveTo = new MoveTo();
		moveTo.setX(0.0);
		moveTo.setY(0.0);
		stem.getElements().add(moveTo);

		QuadCurveTo curve = new QuadCurveTo();
		curve.setX(0.0);
		curve.setY(40.0);
		curve.setControlX(5.0);
		curve.setControlY(20.0);
		stem.getElements().add(curve);
		stem.setStroke(Color.GREEN);

		return stem;
	}

}