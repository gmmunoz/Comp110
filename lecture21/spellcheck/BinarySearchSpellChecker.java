package comp110.lecture21.spellcheck;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchSpellChecker implements SpellChecker {

	private int _steps;

	private List<String> _words;

	public BinarySearchSpellChecker() {
		_words = new ArrayList<String>();
		_steps = 0;
	}

	public boolean contains(String word) {
		// 1. Declare variables for left, right, and guess
		int left, right, guess;

		// 2. Begin left and right at the extremities
		left = 0;
		right = _words.size() - 1;

		// 3. Loop while there are still words to check
		while (left <= right) {
			// TODO: remove this dummy line

			right = -1;
			// 3.1 Increment # of steps counter

			// 3.2 Make a new guess

			// 3.3 The selected word is at index guess

			// 3.4 Compare the word being searched for with the selected word

			// 3.5 If the comparison is 0 -- found!
			// 3.5 Else if the comparison is < 0 -- the word comes *before* the
			// selected word, in which case: move the right side constraint
			// 3.5 Else the comparison is > 0 -- the word comes *after* the
			// selected word, so: move the left hand side constraint
		}

		// 4. The word must not exist.
		return false;
	}

	public void setWords(List<String> words) {
		// Notice String has a handy, built-in Comparator we can use
		words.sort(String.CASE_INSENSITIVE_ORDER);
		_words = words;
	}

	public int getStepCount() {
		return _steps;
	}

	public void resetStepCount() {
		_steps = 0;
	}

}