package comp110.lecture06;

import comp110.Console;

public class ArraySyntax {

	public static void main(String[] args) {
		Console console = new Console("Array Syntax");

		// 1. Array Declaration & Construction
		String[] words = new String[3];

		// 2. Access # of elements in an array with the array's length field
		console.print(words.length);

		// 3. Element Initialization / Assignment
		words[0] = "COMP";
		words[1] = "is";
		words[2] = "AMAZING";

		// 4. Element Access
		console.print("words[0]: " + words[0]);
		console.print("words[1]: " + words[1]);
		console.print("words[2] " + words[2]);

	}

}
