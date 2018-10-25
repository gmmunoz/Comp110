package comp110.lecture09;

import comp110.Console;

public class Instances {

	public static void main(String[] args) {

		// Construct one instance of the Console class and assign it
		// to a variable named console.
		Console console = new Console("Console instance console");
		console.print("I'm console");

		// Construct another instance of the Console class and assign it
		// to a variable named anotherConsole.
		Console anotherConsole = new Console("Console instance anotherConsole");
		anotherConsole.print("I'm anotherConsole");

		String name = console.promptString("What is your name?");

		// TODO: Print "Hello, <name>" in the anotherConsole instance
		anotherConsole.print("Hello, " + name);

	}

}
