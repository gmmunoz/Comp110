package comp110.lecture18.paint;

import java.util.Random;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

//Notice this class implements the Brush interface
public class RandomBrush implements Brush {

    // Fields
    private double _size;

    private Paint _fill;

    // Constructor
    public RandomBrush() {
        _size = 0.0;
        _fill = Color.TRANSPARENT;
    }

    // Methods - Note these are required by the Brush interface
    public Group shapes() {
        Group g = new Group();
        Random random = new Random();

        for (int i = 0; i <= random.nextInt(9); i++) {
            Rectangle r = new Rectangle();
            r.setHeight(_size + _size * random.nextDouble());
            r.setWidth(_size + _size * random.nextDouble());
            r.setX(-r.getWidth() * random.nextDouble());
            r.setY(-r.getHeight() * random.nextDouble());
            r.setFill(_fill);
            r.setOpacity(0.2);
            r.setRotate(random.nextDouble() * 180.0);
            g.getChildren().add(r);
        }

        return g;
    }

    public void setSize(double size) {
        _size = size;
    }

    public void setFill(Paint fill) {
        _fill = fill;
    }

}
