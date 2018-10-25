package comp110.lecture05;

import comp110.Console;

public class Sakai {

	public static void main(String[] args) {

		Console console = new Console();

		// The following if-then statements are independent of each other because:
		// 1. Not nested in any then-block or else-block
		// 2. Not conjoined by else-if (another way of saying not nested in an else)

		// The practical implications here are only *all* of the following then
		// blocks could be printed and each of the three test conditions will
		// *always* be evaluated.

		if (console.confirm("Do you want to stay logged into Sakai?")) {
			console.print("You're clearly not feeling well. We're logging you out.");
		}

		if (console.confirm("Do you really want to stay logged in?")) {
			console.print("OK we'll keep you logged in for like 0.0001 seconds longer.");
		}

		if (console.confirm("R U SURE you want to stay logged in?")) {
			console.print("Sorry, we already logged you out.");
		}

		console.print("=== LOGGED OUT OF SAKAI ===");

	}

}
