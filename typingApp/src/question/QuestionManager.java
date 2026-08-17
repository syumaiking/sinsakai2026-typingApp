package question;

import java.util.ArrayList;
import java.util.List;

public class QuestionManager {
	private List<Question> questions;

	public QuestionManager() {
		questions = new ArrayList<>();
		questions.add(new Question("apple", "初級"));
		questions.add(new Question("qusetion", "中級"));
		questions.add(new Question("experience", "上級"));
	}

	public void addQuestion(Question question) {
		questions.add(question);
	}

	public List<Question> getQuestionsByDifficulty(String difficulty) {
		List<Question> result = new ArrayList<>();
		for (Question question : questions) {
			if (question.getDifficulty().equals(difficulty)) {
				result.add(question);
			}
		}

		return result;
	}
}
