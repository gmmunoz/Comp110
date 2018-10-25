package comp110.lecture27.support;

import java.util.ArrayList;

import comp110.lecture27.PaternityTest;
import comp110.lecture27.Sample;
import comp110.lecture27.Study;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GUI extends Application {

  private static Study _study;
  private Stage                _stage;
  private Scene                _scene;
  private Group                _root;
  private Rectangle            _gel;
  private ArrayList<Lane>      _lanes;

  private static final int     LANE_OFFSET = 125;

  public static void initializeGUI(Study study) {
    _study = study;
    launch();
  }

  @Override
  public void start(Stage stage) throws Exception {
    _stage = stage;
    this.initializeScene();
    this.initializeGel();
    this.initializeStage();
    stage.show();
  }

  private Scene initializeScene() {
    _root = new Group();
    _scene = new Scene(_root);
    return _scene;
  }

  private void initializeStage() {
    _stage.setTitle("PSXX - Paternity Test");
    _stage.setScene(_scene);
    _stage.centerOnScreen();
    _stage.sizeToScene();
    _stage.setResizable(false);
    _stage.show();
  }

  private void initializeGel() {
    _gel = new Rectangle(500, 1000);
    _gel.setFill(Color.rgb(123, 175, 212));
    _root.getChildren().add(_gel);
    _lanes = new ArrayList<Lane>();
    for (Sample p : _study.getCandidates()) { // importing data into gui
      _lanes.add(new Lane(p));
    }
    _lanes.add(new Lane(_study.getSubject()));
    for (int i = 0; i < _lanes.size(); i++) {
      Group well = _lanes.get(i).getWell();
      well.setLayoutX(12.5); // we want it to be centered in a 125 wide space
                             // (500/4)
      well.setLayoutY(0);
      well.setTranslateX(LANE_OFFSET * i);
      _root.getChildren().add(well);

      for (Band b : _lanes.get(i).getBands()) { // adding bands to each lane
        b.getBand().setLayoutX(12.5);
        // b.getBand().setLayoutY(b.getDistanceToTravel());
        b.getBand().setTranslateX(LANE_OFFSET * i);

        // animation
        b.getTranistion().setFromY(25);
        b.getTranistion().setToY(b.getDistanceToTravel());

        _root.getChildren().add(b.getBand());
        // System.out.println(b.getDistanceToTravel());
        b.getTranistion().play();
      }
      // System.out.println("========================================");
    }
  }
}
