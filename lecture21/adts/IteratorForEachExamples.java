package comp110.lecture21.adts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorForEachExamples {

	public static void main(String[] args) {

		List<String> words = new ArrayList<String>();
		words.add("this");
		words.add("is");
		words.add("an");
		words.add("iterator");
		words.add("example");

		// Each ADT can provide an "iterator" for working through each item
		// one-by-one
		Iterator<String> itr = words.iterator();

		// The following for-each loop is exactly equivalent to the above
		// iterator example.

	}

}
