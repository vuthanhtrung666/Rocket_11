package TestingSystem_Assignment_1;

public class Department {
	public int id;
	public String name;
	
	public Department() {
	}

	public Department(String name) {
		super();
		this.id = 0;
		this.name = name;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "ID : " + id + "\n";
		result += "Name: " + name;
		return result;
	}
}
