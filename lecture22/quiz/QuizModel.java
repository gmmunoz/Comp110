package comp110.lecture22.quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class QuizModel implements Iterator<Question> {

	private Map<String, Integer> _scores;

	private int _index; // Stores the question # we are on
	private List<Question> _questions;

	public QuizModel() {
		_questions = new ArrayList<Question>();
		_scores = new HashMap<String, Integer>();
		_index = 0;
	}

	public void reset() {
		_index = 0;
		for (String key : _scores.keySet()) {
			_scores.put(key, 0);
		}
	}

	public void addQuestion(Question question) {
		_questions.add(question);
	}

	public boolean hasNext() {
		return _index < _questions.size();
	}

	public Question next() {
		Question question = _questions.get(_index);
		_index++;
		return question;
	}

	public String getResult() {
		// TODO: Calculate the actual high scoring outcome
		int max = 0;
		String maxKey = " ";
		for (String princess : _scores.keySet()) {
			if (_scores.get(princess) > max) {
				max = _scores.get(princess);
				maxKey = princess;
			}
		}
		return maxKey;
	}

	public void addOutcome(String outcome) {
		_scores.put(outcome, 0);
	}

	public void addTally(String outcome) {
		int newScore = _scores.get(outcome) + 1;
		_scores.put(outcome, newScore);
	}

	public String toString() {
		return _scores.toString();
	}

}
