package comp110;

import comp110.toys.Die;

// This is just a demo file. You do not need to change this
// or add your ONYEN.
public class P0_RollDemo {

	public static void main(String[] args) {

		// Here we declare & initialize a console to handle our input & output
		Console console = new Console("Die Roll Demo");
		console.speed(0.5);

		// Here we declare & initialize a Dice to play with
		Die die = new Die();

		// Welcome Users to the Game
		console.print("Dice Rolling Demo");

		// Notice an "alert" sends a message to the user and waits
		// for them to press OK before continuing.
		console.alert("Press OK to Roll");

		// Here is our Game Loop
		boolean rolling = true;
		while (rolling) {

			// Roll the die and get ("read") its value
			die.roll();
			int value = die.getValue();
			console.print(value);

			// Ask the user if they want to continue. Assign true/false
			// to the rolling variable based on what they input.
			int choice = console.promptInt("Enter 1 to roll again or any other # to quit.");
			rolling = choice == 1;

		}

		console.print("OK. Bye.");

	}

}