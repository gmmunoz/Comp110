package comp110.lecture21.spellcheck;

import javafx.application.Application;
import javafx.stage.Stage;

public class SpellCheckApp extends Application {

	public static void main(String[] args) {
		Application.launch();
	}

	public void start(Stage stage) {
		new SpellCheckWindow();
	}

}
