package comp110.lecture05;

import comp110.Console;

public class Scope {

	public static void main(String[] args) {

		Console console = new Console();

		int a = console.promptInt();
		if (a == 0) {
			a = 1;
		}
		console.print(a);

	}

}
