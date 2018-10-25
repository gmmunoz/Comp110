package comp110.lecture28;

import comp110.lecture28.engine.BumperGame;
import comp110.lecture28.engine.CollisionHandler;
import comp110.lecture28.engine.GameEngine;
import comp110.lecture28.engine.KeyboardHandler;
import comp110.lecture28.engine.TimeTickHandler;
import comp110.lecture28.events.KeyboardEvent;
import comp110.lecture28.events.TimeTickEvent;
import comp110.lecture28.events.CollisionEvent;
import comp110.lecture28.pieces.Ship;

import javafx.scene.paint.Color;

public class Sumo implements BumperGame, KeyboardHandler, CollisionHandler {

  /*
   * First we're declaring two Ship fields.
   */
  private Ship _homeShip, _awayShip;

  /*
   * We're declaring an instance variable to hold a reference to the game engine. We'll need this to stop the game once
   * there is a winner.
   */
  private GameEngine _gameEngine;

  /*
   * Constructor: initialize our instance variables
   */
  public Sumo() {
    // TODO: 1.1 Initialize ships.
    _homeShip = new Ship(Color.BLUE, 4.0, 15.0, 30.0, 90.0);
    _awayShip = new Ship(Color.RED, 4.0, 45.0, 30.0, 90.0);
  }

  /* Methods */

  public void setup(GameEngine gameEngine) {
    _gameEngine = gameEngine;
    _gameEngine.addPiece(_homeShip);
    _gameEngine.addPiece(_awayShip);
  }

  public Ship getHomeShip() {
    return _homeShip;
  }

  public Ship getAwayShip() {
    return _awayShip;
  }

  public void handleKeyPressed(KeyboardEvent event) {
    String key = event.getKey();
    if (key.equals("UP")) {
      _homeShip.setThrust(1.0);
    } else if (key.equals("DOWN")) {
      _homeShip.setThrust(-1.0);
    } else if (key.equals("RIGHT")) {
      _homeShip.setTorque(1.0);
    } else if (key.equals("LEFT")) {
      _homeShip.setTorque(-1.0);
    } else if (key.equals("W")) {
      _awayShip.setThrust(1.0);
    } else if (key.equals("S")) {
      _awayShip.setThrust(1.0);
    } else if (key.equals("A")) {
      _awayShip.setTorque(-1.0);
    } else if (key.equals("D")) {
      _awayShip.setTorque(1.0);
    }
  }

  public void handleKeyReleased(KeyboardEvent event) {
    String key = event.getKey();
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

  @Override
  public void handleCollision(CollisionEvent collision) {
    if (collision.getA().equals(_gameEngine.getWall()) && collision.getB().equals(_homeShip)) {
      _awayShip.setScore(1.0);
      _gameEngine.stop();
    } else if (collision.getA().equals(_gameEngine.getWall()) && collision.getB().equals(_awayShip)) {
      _homeShip.setScore(1.0);
      _gameEngine.stop();
    }
  }

}