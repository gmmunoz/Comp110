package comp110.lecture14;

public class Dook {

	public static void main(String[] args) {
		Dook game = new Dook();
		game.play(3);
	}

	// Fields
	// This class has more fields
	// than Grayson Allen has class.

	// Constructor
	public Dook() {
		// This constructor is more creative
		// than a Cameron Crazy cheer sheet.
	}

	// Methods
	public void play(int n) {
		if (n > 0) {
			System.out.println("flop");
			this.play(n - 1);
			System.out.println("trip");
		} else {
			System.out.println("cry");
		}
	}

}