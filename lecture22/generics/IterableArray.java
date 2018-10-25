package comp110.lecture22.generics;

import java.util.Iterator;

/*
 * This is a generic class that will work with *any* type, not just Strings.
 * 
 * We will not cover generics in COMP110, however, if you want to read through
 * this I think you will see that there isn't much magic to implementing your own
 * generic classes. COMP401 and 410 will provide exposure to this.
 */

public class IterableArray<TYPE> implements Iterable<TYPE> {

	private TYPE[] _array;

	public IterableArray(TYPE[] array) {
		_array = array;
	}

	public Iterator<TYPE> iterator() {
		System.out.println("IterableArray's iterator() method called!");
		return new ArrayIterator<TYPE>(_array);
	}

}