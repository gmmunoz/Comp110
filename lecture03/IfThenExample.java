package comp110.lecture03;

import comp110.Console;

public class IfThenExample {

	public static void main(String[] args) {

		Console console = new Console("if-then Example");

		int age = console.promptInt("How old are you?");

		console.print("Thursday's plan...");

		if (age >= 18) {
			console.print("buy lotto");
			console.print("get cigs");
		}
		if (age <= 18) {
			console.print("go to movies");
			console.print("buy ice cream");
		}
		console.print("The end.");
	}

}
