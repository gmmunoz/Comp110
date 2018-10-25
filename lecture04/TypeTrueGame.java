package comp110.lecture04;

import comp110.Console;
import comp110.memes.MemePhoto;

public class TypeTrueGame {

	public static void main(String[] args) {

		Console console = new Console("Type True Game");

		int count = 0;

		while (console.promptBoolean("Hurry! Type true!")) {

			// TODO: Increment the count variable by 1
			count = count + 1;
		}

		console.print("Your typed true " + count + " times.");

	}

}