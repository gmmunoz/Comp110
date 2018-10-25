package comp110.lecture28;

import comp110.lecture28.engine.GameGUI;

public class GameRunner {

  public static void main(String[] args) {

    GameGUI gameGUI = new GameGUI();
    gameGUI.addGameClass(Sumo.class);
    gameGUI.addGameClass(KeepAway.class);

    // Challenge: Try coming up with your own bumper game and adding it here.

    gameGUI.run();

  }

}
