package resources;

import java.io.Serializable;

/**
 * 
 * @author Arkady
 *
 */
public class Question implements Serializable {

	// region Constants

	private static final long serialVersionUID = 1L;

	// end region -> Constants

	// region Fields

	private String questionID;

	private String author;

	private String questionText;

	private String possibleAnswers;

	private String correctAnswer;

	// end region -> Fields

	// region Constructors

	public Question(String questionID, String author, String questionText, String possibleAnswers,
			String correctAnswer) {
		this.questionID = questionID;
		this.author = author;
		this.questionText = questionText;
		this.possibleAnswers = possibleAnswers;
		this.correctAnswer = correctAnswer;
	}

	// end region -> Constructors

	// region Setters

	public String getQuestionID() {
		return questionID;
	}

	public void setQuestionID(String questionID) {
		this.questionID = questionID;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getPossibleAnswers() {
		return possibleAnswers;
	}

	public void setPossibleAnswers(String possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	// end region -> Setters

}