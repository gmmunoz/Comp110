package comp110.lecture18.paint;

import javafx.scene.Group;
import javafx.scene.paint.Paint;

public interface Brush {

    void setSize(double size);

    void setFill(Paint fill);

    Group shapes();

}
