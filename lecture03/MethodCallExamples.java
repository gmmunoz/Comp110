package comp110.lecture03;

import comp110.Console;

public class MethodCallExamples {

	public static void main(String[] args) {

		Console objectA = new Console("Object A");
		Console objectB = new Console("Object B");

		objectA.print("Hello from the Console named objectA");
		objectB.print("Hello from the Console named objectB");

		String name = objectA.promptString("What is your name?");
		String greeting = "Welcome, " + name;

		// TODO: Print greeting String to Console named objectB
	}

}
