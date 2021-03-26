package TestingSystem_Assignment_4.com.vti.entity.Exer5;

import java.util.Scanner;

public class KySu extends CanBo{
	private String trainingIndustry;

	public String getTrainingIndustry() {
		return trainingIndustry;
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ngành đào tạo:");
		trainingIndustry = scanner.nextLine();
	}

	@Override
	public void getInfor() {
		// TODO Auto-generated method stub
		super.getInfor();
		System.out.println("Ngành đào tạo :" + trainingIndustry);
	}
	
}
