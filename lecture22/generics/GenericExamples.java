package comp110.lecture22.generics;

import java.util.Iterator;

public class GenericExamples {

	public static void main(String[] args) {

		String[] words = new String[] { "the", "quick", "brown", "fox" };
		IterableArray<String> iterable = new IterableArray<String>(words);

		System.out.println("Using an Iterator directly");
		Iterator<String> iterator = iterable.iterator();
		while (iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
		}

		System.out.println("Using an Iterator indirectly via for-each loop");
		for (String s : iterable) {
			System.out.println(s);
		}

	}

}