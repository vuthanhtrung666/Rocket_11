package TestingSystem_Assignment_8.com.vti.frontend;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import TestingSystem_Assignment_8.com.vti.backend.exer1.Set1;

public class Program1 {

	public static void main(String[] args) {
//		List1 list1 = new List1();
//		list1.amount();
//		list1.getIndex(4);
//		list1.firstAndLast();
//		list1.reverse();
//		list1.findById();
//		list1.findByName();
//		list1.findDuplicateStudent();
		Set1 set1 = new Set1();
//		set1.print();
//		set1.getIndex(4);
		set1.firstAndLast();
//		StackQueue stackQueue = new StackQueue();
//		stackQueue.inputStack();
//		stackQueue.inputQueue();
//		map();
	}

	public static void map() {
		Map<Integer, String> students = new HashMap<>();
		students.put(1, "Nguyễn Văn Nam");
		students.put(2, "Nguyễn Văn Huyên");
		students.put(3, "Trần Văn Nam");
		students.put(4, "Nguyễn Văn A");
		// Khởi tạo ra một Set entries
	    Set<Entry<Integer, String>> entries = students.entrySet();
	    System.out.println("----- Before sorting, random order -----");
	    for (Entry<Integer, String> entry : entries) {
	      System.out.println(entry.getKey() + " | " + entry.getValue());
	    }
	}

}
