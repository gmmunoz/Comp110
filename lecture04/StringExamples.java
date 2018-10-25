package comp110.lecture04;

import comp110.Console;

public class StringExamples {

  public static void main(String[] args) {

    Console console = new Console("String Method Examples");
    console.speed(0.6);

    while (true) {

      String choice = console.promptString("Input String");

      // TODO: Example Method Calls
      console.print(choice.toUpperCase());

    }

  }

}