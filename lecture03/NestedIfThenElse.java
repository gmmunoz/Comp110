package comp110.lecture03;

import comp110.Console;

public class NestedIfThenElse {

	public static void main(String[] args) {

		Console console = new Console("Nested if-then-else Statements");

		int answer = 5; // TODO: Change this number

		int guess = console.promptInt("Guess a number between 1 and 10");

		if (guess == answer) {
			console.print("You guessed it!");
		} else {
			// TODO: Add nested if-then-else statement here
		}
		if (guess > answer) {
			console.print("Guess lower...");
		}
		if (guess < answer) {
			console.print("Guess higher...");
		}
		console.print("Game over.");

	}

}
