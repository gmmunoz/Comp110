package comp110;

import comp110.toys.Die;

/*
 * Author: <Gabriela Munoz>
 *
 * ONYEN: <gmmunoz>
 *
 * UNC Honor Pledge: I certify that no unauthorized assistance has been 
 * received or given in the completion of this work. I collaborated with
 * no one other than official COMP110 UTAs on this code.
 */
public class P1_OneTurn {

	public static void main(String[] args) {

		Console console = new Console("One Turn Drop, Stop, or Roll");
		console.speed(0.5);

		Die die = new Die();

		console.print("Welcome to One Turn Drop, Stop, and Roll");
		console.alert("Press OK to begin.");

		// Do not change the code above. Begin your work after this comment.
		int sum = 0;

		boolean rolling = true;
		while (rolling) {

			// Roll the die and get ("read") its value
			die.roll();
			int value = die.getValue();
			console.print("You rolled a " + value);
			sum = value + sum;

			// boolean equalsIgnoreCase(String); what does this symbolize

			if (value > 1) {
				console.print("Your turn score is " + sum);
				String roll = console.promptString("Roll or Stop?");
				if (roll.equalsIgnoreCase("stop")) {
					console.print("Your turn score is " + sum);
					rolling = false;
					console.print("Game Over");
				}

				// below this we are good

			} else {
				console.print("You DROPPED your points!");
				console.print("Your turn score is " + 0);
				rolling = false;
				console.print("Game Over");

			}
		}
	}
}
// if who wins