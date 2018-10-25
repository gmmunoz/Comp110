package comp110.lecture13;

import comp110.Canvas;
import comp110.Console;

public class GameRunner {

    public static void main(String[] args) {

        Canvas canvas = new Canvas();
        Console console = new Console();
        console.speed(0.5);

        // Initialize our Game
        int players = console.promptInt("How many players?");
        EggRoulette game = new EggRoulette(players);
        canvas.draw(game.getShapes());

        // Primary Game Loop
        while (!game.isGameOver()) {

            Egg selected = game.pick(console.promptInt("Which egg player " + game.getPlayer() + "?"));
            canvas.clear();
            canvas.draw(game.getShapes());

            if (selected == null) {
                console.print("That egg was selected. Turn lost.");
            } else {
                if (selected.isRaw()) {
                    console.print("Smash a raw egg on your head!");
                } else {
                    console.print("Hard boiled egg means you're safe.");
                }
            }

        }

        console.print("Game Over!");
        console.print("Player " + game.getLoser() + " loses!");

    }

}
