package comp110.lecture22.quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question {

  private String _prompt;
  private Map<String, String> _answers;

  public Question(String prompt) {
    _prompt = prompt;
    _answers = new HashMap<String, String>();
  }

  public void addChoice(String choice, String result) {
    _answers.put(choice, result);
  }

  public String getPrompt() {
    return _prompt;
  }

  public Set<String> getAnswers() {
    return _answers.keySet();
  }

  public String getOutcome(String answer) {
    return _answers.get(answer);
  }

}