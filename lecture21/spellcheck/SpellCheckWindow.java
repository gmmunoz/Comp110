package comp110.lecture21.spellcheck;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SpellCheckWindow {

	public SpellCheckWindow() {
		try {
			// Setup a Controller and some variables that plug-in to the
			// boilerplate below
			SpellCheckController controller = new SpellCheckController();
			String viewFile = "SpellCheckView.fxml";
			String windowTitle = "Spell Checker";
			// Setup the View's FXML Loader
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource(viewFile));
			loader.setController(controller);
			// Show the window
			Stage stage = new Stage();
			stage.setScene(new Scene(loader.load()));
			stage.setTitle(windowTitle);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
