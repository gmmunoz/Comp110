package comp110.lecture22.generics;

import java.util.Iterator;

/*
 * This is a generic class that will work with *any* type, not just Strings.
 * 
 * We will not cover generics in COMP110, however, if you want to read through
 * this I think you will see that there isn't much magic to implementing your own
 * generic classes. COMP401 and 410 will provide exposure to this.
 */
public class ArrayIterator<TYPE> implements Iterator<TYPE> {

	private int _i;
	private TYPE[] _array;

	public ArrayIterator(TYPE[] array) {
		_array = array;
		_i = 0;
	}

	public boolean hasNext() {
		return _i < _array.length;
	}

	public TYPE next() {
		TYPE nextElement = _array[_i];
		_i++;
		return nextElement;
	}

}