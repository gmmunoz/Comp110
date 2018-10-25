package comp110.lecture18.paint;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

//Notice this class implements the Brush interface
public class CirclesBrush implements Brush {

    // Fields
    private double _size;

    private Paint _fill;

    // Constructor
    public CirclesBrush() {
        _size = 0.0;
        _fill = Color.TRANSPARENT;
    }

    // Methods - Note these are required by the Brush interface
    public Group shapes() {
        Group group = new Group();

        Circle circle = new Circle();
        circle.setRadius(_size);
        circle.setFill(_fill);
        circle.setOpacity(0.2);
        group.getChildren().add(circle);

        return group;
    }

    public void setSize(double size) {
        _size = size;
    }

    public void setFill(Paint paint) {
        _fill = paint;
    }

}
