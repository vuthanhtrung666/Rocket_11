package TestingSystem_Assignment_4.com.vti.entity;

import java.util.Date;

public class GroupAccount {
	private Group group;
	private Account account;
	private Date joinDate;
	
	
	
	public GroupAccount(Account account) {
		this.account = account;
	}


	public Group getGroup() {
		return group;
	}


	public void setGroup(Group group) {
		this.group = group;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public Date getJoinDate() {
		return joinDate;
	}


	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	public String toString1() {
		return 	"\nAccount:" + account;
	}

	@Override
	public String toString() {
		return 	"\nGroup:" + group + "\nAccount:" + account + 
				"\nJoinDate:" + joinDate;
	}
	
	
}
