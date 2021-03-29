package TestingSystem_Assignment_4.com.vti.entity.Exer6;

public class Manager extends User {

	public Manager(String name, double salaryRatio) {
		super(name, salaryRatio);
		
	}

	@Override
	public double calculatePay() {
		
		return getSalaryRatio()*520;
	}

}
