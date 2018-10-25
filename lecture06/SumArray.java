package comp110.lecture06;

import comp110.Console;

public class SumArray {

	public static void main(String[] args) {

    Console console = new Console("Sum Array Example");

    int length = console.promptInt("How many numbers do you want to add?");

    int[] a = new int[length];

    for (int i = 0; i < a.length; i = i + 1) {
      a[i] = console.promptInt("a[" + i + "] = ");
    }

    int sum = 0;
    // TODO: write a for loop which sums the elements of array a
    for (int = 0; i < a; i++){
    	sum = sum + a[i]
    }
    console.print("The sum is " + sum);
    
  }

}
