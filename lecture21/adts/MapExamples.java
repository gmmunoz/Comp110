package comp110.lecture21.adts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExamples {

	public static void main(String[] args) {

		// TODO: initialize map to a new HashMap<String, String> object
		Map<String, String> map = null;

		System.out.println("Size: " + map.size());

		System.out.println("Putting two key-value pairs into the Map");
		// TODO: put "a" maps to "apple"
		// TODO: put "b" maps to "banana"

		System.out.println("Size: " + map.size());

		// TODO: get the value for key "a"
		System.out.println("map.get(\"a\"): ?");

		System.out.println("Replacing a key-value pair with a new value");
		// TODO: replace "a"'s value with the String "awesome"

		System.out.println("Print all key-value pairs: ");
		// TODO: initialize the keys Set to the result of calling keySet on Map
		Set<String> keys = null;

		// TODO: for-each through each key and print out each key-value pair

	}

}
