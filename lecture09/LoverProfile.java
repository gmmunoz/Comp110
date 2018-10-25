package comp110.lecture09;

// Class Declaration
public class LoverProfile {
	// Class Definition

	// fields = code below
	private String _name;
	private int _age;
	private boolean _UNClove;

	// constructor
	public LoverProfile() {
		Console console = new Console();
		console.alert("Constructor!");
		_name = console.promptString("What is your name?");
		_age = console.promptInt("How old are you?");
		_UNClove = console.promptBoolean("Love UNC?");
		console.close();
	}

	// methods
	public String getName() {
		// method definition above
		return _name;

	}

	public boolean isLover() {
		int myAge = 18;
		boolean oldEnough = _age > myAge / 2 + 7;
		return oldEnough && _UNClove;

	}

}
