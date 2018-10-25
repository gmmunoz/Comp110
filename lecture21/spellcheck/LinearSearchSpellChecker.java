package comp110.lecture21.spellcheck;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchSpellChecker implements SpellChecker {

	private int _steps;

	private List<String> _words;

	public LinearSearchSpellChecker() {
		_words = new ArrayList<String>();
		_steps = 0;
	}

	public boolean contains(String word) {
		// Loop through each word in _words
		// Test for equality, return true if found

		// The word was not found!
		return false;
	}

	public void setWords(List<String> words) {
		_words = words;
	}

	public int getStepCount() {
		return _steps;
	}

	public void resetStepCount() {
		_steps = 0;
	}

}