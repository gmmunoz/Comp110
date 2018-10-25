package comp110.lecture06;

import comp110.Console;

public class WordEcho {

  public static void main(String[] args) {

    Console console = new Console();
    console.speed(0.5);

    int length = console.promptInt("How many words?");
    String[] words = new String[length]; // Notice # elements is not hard coded!

    // Assign words to successive elements
    int i = 0;
    while (i < words.length) {
      words[i] = console.promptString("words[" + i + "] = ");
      i = i + 1;
    }

    console.print("Echo...");

    // Repeat words back out in reverse order
    while (i > 0) {
      console.print(words[i - 1]); // Why: i - 1?
      i = i - 1;
    }

    console.print("Done.");

  }

}
