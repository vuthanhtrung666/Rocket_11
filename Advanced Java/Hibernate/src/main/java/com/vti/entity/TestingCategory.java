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
@Table(name = "Testing_Category", catalog = "TestingSystem")
public class TestingCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "id")
	@Id // PRIMARY KEY
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	private short id;

	@Column(name = "name", length = 50, nullable = false, unique = true)
	private String name;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "author_ID", nullable = false)
	private User author;

	@Column(name = "create_time", nullable = false, updatable = false, insertable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createTime;

	@OneToMany(mappedBy = "TestingCategoryID", fetch = FetchType.EAGER)
	private Set<QuestionCategory> categories;

	public TestingCategory() {

	}

	public Set<QuestionCategory> getCategories() {
		return categories;
	}

	public void setCategories(Set<QuestionCategory> categories) {
		this.categories = categories;
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

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "TestingCategory [id=" + id + ", name=" + name + ", author=" + author.getFirstName() + ", createTime="
				+ createTime + "]";
	}

}
