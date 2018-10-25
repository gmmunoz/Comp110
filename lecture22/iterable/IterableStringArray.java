package comp110.lecture22.iterable;

import java.util.Iterator;

public class IterableStringArray implements Iterable<String> {

	private String[] _array;

	public IterableStringArray(String[] array) {
		_array = array;
	}

	public Iterator<String> iterator() {
		System.out.println("IterableStringArray's iterator() method was called!");
		return new StringArrayIterator(_array);
	}

}
