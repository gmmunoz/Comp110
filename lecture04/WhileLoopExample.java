package comp110.lecture04;

import comp110.Console;

public class WhileLoopExample {

	public static void main(String[] args) {

		Console console = new Console("While Loop Example");
		console.speed(0.5);

		// TODO: Write your while loop here.
		while (console.promptBoolean("You love me, true?")) {
			console.print("I love you too");
			console.print("we are getting married tomorrow!");
		}
		{
			console.print("My tiny computer heart is broken.");

		}
	}
}