package TestingSystem_Assignment_4.com.vti.backend;

import TestingSystem_Assignment_4.com.vti.entity.Exer6.Employee;
import TestingSystem_Assignment_4.com.vti.entity.Exer6.Manager;
import TestingSystem_Assignment_4.com.vti.entity.Exer6.Phone;
import TestingSystem_Assignment_4.com.vti.entity.Exer6.VietnamesePhone;
import TestingSystem_Assignment_4.com.vti.entity.Exer6.Waiter;

public class Exercise_6_Abstraction {
	public void question1() {
		Phone phone = new VietnamesePhone();
		phone.insertContact("Đăng Black", "0825294200");
		phone.removeContact("Đăng Black");
		phone.updateContact("Đăng Black", "0962282193");
		phone.searchContact("Đăng Black");
	}

	public void question2_3() {
		Employee employee = new Employee("Đăng Black", 6.9);
		employee.displayInfor();
		Manager manager = new Manager("Quang Anh", 9.6);
		manager.displayInfor();
		Waiter waiter = new Waiter("Chiến Panda", 2.6);
		waiter.displayInfor();
	}

}
