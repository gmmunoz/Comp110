package comp110.lecture21.spellcheck;

import java.util.List;

public interface SpellChecker {

	public void setWords(List<String> words);

	public boolean contains(String word);

	public int getStepCount();

	public void resetStepCount();

}
