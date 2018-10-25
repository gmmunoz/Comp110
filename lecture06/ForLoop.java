package comp110.lecture06;

import comp110.Console;

public class ForLoop {

	public static void main(String[] args) {

		Console console = new Console("For Loop Conversion");

		// The following line illustrates array initialization shortcut syntax
		String[] words = new String[] { "hello", "world", "!!!" };

		console.print("while loop example:");
		int i = 10;
		while (i > 0) {
			console.print(i);
			i = i - 2;
		}

		// TODO: Write the above while loop as a for loop below
		for (int h = 0; h < words.length; h = h + 1) {
			console.print(words[h]);
		}
	}
}
