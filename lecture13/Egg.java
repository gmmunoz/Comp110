package comp110.lecture13;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Egg {

    private boolean _raw;

    public Egg() {
        _raw = true;
    }

    public void boil() {
        _raw = false;
    }

    public boolean isRaw() {
        return _raw;
    }

    public Circle getShape() {
        Circle egg = new Circle();
        egg.setRadius(5.0);
        egg.setFill(Color.ANTIQUEWHITE);
        return egg;
    }

    public String toString() {
        if (_raw) {
            return "The egg is raw.";
        } else {
            return "The egg is hard boiled.";
        }
    }

}