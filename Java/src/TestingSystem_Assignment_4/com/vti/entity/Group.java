package TestingSystem_Assignment_4.com.vti.entity;

import java.util.Arrays;
import java.util.Date;

public class Group {
	private int id;
	private String name;
	private Account creator;
	private Account[] accounts;
	private Date createDate;

	public Group() {
	}

	public Group(int id, String name, Account creator, Account[] accounts, Date createDate) {
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.accounts = accounts;
		this.createDate = createDate;
	}

	public Group(int id, String name, Account creator, String[] username, Date createDate) {
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
		Account[] accounts = new Account[username.length];
		for (int i = 0; i < username.length; i++) {
			accounts[i] = new Account(username[i]);
		}
		this.accounts = accounts;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "id:" + id + "\nname:" + name + "\nCreator:" + creator + "\nAccounts:" + Arrays.toString(accounts)
				+ "\ncreateDate:" + createDate;
	}

}
