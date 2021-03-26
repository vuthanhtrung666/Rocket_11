package TestingSystem_Assignment_4.com.vti.entity;

import java.util.Arrays;
import java.util.Date;

public class Exam {
	private int id;
	private String code;
	private String title;
	private CategoryQuestion[] categoryQuestion;
	private int duration;
	private Account account;
	private Date createDate;
	private Question[] questions;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public CategoryQuestion[] getCategoryQuestion() {
		return categoryQuestion;
	}
	public void setCategoryQuestion(CategoryQuestion[] categoryQuestion) {
		this.categoryQuestion = categoryQuestion;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Question[] getQuestions() {
		return questions;
	}
	public void setQuestions(Question[] questions) {
		this.questions = questions;
	}
	@Override
	public String toString() {
		return "\nExam \n[id=" + id + ",\n code=" + code + ",\n title=" + title + 
				",\n categoryQuestion="	+ Arrays.toString(categoryQuestion) + 
				",\n duration=" + duration + ",\n account=" + account + 
				",\n createDate=" + createDate + ",\n questions=" + Arrays.toString(questions) + "]";
	}
	
	
}

