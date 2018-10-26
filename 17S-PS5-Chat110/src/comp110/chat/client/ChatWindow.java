package comp110.chat.client;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChatWindow {

	private Stage _stage;

	private ChatController _controller;

	public ChatWindow(String onyen, Coordinator dispatcher) {
		try {

			// Notice we're constructing the ChatController with the correct
			// parameters
			// We're also making the title of the window be based on the onyen
			_controller = new ChatController(onyen, dispatcher);
			String view = "ChatView.fxml";
			String title = onyen + " - Chat110";

			// Construct the FXML Loader
			FXMLLoader loader = new FXMLLoader(getClass().getResource(view));
			loader.setController(_controller);

			// Load the Scene
			Scene scene = new Scene(loader.load());

			// Setup the window
			_stage = new Stage();
			_stage.setScene(scene);
			_stage.setTitle(title);
			this.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Cause the Stage to appear (even after it's been closed!) and force it to
	 * be brought as the front window open.
	 */
	public void show() {
		_stage.show();
		_stage.toFront();
	}

	public void addHistory(String message) {
		_controller.addHistory(message);
	}
}
