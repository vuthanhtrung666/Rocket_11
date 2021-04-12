package TestingSystem_Assignment_8.com.vti.backend;

import java.util.ArrayList;
import java.util.List;

import TestingSystem_Assignment_8.com.vti.entity.exer4.Salary;

public class Wildcard {
	public void ques1() {
		Salary<Integer> salaries = new Salary<Integer>(12345);
		System.out.println(salaries);
	}
}
