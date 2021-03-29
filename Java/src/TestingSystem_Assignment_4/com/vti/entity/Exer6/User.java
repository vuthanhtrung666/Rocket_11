package TestingSystem_Assignment_4.com.vti.entity.Exer6;

public abstract class User {
	private String name;
	private double salaryRatio;

	public User(String name, double salaryRatio) {
		this.name = name;
		this.salaryRatio = salaryRatio;
	}

	public String getName() {
		return name;
	}

	public double getSalaryRatio() {
		return salaryRatio;
	}

	public abstract double calculatePay();

	public void displayInfor() {
		System.out.println("Name:" + name);
		System.out.println("Salary ratio:" + salaryRatio);
	}
}
