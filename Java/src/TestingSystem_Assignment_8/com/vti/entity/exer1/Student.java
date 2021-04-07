package TestingSystem_Assignment_8.com.vti.entity.exer1;

public class Student {
	private int id;
	private String name;
	private static int count = 0;
	public Student( String name) {
		this.id = ++count;
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
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
