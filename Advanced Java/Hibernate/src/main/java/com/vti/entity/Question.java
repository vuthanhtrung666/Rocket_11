package com.vti.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "Question", catalog = "TestingSystem")
public class Question implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@Column(name = "type", nullable = false, columnDefinition = "varchar(20) default 'MultipleChoice'")
	@Enumerated(EnumType.STRING)
	private Type type;
	
	@Column(name = "status")
	@Enumerated(EnumType.ORDINAL)
	@ColumnDefault("0")
	private Status2 status;
	
	@Column(name = "version", nullable = false)
	@ColumnDefault("1")
	private short version;
	
	@Column(name = "create_time", nullable = false, updatable = false, insertable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Status2 getStatus() {
		return status;
	}

	public void setStatus(Status2 status) {
		this.status = status;
	}

	public short getVersion() {
		return version;
	}

	public void setVersion(short version) {
		this.version = version;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", title=" + title + ", type=" + type + ", status=" + status + ", version="
				+ version + ", createTime=" + createTime + "]";
	}

}
