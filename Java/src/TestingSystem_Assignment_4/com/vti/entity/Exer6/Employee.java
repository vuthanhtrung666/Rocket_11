package TestingSystem_Assignment_4.com.vti.entity.Exer6;

public class Employee extends User {

	public Employee(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double calculatePay() {
		
		return getSalaryRatio()*420;
	}

}
