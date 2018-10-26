package comp110.chat.client;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ChatController {
	private String _onyen;
	private Coordinator _coordinator;

	@FXML
	private TextField _text;

	@FXML
	private ListView<String> _history;

	public ChatController(String onyen, Coordinator coordinator) {
		_onyen = onyen;
		_coordinator = coordinator;
	}

	public void send() {
		_coordinator.send(_onyen, _text.getText());
		_text.clear();
	}

	public void addHistory(String message) {
		_history.getItems().add(message);
		_history.scrollTo(_history.getItems().size() - 1);
	}
}
