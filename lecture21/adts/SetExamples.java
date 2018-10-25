package comp110.lecture21.adts;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

	public static void main(String[] args) {

		// TODO: initialize fruit to a new HashSet<String> object
		Set<String> fruit = null;

		System.out.println("Size: " + fruit.size());

		System.out.println("Adding two items...");
		// TODO: add "apple" and "banana" to the Set

		System.out.println("Size: " + fruit.size());

		System.out.println("Adding apple again...");
		// TODO: add "apple" again

		System.out.println("Size: " + fruit.size());

		// TODO: print the result of calling contains rather than a ?
		System.out.println("fruit.contains(\"banana\"): ?");

		System.out.println("Print all items in a Set using a for-each loop:");
		// TODO: use a for-each loop to iterate through each item

	}

}
