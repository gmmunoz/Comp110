package comp110.lecture13;

import javafx.scene.Group;
import javafx.scene.shape.Circle;

public class Carton {

	private Egg[] _eggs;

	public Carton() {
		_eggs = new Egg[12];

		// TODO: Initialize our _eggs!
		for (int i = 0; i < _eggs.length; i++)
			_eggs[i] = new Egg();
	}

	public int size() {
		return _eggs.length;
	}

	// Take an egg out of the carton
	public Egg takeEgg(int i) {
		Egg selected = _eggs[i];
		_eggs[i] = null;
		return selected;
	}

	public void setEgg(int i, Egg egg) {
		_eggs[i] = egg;
	}

	public int remaining() {
		int count = 0;
		for (int i = 0; i < _eggs.length; i++) {
			if (_eggs[i] != null) {
				count++;
			}
		}
		return count;
	}

	public Group getShapes() {
		Group eggs = new Group();

		for (int i = 0; i < _eggs.length; i++) {
			if (_eggs[i] != null) {
				Circle shape = _eggs[i].getShape();
				double x = (i) * (2 * shape.getRadius() + 10.0);
				double y = 0.0;
				shape.setCenterX(x);
				shape.setCenterY(y);

				eggs.getChildren().add(shape);
			}
		}

		return eggs;
	}

}
