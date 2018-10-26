package comp110;

/*
 * Author: <Gabriela Munoz>
 *
 * ONYEN: <gmmunoz>
 *
 * UNC Honor Pledge: I certify that no unauthorized aids or assistance has been 
 * received or used in the completion of this work. I collaborated with
 * no one other than official COMP110 UTAs on this code.
 * 
 * WARNING: ANY use of Java's built-in methods within this file outside 
 * of the provided stencil code will result in a score of 0 for this assignment 
 * during final grade checks at the end of the semester.
 */
public class SillyString {

	///////////////////////////
	// Begin stencil code
	// You should understand this but should not modify any of it.

	// Fields
	private char[] _chars;

	// Constructors

	// SillyString has two constructors. You can construct a SillyString
	// from a native String or from an array of chars.

	public SillyString(String s) {
		// We are initializing the _chars field to be the array of characters
		// given to us by the String s.
		_chars = s.toCharArray();
	}

	public SillyString(char[] chars) {
		_chars = chars;
	}

	// Methods

	// toString is a special method in Java we will discuss soon.
	public String toString() {
		return new String(_chars);
	}

	// You can ask any SillyString for its chars
	public char[] getChars() {
		return _chars;
	}

	// End stencil code
	////////////////////////////

	// TODO: The methods you will implement are below.

	// Part 1

	// Section 1

	public int size() {
		return _chars.length;
	}

	public char charAt(int i) {
		return _chars[i];
	}

