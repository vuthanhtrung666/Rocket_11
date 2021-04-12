package TestingSystem_Assignment_9.com.vti.entity.exer2;

public class Student {
	private int id;
	private String name;
	private static int count = 0;

	public Student(String name) {
		count++;
		this.id = count;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	/**
	*  @deprecated replaced by {@link #print2()}
	*/
	public String print() {
		return "Student [id=" + getId() + ", name=" + getName() + "]";
	}

	public String print2() {
		return "Student [MSV=" + getId() + ", name=" + getName() + "]";
	}
}
