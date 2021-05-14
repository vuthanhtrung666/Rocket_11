package com.vti.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "Question_Category", catalog = "TestingSystem")
public class QuestionCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Column(name = "name", length = 50, unique = true, nullable = false)
	private String name;

	@Column(name = "create_time", nullable = false, updatable = false, insertable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createTime;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Testing_Category_ID", nullable = false)
	private TestingCategory TestingCategoryID;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "author_ID", nullable = false)
	private User author;

	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
	private Set<Question> questions;

	public Set<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	public TestingCategory getTestingCategoryID() {
		return TestingCategoryID;
	}

	public void setTestingCategoryID(TestingCategory testingCategoryID) {
		TestingCategoryID = testingCategoryID;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "QuestionCategory [id=" + id + ", name=" + name + ", createTime=" + createTime + ", TestingCategoryID="
				+ TestingCategoryID.getName() + ", author=" + author.getFirstName() + "]";
	}

}
