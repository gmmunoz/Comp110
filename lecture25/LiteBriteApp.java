package comp110.lecture25;

import javafx.application.Application;
import javafx.stage.Stage;

public class LiteBriteApp extends Application {

  public static void main(String[] args) {
    Application.launch();
  }

  public void start(Stage s) {
    new LiteBriteWindow();
  }

}