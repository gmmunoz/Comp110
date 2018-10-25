package comp110.lecture17;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class DidDukeWinController {

	// Fields
	private boolean _revealed;
	@FXML
	private Label _answer;

	// Controller
	public DidDukeWinController() {
		_revealed = false;
	}

	// Methods
	public void handleClick() {
		_answer.setText("NO!!!");
		_answer.setTextFill(Color.DARKBLUE);
	}
}