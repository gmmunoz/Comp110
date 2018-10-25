package comp110.lecture22.iterable;

import java.util.Iterator;

public class CustomIterableExamples {

	public static void main(String[] args) {

		String[] words = new String[] { "the", "quick", "brown", "fox", "jumped", "over", "the", "fence" };
		IterableStringArray iterable = new IterableStringArray(words);

		System.out.println("Using a traditional for loop");
		for (int i = 0; i < words.length; i++) {
			String next = words[i];
			System.out.println(next);
		}

		System.out.println("Using an Iterator directly...");
		// TODO: Use an Iterator
		Iterator<String> itr = iterable.iterator();
		while (itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
		}

		System.out.println("Using an Iterator via for-each...");
		// TODO: Use a for-each
		for (String next : iterable) {
			System.out.println(next);
		}
	}

}