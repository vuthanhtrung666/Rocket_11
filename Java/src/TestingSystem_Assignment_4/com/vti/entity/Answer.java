package TestingSystem_Assignment_4.com.vti.entity;

public class Answer {
	private int id;
	private String content;
	private Question question;
	private Boolean isCorrect;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Boolean getIsCorrect() {
		return isCorrect;
	}
	public void setIsCorrect(Boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	@Override
	public String toString() {
		return 	"\nid:" + id + "\nContent:" + content + 
				"\nQuestion:" + question + "\nisCorrect:" + isCorrect;
	}
	
	
}
