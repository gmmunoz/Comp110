package comp110.lecture28;

import comp110.lecture28.engine.BumperGame;
import comp110.lecture28.engine.CollisionHandler;
import comp110.lecture28.engine.GameEngine;
import comp110.lecture28.engine.KeyboardHandler;
import comp110.lecture28.engine.TimeTickHandler;
import comp110.lecture28.events.KeyboardEvent;
import comp110.lecture28.events.TimeTickEvent;
import comp110.lecture28.events.CollisionEvent;
import comp110.lecture28.pieces.Piece;
import comp110.lecture28.pieces.Puck;
import comp110.lecture28.pieces.Ship;

import javafx.scene.paint.Color;

public class KeepAway implements BumperGame, KeyboardHandler, CollisionHandler, TimeTickHandler {
	// fields
	private Ship _homeShip, _awayShip;
	private Puck _puck;
	private Ship _possession;
	private GameEngine _gameEngine;

	// constructor
	public KeepAway() {
		_homeShip = new Ship(Color.BLUE, 4.0, 15.0, 30.0, 0.0);
		_awayShip = new Ship(Color.RED, 4.0, 45.0, 30.0, 180.0);
		_possession = null;
		_puck = new Puck(30.0, 30.0, Color.BLACK);
	}

	// methods
	public void setup(GameEngine gameEngine) {
		_gameEngine = gameEngine;
		// TODO: Add the pieces to the game engine.
		_gameEngine.addPiece(_awayShip);
		_gameEngine.addPiece(_homeShip);
		_gameEngine.addPiece(_puck);

	}

	public Ship getHomeShip() {
		return _homeShip;
	}

	public Ship getAwayShip() {
		return _awayShip;
	}

	public void handleKeyPressed(KeyboardEvent event) {
		String key = event.getKey();
		// TODO: Move the pieces around.
		System.out.println(key);
		_homeShip.setThrust(1.0);
		_awayShip.setTorque(1.0);
		if (key.equals("UP") || key.equals("W")) {
			_homeShip.setThrust(1.0);
		} else if (key.equals("RIGHT") || key.equals("D")) {
			_homeShip.setTorque(1.0);
		} else if (key.equals("DOWN") || key.equals("S")) {
			_awayShip.setThrust(-1.0);
		} else if (key.equals("LEFT") || key.equals("A")) {
			_awayShip.setTorque(-1.0);
		}

	}

	public void handleKeyReleased(KeyboardEvent event) {
		String key = event.getKey();
		// We're providing the code to stop thrusting/torquing to avoid
		// more repetitive typing in class -- but this should make sense!
		if (key.equals("UP") || key.equals("DOWN")) {
			_homeShip.setThrust(0.0);
		} else if (key.equals("LEFT") || key.equals("RIGHT")) {
			_homeShip.setTorque(0.0);
		} else if (key.equals("W") || key.equals("S")) {
			_awayShip.setThrust(0.0);
		} else if (key.equals("A") || key.equals("D")) {
			_awayShip.setTorque(0.0);
		}
	}

	public void handleCollision(CollisionEvent collision) {
		Piece a = collision.getA();
		Piece b = collision.getB();

		// TODO: Assign possession
		if (a.equals(_homeShip) && b.equals(_puck)) {
			_possession = _homeShip;
		} else if (a.equals(_awayShip) && b.equals(_puck)) {
			_possession = _awayShip;
		}
	}

	// This method is called many times per second
	public void handleTick(TimeTickEvent tick) {

		double timeElapsed = tick.getTime();

		if (_possession != null) {
			_puck.setColor(_possession.getColor());

			// TODO: Keep track of score
			if (_possession == _homeShip) {
				_homeShip.setScore(_homeShip.getScore() + timeElapsed);
			} else {
				_awayShip.setScore(_awayShip.getScore() + timeElapsed);

				// TODO: Game Over
				if (_awayShip.getScore() >= 10 || _homeShip.getScore() >= 10) {
					_gameEngine.stop();
				}

			}

		}

	}
}