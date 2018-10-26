package comp110.chat.client;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.List;

public class FriendsWindow {

	// Notice we will hold a reference to the FriendsController
	private FriendsController _controller;

	// Boilerplate for loading FXML bound to a Controller
	// TODO: You will need to tweak this so that the Controller is given a
	// reference
	// to the Coordinator.
	public FriendsWindow(Coordinator cord) {
		try {
			_controller = new FriendsController(cord);
			String view = "FriendsView.fxml";
			String title = "Chat110";

			// Construct the FXML Loader
			FXMLLoader loader = new FXMLLoader(getClass().getResource(view));
			loader.setController(_controller);

			// Load the Scene
			Scene scene = new Scene(loader.load());

			// Setup the window
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle(title);
			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void update(List<String> friends) {
		_controller.update(friends);
	}
}
