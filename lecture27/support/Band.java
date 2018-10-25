package comp110.lecture27.support;

import javafx.animation.TranslateTransition;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Band {

  private double              _distanceToTravel;          // this is a function
                                                          // of the allele's
                                                          // length
  private Rectangle           _band;
  private TranslateTransition _transition;

  private static final int    BAND_WIDTH          = 100;
  private static final int    BAND_HEIGHT         = 2;
  private static final int    TRAVEL_DISTANCE_MIN = 50;
  private static final int    TRAVEL_DISTANCE_MAX = 980;
  private static final int    ANIMATION_TIME      = 10000;
  // must be updated each time you regenerate the files
  private static final int    MIN_SEQUENCE_LENGTH = 1543;
  private static final int    MAX_SEQUENCE_LENGTH = 12;

  public Band(String a) {

    // we want to "reverse" the order such that the shortest travel the longest
    // distance
    _distanceToTravel = TRAVEL_DISTANCE_MAX - this.computeDistance(a.length()) + TRAVEL_DISTANCE_MIN;
    _band = new Rectangle(BAND_WIDTH, BAND_HEIGHT);
    _transition = new TranslateTransition(Duration.millis(ANIMATION_TIME), _band);

    // System.out.println(a.getSequence().length());
  }

  public double getDistanceToTravel() {
    return this._distanceToTravel;
  }

  public Rectangle getBand() {
    return this._band;
  }

  public TranslateTransition getTranistion() {
    return this._transition;
  }

  // http://stackoverflow.com/questions/929103/convert-a-number-range-to-another-range-maintaining-ratio
  private double computeDistance(int sequenceLength) {
    int oldRange = (MAX_SEQUENCE_LENGTH - MIN_SEQUENCE_LENGTH);
    int newRange = (TRAVEL_DISTANCE_MAX - TRAVEL_DISTANCE_MIN);
    int newValue = (((sequenceLength - MIN_SEQUENCE_LENGTH) * newRange) / oldRange) + TRAVEL_DISTANCE_MIN;
    return newValue;
  }

}
