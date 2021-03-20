package TestingSystem_Assignment_2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Exercise_2 {
	public static void main(String[] args) {
		//question 1
		int a=5;
		System.out.printf("%d\n",a);
		
		//question 2
		a = 100000000;
		System.out.printf("%,d\n",a);
		
		//question 3
		float b = 5.567098f;
		System.out.printf("%1.4f\n",b);
		
		//question 4
		Student student1 = new Student();
		student1.name = "Nguyễn Văn A";
		Student student2 = new Student();
		student2.name = "Nguyễn Văn B";
		Student student3 = new Student();
		student3.name = "Nguyễn Văn C";
		
		System.out.printf("Tên tôi là %s và tôi đang độc thân\n",student2.name);
		
		//question 5
		String patternString = "dd/MM/yyyy HH:mm:ss";
		SimpleDateFormat sFormat = new SimpleDateFormat(patternString);
		String date = sFormat.format(new Date());
		System.out.println(date);
	}
}
