package comp110.lecture04;

import comp110.Console;

public class MoodBooster {

  public static void main(String[] args) {

    Console console = new Console("To Inifinity and Beyond");
    console.speed(1.0);

    int i = 0;
    while (true) {
      console.print("You're just the best! I love you. <3 Laptop " + i);
      i = i + 1;
    }

  }

}
