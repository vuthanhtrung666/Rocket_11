package TestingSystem_Assignment_1;

import java.util.Arrays;
import java.util.Date;

public class Account {
	public int id;
	public String email;
	public String username;
	public String fullname;
	public Department department;
	public Position position;
	public Date createDate;
	public GroupAccount[] groupAccounts;
	
	public Account() {
	}

	public Account(int id, String email, String username, String firstname, String lastname) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = firstname +" "+ lastname;
	}



	public Account(int id, String email, String username, String firstname, String lastname, Position position ) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = firstname +" "+ lastname;
		this.position = position;
		this.createDate = new Date();
	}

	

	public Account(int id, String email, String username, String firstname, String lastname, Position position, Date createDate) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = firstname +" "+ lastname;
		this.position = position;
		this.createDate = createDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public GroupAccount[] getGroupAccounts() {
		return groupAccounts;
	}

	public void setGroupAccounts(GroupAccount[] groupAccounts) {
		this.groupAccounts = groupAccounts;
	}

	public String toString2() {
		return "id:" + id + "\nEmail:" + email + 
				"\nUsername:" + username + "\nfullname:" + fullname;
	}
	
	public String toString3() {
		return "id:" + id + "\nEmail:" + email + 
				"\nUsername:" + username + "\nfullname:" + fullname + 
				"\nDepartment:" + department.getName() + 
				"\nPosition:" + position.getName() + "\ncreate date:" + createDate;
	}

	
	@Override
	public String toString() {
		return "id:" + id + "\nemail:" + email + "\nusername:" + username + 
				"\nfullname:" + fullname + "\ndepartment:" + department.getName() + 
				"\nposition:" + position + "\ncreateDate:" + createDate	+ 
				"\ngroupAccounts:" + Arrays.toString(groupAccounts) ;
	}
	
	
}
