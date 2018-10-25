package comp110.lecture11;

import comp110.Console;

public class Twitter {

	private Console _console;

	public Twitter() {
		_console = new Console("Creed's Twitter");
		_console.print("Welcome to @TheRealCreedBratton's Twitter");
	}

	public void post(Tweet t) {
		_console.print(t);
	}

}