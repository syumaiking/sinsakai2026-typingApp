package question;

public class Question {
	private String word;
	private String difficulty;

	public Question(String ward, String difficulty) {
		this.word = ward;
		this.difficulty = difficulty;
	}

	public String getWard() {
		return word;
	}

	public void setWard(String ward) {
		this.word = ward;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

}
