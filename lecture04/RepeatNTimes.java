package comp110.lecture04;

import comp110.Console;

public class RepeatNTimes {

	public static void main(String[] args) {

		Console console = new Console("Repeat N Times Example");
		console.speed(0.5);

		int count = 0;

		// TODO: Change the while loop's test expression so that the
		// count print statement will print exactly 3 times.
		while (count < 3) {
			console.print("count: " + count);
			count = count + 1;
		}

		console.print("Done! count's final value is " + count);

	}

}