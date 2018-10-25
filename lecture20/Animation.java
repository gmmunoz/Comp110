package comp110.lecture20;

import java.util.List;

import comp110.Canvas;
import comp110.lecture19.Player;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * This class generates a bar chart of a list of Players based on their
 * efficiency.
 */
public class Animation {

	private List<Player> _team;

	private Canvas _canvas;

	public Animation(List<Player> team) {
		_team = team;
		_canvas = new Canvas();
		_canvas.speed(0.5);
	}

	public void animate(int current) {
		_canvas.clear();
		Group g = new Group();
		for (int i = 0; i < _team.size(); i++) {
			Player player = _team.get(i);

			// Each rectangle will be 100 units wide and between 0 and 1000
			// units
			// tall representing efficiency
			double barHeight = player.efficiency() * 1000.0;
			Rectangle r = new Rectangle(100.0, barHeight);
			if (i == current) {
				r.setFill(Color.WHITESMOKE);
			} else {
				r.setFill(Color.CORNFLOWERBLUE);
			}
			// We will position each rectangle
			r.setX(i * 150.0);
			r.setY(1000.0 - barHeight); // Flip along Y-axis
			g.getChildren().add(r);

			Text label = new Text(i * 150.0, 1032.0, player.getName());
			label.setFill(Color.WHITE);
			label.setFont(new Font(32.0));
			g.getChildren().add(label);

		}
		_canvas.draw(g);
	}

}
