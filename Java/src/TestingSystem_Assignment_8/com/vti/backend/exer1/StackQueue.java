package TestingSystem_Assignment_8.com.vti.backend.exer1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import TestingSystem_Assignment_8.com.vti.entity.exer1.Student;

public class StackQueue {
	public void inputStack() {
		Stack<Student> students2 = new Stack<>();
		students2.push(new Student("Nguyễn Văn Nam"));
		students2.push(new Student("Nguyễn Văn Huyên"));
		students2.push(new Student("Trần Văn Nam"));
		students2.push(new Student("Nguyễn Văn A"));
		while(!students2.isEmpty()) {
			System.out.println(students2.pop());
		}
	}
	
	public void inputQueue() {
		Queue<Student> students2 = new LinkedList<>();
		students2.add(new Student("Nguyễn Văn Nam"));
		students2.add(new Student("Nguyễn Văn Huyên"));
		students2.add(new Student("Trần Văn Nam"));
		students2.add(new Student("Nguyễn Văn A"));
		while(!students2.isEmpty()) {
			System.out.println(students2.poll());
		}
	}
}
