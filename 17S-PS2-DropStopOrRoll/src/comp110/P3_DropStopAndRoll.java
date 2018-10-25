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
public class P3_DropStopAndRoll {

	public static void main(String[] args) {

		Console console = new Console("Drop, Stop, or Roll");
		console.speed(0.5);

		Die die = new Die();
		console.print("Welcome to Drop, Stop, or Roll");

		// Do not change the code above. Begin your work after this comment.
		int score = console.promptInt("What are you playing to?");

		int sum = 0;
		int sum2 = 0;
		int turn = 0;
		int turn2 = 0;
		int round = 0;
		while (sum < score && sum2 < score) {
			round++;
			console.print("Round " + round);
			// how to edit games score
			if (sum2 == sum) {
				console.print("The game is tied " + sum + " to " + sum2);
			} else if (sum2 > sum) {
				console.print("Player 2 leads " + sum2 + " to " + sum);
			} else if (sum > sum2) {
				console.print("Player 1 leads " + sum + " to " + sum2);
			}

			console.alert("Player 1: Press OK to begin your turn.");

			boolean rolling = true;
			// player 1
			while (rolling) {
				die.roll();
				int value = die.getValue();

				if (value > 1) {
					turn += value;
					sum += value;
					console.print("Player 1: You rolled a " + value);
					console.print("Player 1: Your turn score is " + turn);
					String roll = console.promptString("Player 1: Roll or Stop?");

					if (roll.equalsIgnoreCase("stop")) {
						rolling = false;
						console.print("Player 1: Total score is " + sum);
						turn = 0;
					}

				} else {
					console.print("Player 1: You rolled a 1");
					console.print("Player 1: You DROPPED this turn's points!");
					console.print("Player 1: Total score is " + sum);
					rolling = false;
					turn = 0;
				}
			}
			// player 2 change variables (sum2 / turn2)
			console.alert("Player 2: Press OK to begin your turn.");
			boolean rolling2 = true;
			while (rolling2) {
				die.roll();
				int value2 = die.getValue();

				if (value2 > 1) {
					turn2 += value2;
					sum2 += value2;
					console.print("Player 2: You rolled a " + value2);
					console.print("Player 2: Your turn score is " + turn2);
					String roll = console.promptString("Player 2: Roll or Stop?");

					if (roll.equalsIgnoreCase("stop")) {
						rolling2 = false;
						console.print("Player 2: Total score is " + sum2);
						turn2 = 0;
					}

				} else {
					console.print("Player 2: You rolled a 1");
					console.print("Player 2: You DROPPED your points!");
					console.print("Player 2: Total score is " + sum2);
					rolling2 = false;
					turn2 = 0;
				}
			}
			if (score <= sum || score <= sum2) {
				if (sum < sum2) {
					console.print("Player 2 wins " + sum2 + " to " + sum);
				} else {
					console.print("Player 1 wins " + sum + " to " + sum2);
				}
			}
		}
	}
}
