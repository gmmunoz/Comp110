package comp110.lecture03;

import comp110.Console;

public class ComparisonOperators {

	public static void main(String[] args) {

		Console console = new Console("Boolean Expression Examples");
		console.speed(0.5);

		int a = 1;
		int b = 2;
		int c = 2;

		double d = 3.0;
		double e = 3.5;

		char f = 'F';
		char g = 'G';

		// Your goal, make use of ALL the variables above, write 5 print
		// commands
		// using the given comparison operator each print a boolean value of
		// true to
		// the console.

		// Example: The > "Greater Than" Operator
		console.print(b > a);

		// 1) The < "Less Than" Operator
		console.print(d < e);

		// 2) The >= "At Least" or "Greater Than or Equal To" Operator
		console.print(d <= 3.0);

		// 3) The <= "At Most" or "Less Than or Equal To" Operator
		console.print(f <= g);

		// 4) The == "Equality" Operator
		console.print(g == c);

		// 5) The != "Not Equal To" Operator
		console.print(f != g);

	}

}
