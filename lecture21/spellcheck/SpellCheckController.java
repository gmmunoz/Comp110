package comp110.lecture21.spellcheck;

import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class SpellCheckController {

	// Control Fields
	@FXML
	private TextArea _text;

	@FXML
	private ListView<String> _misspelled;

	@FXML
	private Label _steps;

	// Fields
	private SpellChecker _linearSearch, _binarySearch;

	public SpellCheckController() {
		_linearSearch = new LinearSearchSpellChecker();
		_binarySearch = new BinarySearchSpellChecker();

		// Read the words from the word list file
		TextFile file = new TextFile();
		List<String> words = file.readLines("data/words.txt");
		_linearSearch.setWords(words);
		_binarySearch.setWords(words);
	}

	public void linearSearch() {
		this.spellcheck(_linearSearch);
	}

	public void binarySearch() {
		this.spellcheck(_binarySearch);
	}

	/* Helper Method */

	private void spellcheck(SpellChecker checker) {

		// Clear the Misspelled Words List
		List<String> misspelled = _misspelled.getItems();
		misspelled.clear();

		// Split the words up by
		String[] words = _text.getText().toLowerCase().split(" ");

		// Reset # of Steps Counter
		checker.resetStepCount();

		// Check all of the words
		for (int i = 0; i < words.length; i++) {
			String test = words[i];
			// If the checker does not know the word being tested, add the word
			// to the misspelled list.
			if (!checker.contains(test)) {
				misspelled.add(test);
			}
		}

		// Set the step counter label
		_steps.setText("" + checker.getStepCount());

	}

}