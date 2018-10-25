package comp110.lecture20;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TeamWindow {

    public TeamWindow() {
        try {
            // Setup a Controller and some variables that plug-in to the boilerplate below
            TeamController controller = new TeamController();
            String viewFile = "TeamView.fxml";
            String windowTitle = "Team List Demo";
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
