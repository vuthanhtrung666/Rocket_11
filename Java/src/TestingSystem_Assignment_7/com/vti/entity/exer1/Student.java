package TestingSystem_Assignment_7.com.vti.entity.exer1;

public class Student {
	private int id;
	private String name;
	private static String college;
	private static int moneyGroup = 0;
	private static int count = 0;
	private static int maxStudent = 7;

	public Student(int id, String name) throws Exception  {
		if (count > maxStudent) {
			throw new Exception("Không thể tạo quá 7 sinh viên");
		}
		this.id = id;
		this.name = name;
		this.moneyGroup += 100;
		this.count += 1;
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

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}

	public static int getMoneyGroup() {
		return moneyGroup;
	}

	public static void setMoneyGroup(int moneyGroup) {
		Student.moneyGroup = moneyGroup;
	}

	public void spend(int money) {
		this.moneyGroup -= money;
	}

	public void fund() {
		this.moneyGroup += 50;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}

}
