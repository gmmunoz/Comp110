package comp110.lecture18.paint;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

// Notice this class implements the Brush interface
public class SquaresBrush implements Brush {

    // Fields
    private double _size;

    private Paint _fill;

    // Constructor
    public SquaresBrush() {
        _size = 0.0;
        _fill = Color.TRANSPARENT;
    }

    // Methods - Note these are required by the Brush interface
    public Group shapes() {
        Group group = new Group();

        Rectangle square = new Rectangle();
        square.setHeight(_size * 2.0);
        square.setWidth(_size * 2.0);
        square.setX(-_size);
        square.setY(-_size);
        square.setFill(_fill);
        square.setOpacity(0.2);
        group.getChildren().add(square);

        return group;
    }

    public void setSize(double size) {
        _size = size;
    }

    public void setFill(Paint fill) {
        _fill = fill;
    }

}
