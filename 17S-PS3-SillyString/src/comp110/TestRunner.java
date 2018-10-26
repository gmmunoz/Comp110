package comp110;

/*
 * Author: <Gabriela Munoz>
 *
 * ONYEN: <gmmunoz>
 *
 * UNC Honor Pledge: I certify that no unauthorized aids or assistance has been 
 * received or used in the completion of this work. I collaborated with
 * no one other than official COMP110 UTAs on this code.
 */
public class TestRunner {

	public static void main(String[] args) {

		Console console = new Console();

		// Setup a few SillyStrings to test with
		SillyString empty = new SillyString("");
		SillyString letters = new SillyString("abcdef");
		SillyString phrase = new SillyString("the quick brown fox jumped");

		// Test our work by calling methods and comparing expected with actual

		// size Tests
		console.print("1.1 size - expect: 0 - actual: " + empty.size());
		console.print("1.1 size - expect: 6 - actual: " + letters.size());
		console.print("1.1 size - expect: 26 - actual: " + phrase.size());

		// charAt tests
		console.print("1.2 charAt - expect: a - actual: " + letters.charAt(0));
		console.print("1.2 charAt - expect: c - actual: " + letters.charAt(2));
		console.print("1.2 charAt - expect: f - actual: " + letters.charAt(5));

		// countVowels tests - uncomment the lines below once you get to count
		console.print("1.3 countVowels - expect: 0 - actual: " + empty.countVowels());
		console.print("1.3 countVowels - expect: 2 - actual: " + letters.countVowels());
		console.print("1.3 countVowels - expect: 7 - actual: " + phrase.countVowels());

		// TODO: Write your own tests (like above) for the other methods below.
		// count test
		console.print("1.4 count 'c' - expect: 0 - actual: " + empty.count('c'));
		console.print("1.4 count 'c' - expect: 1 - actual: " + letters.count('c'));
		console.print("1.4 count 'c' - expect: 1 - actual: " + phrase.count('c'));

		// index return test
		console.print("1.5 indexOf ('c', 0) - expect: -1 - actual: " + empty.indexOf('c', 0));
		console.print("1.5 indexOf ('c', 0) - expect: 2 - actual: " + letters.indexOf('c', 0));
		console.print("1.5 indexOf ('c', 0) - expect: 7 - actual: " + phrase.indexOf('c', 0));

		// // boolean char c test
		console.print("2.1 contains 'c' - expect: false - actual: " + empty.contains('c'));
		console.print("2.1 contains 'c' - expect: true - actual: " + letters.contains('c'));
		console.print("2.1 contains 'c' - expect: true - actual: " + phrase.contains('c'));

		// boolean every char==c test
		console.print("2.2 contains only 'c' - expect: false - actual: " + empty.every('c'));
		console.print("2.2 contains only 'c' - expect: false - actual: " + letters.every('c'));
		console.print("2.2 contains only 'c' - expect: false - actual:  " + phrase.every('c'));

		// boolean ends with
		console.print(
				"2.3 ends with the suffix - expect: false - actual: " + letters.endsWith(new char[] { 'a', 'b', 'c' }));
		console.print(
				"2.3 ends with the suffix - expect: true - actual: " + letters.endsWith(new char[] { 'd', 'e', 'f' }));
		console.print(
				"2.3 ends with the suffix - expect: true - actual: " + phrase.endsWith(new char[] { 'f', 'o', 'x' }));

		// boolean palindrome test
		console.print("2.4 is a palindrome - expect: true - actual: " + empty.isPalindrome());
		console.print("2.4 is a palindrome - expect: false - actual: " + letters.isPalindrome());
		console.print("2.4 is a plaindrome - expect: false - actual: " + phrase.isPalindrome());

		// 3.1 boolean other
		console.print("3.1 equals other - expect: false - actual: " + empty.equals(letters));
		console.print("3.1 equals other - expect: true - actual: " + letters.equals(letters));
		console.print("3.1 equals other - expect: true - actual: " + phrase.equals(phrase));

		// 3.2 boolean clone
		SillyString clones = letters.clone();
		console.print("3.2 is a clone - expect: true - actual: " + letters.equals(clones));
		console.print("3.2 is a clone - expect: false - actual: " + phrase.equals(clones));

		// PART 2
		// 4.1 reverse string
		console.print("4.1 is a reverse - expect: fedcba - actual: " + letters.reverse());

		// 4.2 uppercase test
		console.print("4.2 is now uppercase - expect: ABCDEF - actual: " + letters.toUpperCase());

		// 4.3 concatenate
		console.print("4.3 is a concatenate - expect: abcdef the quick brown fox jumped - actual: "
				+ letters.concatenate(phrase));
		// 4.4 repeat
		console.print("4.4 is repeat - expect abcdefabcdef - actual: " + letters.repeat(2));

		// 5.1 substract
		console.print("5.1 is substring - expect abc - actual: " + letters.substring(0, 3));

		// 5.2 split
		// ???
		// 5.3 glue + pieces
		// console.print("");
		//
		// // 6.1 splice
		// console.print("");
		//
		// // 6.2 replace
		// console.print("");
		//
		// // 6.3 replace ALL
		// console.print("");

		// WARNING: In order to receive help from UTAs on this assignment you
		// must be able to demonstrate you are testing the method you are stuck
		// on in this file.
	}

}