package comp110.lecture03;

import comp110.Console;

public class IfThenElseExample {

	public static void main(String[] args) {

		Console console = new Console("if-then-else Example");

		console.print("Which is the lie?");
		// TODO: Fill in your two truths and a lie here
		console.print("1. I have an identical twin sister. ");
		console.print("2. I'm a comp sci major.");
		console.print("3. I speak french and spanish.");
		int correct = 2; // TODO: Change this to be the correct answer

		int guess = console.promptInt("Your guess:");

		// TODO: Add an else block to this if-then statement that tells
		// your friend they are wrong.
		if (guess == correct) {
			console.print("YOU GOT IT!");
		} else {
			console.print("WRONG");
		}

		console.print("Game over.");

	}

}