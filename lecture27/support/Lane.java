package comp110.lecture27.support;

import java.util.ArrayList;

import comp110.lecture27.Sample;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class Lane {

  private Sample           _person;
  private Rectangle        _sampleSlot;
  private Group            _well;
  private Label            _name;
  private ArrayList<Band>  _bands;

  private static final int LANE_WIDTH  = 100;
  private static final int LANE_HEIGHT = 20;

  public Lane(Sample person) {
    _person = person;
    _sampleSlot = new Rectangle(LANE_WIDTH, LANE_HEIGHT);
    _sampleSlot.setFill(Color.DARKGRAY);
    _sampleSlot.setStroke(Color.LIGHTGRAY);
    _sampleSlot.setLayoutX(0);
    _sampleSlot.setLayoutY(15);

    String name = person.toString().split("/")[person.toString().split("/").length - 1];
    //now trim off file extension
    name = name.substring(0, name.length() - 4);
    _name = new Label(name);
    _name.setFont(Font.font("Consolas"));
    _name.setPrefWidth(LANE_WIDTH);
    _name.setLayoutX(0);
    _name.setLayoutY(0);
    _name.setAlignment(Pos.CENTER); // hack

    _well = new Group();
    _well.getChildren().add(_name);
    _well.getChildren().add(_sampleSlot);

    _bands = new ArrayList<Band>();
    for (String a : person.getAlleles()) { // importing data and drawing shapes
      _bands.add(new Band(a));
    }
  }

  public Group getWell() {
    return this._well;
  }

  public ArrayList<Band> getBands() {
    return this._bands;
  }

}
