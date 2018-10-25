package comp110.lecture22.quiz;

import java.util.Set;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class QuizController {

	@FXML
	private Label _prompt, _a, _b, _c, _d, _e;
	private Label[] _choices;

	// Fields to hold our "model" data
	private QuizModel _quiz;
	private Question _question;

	public void initialize() {
		_choices = new Label[] { _a, _b, _c, _d, _e };
	}

	public void setQuiz(QuizModel quiz) {
		_quiz = quiz;
		this.nextQuestion();
	}

	public void reset() {
		_quiz.reset();
		this.nextQuestion();
	}

	private void nextQuestion() {
		// Does the QuizModel have another question?
		if (_quiz.hasNext()) {

			// Ask the QuizModel for the next Question
			_question = _quiz.next();

			// TODO: Set prompt text to the question's prompt
			_prompt.setText(_question.getPrompt());
			// TODO: Set each _choices[] Label's text to each
			// option in the set of the current question's answers
			Set<String> questionChoices = _question.getAnswers();
			int i = 0;
			for (String answer : questionChoices) {
				_choices[i].setText(answer);
				i++;
			}
		} else {

			// We're done with the quiz!
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Your Scientific Results");
			alert.setHeaderText("You are " + _quiz.getResult() + "!!!");
			alert.setContentText("Press OK to try again.");
			alert.showAndWait();
			this.reset();

		}
	}

	public void handleClickA() {
		// TODO: handle clicking the first choice Label
		String answer = _a.getText();
		String princess = _question.getOutcome(answer);
		_quiz.addTally(princess);
		this.nextQuestion();
	}

	public void handleClickB() {
		String choice = _b.getText();
		String result = _question.getOutcome(choice);
		_quiz.addTally(result);
		this.nextQuestion();
	}

	public void handleClickC() {
		String choice = _c.getText();
		String result = _question.getOutcome(choice);
		_quiz.addTally(result);
		this.nextQuestion();
	}

	public void handleClickD() {
		String choice = _d.getText();
		String result = _question.getOutcome(choice);
		_quiz.addTally(result);
		this.nextQuestion();
	}

	public void handleClickE() {
		String choice = _e.getText();
		String result = _question.getOutcome(choice);
		_quiz.addTally(result);
		this.nextQuestion();
	}

}
