package TestingSystem_Assignment_7.com.vti.entity.exer2;

public class Student {
	private final int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void study() {
		System.out.println("Đang học bài…");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
