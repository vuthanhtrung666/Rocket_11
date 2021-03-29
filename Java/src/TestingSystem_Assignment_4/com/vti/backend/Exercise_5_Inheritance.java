package TestingSystem_Assignment_4.com.vti.backend;

import TestingSystem_Assignment_4.com.vti.entity.Exer5.HighSchoolStudent;

public class Exercise_5_Inheritance {
//	Question 3 (Optional): constructor inheritance
//	Tạo class abstract Person gồm các property name và tạo constructor có
//	1 parameter name
//	Tạo class abstract Student kế thừa Person gồm các property id, name
//	và tạo constructor có 2 parameter id, name
//	Tạo class HighSchoolStudent kế thừa Student bao gồm các property id,
//	name, clazz (Lớp đang học), desiredUniversity (trường đại học mong
//	muốn vào) và tạo constructor có 4 parameter id, name, clazz,
//	desiredUniversity.
//	Hãy khởi tạo Object HighSchoolStudent với các giá trị: id = 1, name =
//	"Nam", clazz = "Chuyên Văn", desiredUniversity = "Đại học công
//	nghệ"
	public static void main(String[] args) {
		HighSchoolStudent hStudent =  new HighSchoolStudent("Nam", 1, "Chuyên Văn", "Đại học công nghệ");
		System.out.println(hStudent);
	}
}
