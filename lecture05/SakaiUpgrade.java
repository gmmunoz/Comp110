package comp110.lecture05;

import comp110.Console;

public class SakaiUpgrade {

	public static void main(String[] args) {

		Console console = new Console();

		// Notice in this example the ifs are connected via else statements.
		// In other words, each if is actually *nested* in the else-block of the
		// preceding if-then-else statement.

		// The practical implications here are only *one* of the following then
		// blocks can be printed and the test conditions will stop being checked
		// as soon as one is true.

		if (console.confirm("Do you want to stay logged into Sakai?")) {

			console.print("You're clearly not feeling well. We're logging you out.");

		} else if (console.confirm("Do you really want to stay logged in?")) {

			console.print("OK we'll keep you logged in for like 0.0001 seconds longer.");

		} else if (console.confirm("R U SURE you want to stay logged in?")) {

			console.print("Sorry, we already logged you out.");

		}

		console.print("=== LOGGED OUT OF SAKAI ===");

	}

}
