package comp110.lecture17;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class TearsController {

	// Fields
	@FXML
	private Group _group;

	@FXML
	private Slider _size;

	private Circle _tear;

	// Methods
	public void handleClick(MouseEvent event) {
		_tear = new Circle();
		_tear.setFill(Color.CORNFLOWERBLUE);
		_tear.setCenterX(event.getX());
		_tear.setCenterY(event.getY());
		_tear.setRadius(3.0 + _size.getValue() * 10);
		_tear.setOpacity(0.75);
		_group.getChildren().add(_tear);
	}

	public void changeSize() {
		if (_tear != null) {
			_tear.setRadius(3.0 + _size.getValue() * 10);
		}
	}
}