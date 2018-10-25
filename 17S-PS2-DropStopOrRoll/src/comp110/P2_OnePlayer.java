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
public class P2_OnePlayer {

	public static void main(String[] args) {

		Console console = new Console("One Player Drop, StopNLock, or Roll");
		console.speed(0.5);

		Die die = new Die();

		console.print("Welcome to One Player Drop, Stop, or Roll");

		// Do not change the code above. Begin your work after this comment.

		int score = console.promptInt("What are you playing to?");

		int sum = 0;
		int turn = 0;
		int round = 0;
		while (sum < score) {
			turn = 0;
			round++;
			console.print("Round " + round);
			console.alert("Press OK to begin your turn.");

			boolean rolling = true;
			while (rolling) {
				die.roll();
				int value = die.getValue();

				if (value > 1) {
					turn += value;
					sum += value;
					console.print("You rolled a " + value);
					console.print("Your turn score is " + turn);
					String roll = console.promptString("Roll or Stop?");

					if (roll.equalsIgnoreCase("stop")) {
						rolling = false;
						// turn = 0;
						console.print("Total score is " + sum);
					}

				} else {
					console.print("You rolled a 1");
					console.print("You DROPPED your points!");
					console.print("Total score is " + 0);
					rolling = false;
					turn = 0;
					sum = 0;

				}

			}

		}
		console.print("You won in " + round + " rounds with " + sum + " points!");

	}
}