	public int countVowels() {
		int countvowels = 0;
		for (int b = 0; b < _chars.length; b++) {
			char c = _chars[b];
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				countvowels++;
			}
		}
		return countvowels;
	}

	// 1.4
	public int count(char c) {
		int count = 0;
		for (int d = 0; d < _chars.length; d++) {
			char actualc = _chars[d];
			if (actualc == c) {
				count++;
			}
		}
		return count;
	}

	// 1.5
	public int indexOf(char c, int start) {
		for (int e = start; e < _chars.length; e++) {
			char cc = _chars[e];
			if (cc == c) {
				return e;
			}
		}
		return -1;
	}

	// Section 2
	// 2.1
	public boolean contains(char c) {
		for (int f = 0; f < _chars.length; f++) {
			char ch = _chars[f];
			if (ch == c) {
				return true;
			}
		}
		return false;
	}

	// 2.2

	public boolean every(char c) {
		for (int h = 0; h < _chars.length; h++) {
			char cg = _chars[h];
			if (cg != c) {
				return false;
			}
		}
		return true;
	}

	// 2.3
	// manipulate bc suffix
	// pay attention to index #s
	public boolean endsWith(char[] suffix) {
		int index = 0;
		for (int start = _chars.length - suffix.length; start < _chars.length; start++) {
			if (_chars[start] != suffix[index]) {
				return false;
			}
			index++;
		}
		return true;
	}

	// 2.4
	public boolean isPalindrome() {
		int jj = 0;
		int j1 = _chars.length - 1;
		while (j1 > jj) {
			if (_chars[jj] != _chars[j1]) {
				jj++;
				return false;
			}
			j1--;
			jj++;
		}
		return true;
	}

	// Section 3
	// go through every character//use chArt
	// 3.1
	public boolean equals(SillyString other) {
		if (_chars.length == other.size()) {
			for (int j = 0; j < _chars.length; j++) {
				if (_chars[j] != other.charAt(j)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public SillyString clone() {
		// feed off 3.1
		// assign clone[0] = _chars[0];
		char[] clone = new char[_chars.length];
		for (int z = 0; z < _chars.length; z++) {
			clone[z] = _chars[z];
		}
		// create instance
		SillyString twin = new SillyString(clone);
		return twin;

	}

	// Part 2

	// Section 4
	// 4.1
	public SillyString reverse() {
		// instantializes a reverse string
		char[] reverse = new char[_chars.length];
		// fills the reverse string
		for (int i = 0; i < _chars.length; i++) {
			reverse[i] = _chars[_chars.length - 1 - i];
		}
		// making a SillyString to return
		String answer = "";
		for (int i = 0; i < _chars.length; i++)
			answer += reverse[i];
		SillyString answerString = new SillyString(answer);
		return answerString;
	}

	// 4.2
	public SillyString toUpperCase() {
		String answer2 = "";
		for (int s = 0; s < _chars.length; s++) {
			answer2 += Character.toUpperCase(_chars[s]);

		}
		SillyString answer2String = new SillyString(answer2);
		return answer2String;
	}

	// 4.3
	public SillyString concatenate(SillyString other) {
		String answer = "";
		for (int i = 0; i < _chars.length; i++)
			answer += _chars[i];
		for (int i = 0; i < other.getChars().length; i++)
			answer += other.getChars()[i];
		SillyString answerString = new SillyString(answer);
		return answerString;
	}

	// 4.4
	public SillyString repeat(int n) {
		String answer = "";
		for (int i = 0; i < n; i++)
			for (int j = 0; j < _chars.length; j++)
				answer += _chars[j];

		SillyString answerString = new SillyString(answer);
		return answerString;
	}

	// Section 5
	// 5.1
	public SillyString substring(int start, int end) {
		String answer = "";
		for (int i = start; i < end; i++)
			answer += _chars[i];
		SillyString answerString = new SillyString(answer);
		return answerString;
	}

	// 5.2
	// need help/ EC
	public SillyString[] split(char delimiter) {
		int split = this.count(delimiter) + 1;
		SillyString[] array = new SillyString[split];
		if (split == 1) {
			array[0] = this.clone();
			return array;
		}

		int indexstart = 0;
		int enddelimeter = this.indexOf(delimiter, 0);
		SillyString z = this.substring(0, enddelimeter);
		array[indexstart] = z;
		indexstart++;
		for (int i = 0; i < split - 2; i++) {
			int nextd = this.indexOf(delimiter, enddelimeter + 1);
			z = this.substring(enddelimeter + 1, nextd);
			array[indexstart] = z;
			indexstart++;
			enddelimeter = nextd;
		}
		z = this.substring(enddelimeter + 1, _chars.length);
		array[indexstart] = z;
		return array;
	}

	// 5.3
	public SillyString join(SillyString glue, SillyString[] pieces) {
		// String answer = "";
		// for (int i = 0; i < _chars.length; i++)
		// answer += _chars[i];
		// answer += glue.getChars()[];
		// for (int i = 0; i < pieces.length; i++) {
		// for (int j = 0; j < pieces[i].getChars().length; j++) {
		// answer += pieces[i].getChars()[j];
		// }
		// answer += glue.getChars()[0];
		// }
		SillyString answerString = clone();
		for (int b = 0; b < pieces.length; b++) {
			answerString = answerString.concatenate(glue);
			answerString = answerString.concatenate(pieces[b]);
		}

		return answerString;
	}

	// Section 6
	// 6.1
	public SillyString splice(int offset, int length, SillyString other) {
		String answer = "";
		for (int i = 0; i < offset; i++)
			answer += _chars[i];
		for (int i = 0; i < other.getChars().length; i++)
			answer += other.getChars()[i];
		for (int i = offset + length; i < _chars.length; i++)
			answer += _chars[i];
		SillyString answerString = new SillyString(answer);
		return answerString;
	}

	// 6.2
	public SillyString replace(SillyString search, SillyString replace) {
		String answer = "";
		for (int i = 0; i < _chars.length; i++)
			answer += _chars[i];
		String searchTerm = "";
		for (int i = 0; i < search.getChars().length; i++)
			searchTerm += search.getChars()[i];
		String replacement = "";
		for (int i = 0; i < replace.getChars().length; i++)
			replacement += replace.getChars()[i];

		answer.replaceAll(searchTerm, replacement);
		SillyString answerString = new SillyString(answer);
		return answerString;
	}

	// 6.3
	public SillyString replaceAll(SillyString search, SillyString replace) {
		String answer = "";
		for (int i = 0; i < _chars.length; i++)
			answer += _chars[i];
		String searchTerm = "";
		for (int i = 0; i < search.getChars().length; i++)
			searchTerm += search.getChars()[i];
		String replacement = "";
		for (int i = 0; i < replace.getChars().length; i++)
			replacement += replace.getChars()[i];

		answer.replaceAll(searchTerm, replacement);
		SillyString answerString = new SillyString(answer);
		return answerString;
	}

}