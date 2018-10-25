package comp110.lecture05;

import java.util.Random;

import comp110.Console;

public class Magic8BallFinal {

  public static void main(String[] args) {

    Console console = new Console("Magic 8 Ball");
    console.speed(0.5);

    Random random = new Random();

    boolean playing = true;
    while (playing) {

      String question = console.promptString("Ask a yes or no question.");

      int n = console.promptInt("How many shakes?");
      int i = 0;
      while (i < n) {
        console.print("Shaking...");
        i = i + 1;
      }

      int answer = random.nextInt(5);
      if (answer == 0) {
        console.print("It is certain");
      } else if (answer == 1) {
        console.print("Without a doubt");
      } else if (answer == 2) {
        console.print("Most likely");
      } else if (answer == 3) {
        console.print("Reply hazy try again");
      } else if (answer == 4) {
        console.print("Don't count on it");
      } else {
        console.print("Very doubtful");
      }

      playing = console.confirm("Ask another question?");

    }

    console.print("Peace.");

  }

}
