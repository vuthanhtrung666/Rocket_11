package TestingSystem_Assignment_4.com.vti.entity.Exer6;

public class Waiter extends User {

	public Waiter(String name, double salaryRatio) {
		super(name, salaryRatio);
		
	}

	@Override
	public double calculatePay() {
		
		return getSalaryRatio()*220;
	}

}
