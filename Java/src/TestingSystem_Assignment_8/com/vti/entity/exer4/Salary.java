package TestingSystem_Assignment_8.com.vti.entity.exer4;

public class Salary<N extends Number> {
	private N salary;

	public Salary(N salary) {
		this.salary = salary;
	}

	public N getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Salary [salary=" + salary + "]";
	}

}
