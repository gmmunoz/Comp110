package comp110.lecture14;

public class TracingReturnValues {

	public static void main(String[] args) {
		TracingReturnValues jump = new TracingReturnValues();

		// System.out.println("=== jump2() ===");
		// System.out.println(jump.jump2());

		// TODO #1 - Uncomment These Lines
		System.out.println("=== recur(3) ===");
		System.out.println(jump.recur(3));
		// TODO #2 - Try changing the argument value!
	}

	public int jump0() {
		System.out.println("-> 0");
		int x = 0;
		System.out.println("<- 0");
		return x;
	}

	public int jump1() {
		System.out.println("-> 1");
		int x = 1 + this.jump0();
		System.out.println("<- 1");
		return x;
	}

	public int jump2() {
		System.out.println("-> 2");
		int x = 2 + this.jump1();
		System.out.println("<- 2");
		return x;
	}

	public int recur(int n) {
		System.out.println("-> " + n);
		int x;
		if (n == 0) {
			x = n;
		} else {
			x = n + this.recur(n - 1);
		}
		System.out.println("<- " + n);
		return x;
	}

}
