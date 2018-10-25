package comp110.lecture20;

import javafx.application.Application;
import javafx.stage.Stage;

public class TeamApp extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    public void start(Stage stage) {
        TeamWindow window = new TeamWindow();
    }

}
