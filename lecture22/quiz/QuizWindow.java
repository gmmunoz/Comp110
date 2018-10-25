package comp110.lecture22.quiz;

import java.io.IOException;

import comp110.lecture21.spellcheck.SpellCheckController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class QuizWindow {

	public QuizWindow(QuizModel model) {
		try {
			// Setup a Controller and some variables that plug-in to the
			// boilerplate below
			QuizController controller = new QuizController();
			String viewFile = "QuizView.fxml";
			String windowTitle = "COMPFeed Quiz";
			// Setup the View's FXML Loader
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource(viewFile));
			loader.setController(controller);
			// Show the window
			Stage stage = new Stage();
			stage.setScene(new Scene(loader.load()));
			stage.setTitle(windowTitle);
			stage.show();
			controller.setQuiz(model);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
