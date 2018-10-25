package comp110.lecture14;

public class CallStack {

	public static void main(String[] args) {
		CallStack demo = new CallStack();
		// demo.stackOverflow(0);
		demo.avoidOverflow(2);
	}

	// No Fields
	// Default Constructor (Same as an Empty Constructor)

	public void stackOverflow(int n) {
		System.out.println("Stacking... " + n);
		this.stackOverflow(n + 1);
	}

	public void avoidOverflow(int n) {
		System.out.println("Stacking... " + n);
		// TODO: Add a test for our base case...
		if (n > 0) {
			this.avoidOverflow(n - 1);
		} else {
			System.out.println("Base case");
		}
		System.out.println("Unstacking... " + n);
	}
}