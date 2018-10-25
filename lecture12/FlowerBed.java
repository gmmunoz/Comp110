package comp110.lecture12;

import comp110.Canvas;
import javafx.scene.paint.Color;

public class FlowerBed {

	public static void main(String[] args) {
		// class name = comp110
		comp110.Canvas canvas = new Canvas();

		for (int i = 0; i < 0; i++) {
			Flower flower = new Flower();
			flower.setPetals(8);
			flower.setColor(Color.BLUE);
			flower.setX(i * 20.0);
			canvas.draw(flower.getShapes());

		}
	}
}