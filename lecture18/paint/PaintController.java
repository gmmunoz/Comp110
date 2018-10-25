package comp110.lecture18.paint;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class PaintController {

	// Controls
	@FXML
	private Pane _canvas;

	@FXML
	private Rectangle _red, _orange, _yellow, _green, _blue, _indigo, _violet;

	@FXML
	private Slider _size;

	// Fields

	// TODO: Use a single field of type Brush
	private Brush _brush;
	private SquaresBrush _squaresBrush;

	private Paint _paint;
	private boolean _circlesMode;

	/**
	 * JavaFX will call a Controller's initialize method, if it exists, *after*
	 * it binds the View with the Controller.
	 */
	public void initialize() {
		_paint = _red.getFill();
		_brush = new CirclesBrush();
	}

	/**
	 * The paint method is called every time the mouse is clicked and dragged in
	 * the black canvas area.
	 */
	public void paint(MouseEvent event) {
		Group shapes;

		// TODO: Avoid hard coding the exact brushes we can use!
		_brush.setFill(_paint);
		_brush.setSize(_size.getValue());
		shapes = _brush.shapes();

		shapes.setTranslateX(event.getX());
		shapes.setTranslateY(event.getY());

		_canvas.getChildren().add(shapes);
	}

	// Brush Selection Event Handlers
	public void clickCirclesBrush() {
		_brush = new CirclesBrush();
	}

	public void clickSquareBrush() {
		_brush = new SquaresBrush();
	}

	public void clickRandomBrush() {
		_brush = new RandomBrush();
	}

	// Paint Color Selection Event Handlers
	public void clickRed() {
		_paint = _red.getFill();
	}

	public void clickOrange() {
		_paint = _orange.getFill();
	}

	public void clickYellow() {
		_paint = _yellow.getFill();
	}

	public void clickGreen() {
		_paint = _green.getFill();
	}

	public void clickBlue() {
		_paint = _blue.getFill();
	}

	public void clickIndigo() {
		_paint = _indigo.getFill();
	}

	public void clickViolet() {
		_paint = _violet.getFill();
	}

}
