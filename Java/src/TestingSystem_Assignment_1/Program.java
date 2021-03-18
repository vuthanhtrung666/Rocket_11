package TestingSystem_Assignment_1;

import java.util.Date;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1 = new Department();
		d1.id = 1;
		d1.name = "Sale";
		Department d2 = new Department();
		d2.id = 2;
		d2.name = "Marketing";
		Department d3 = new Department();
		d3.id = 3;
		d3.name = "Support";
		
		Position p1 = new Position();
		p1.id = 1;
		p1.name = PositionName.DEV;
		Position p2 = new Position();
		p2.id = 2;
		p2.name = PositionName.PM;
		Position p3 = new Position();
		p3.id = 3;
		p3.name = PositionName.TEST;
		
		Group g1 = new Group();
		g1.id = 1;
		g1.name = "group1";
		g1.createDate = new Date("2019/03/05");
		Group g2 = new Group();
		g2.id = 2;
		g2.name = "group2";
		
		Account a1 = new Account();
		a1.id = 1;
		a1.email = "account01@gmail.com";
		a1.username = "lgoodge0";
		a1.fullname = "Lyman Goodge";
		a1.position = p1;
		a1.department = d1;
		a1.createDate = new Date("2017/04/09");
		Account a2 = new Account();
		a2.id = 2;
		a2.email = "account02@gmail.com";
		a2.username = "dgeertz1";
		a2.fullname = "Dal Geertz";
		a2.position = p1;
		a2.department = d1;
		a2.createDate = new Date("2020/09/13");
		Account a3 = new Account();
		a3.id = 3;
		a3.email = "account03@gmail.com";
		a3.username = "qharwick2";
		a3.fullname = "Quentin Harwick";
		a3.position = p1;
		a3.department = d1;
		a3.createDate = new Date("2018/01/23");
		
		GroupAccount ga1 = new GroupAccount();
		ga1.account = a1;
		ga1.group = g1;
		ga1.joinDate = new Date();
		GroupAccount ga2 = new GroupAccount();
		ga2.account = a1;
		ga2.group = g2;
		ga2.joinDate = new Date();
		
		GroupAccount[] groupAccounts1 = {ga1,ga2};
		a1.groupAccounts = groupAccounts1;
		
		GroupAccount[] groupAccounts2 = {ga1};
		g1.groupAccounts = groupAccounts2;
		GroupAccount[] groupAccounts3 = {ga2};
		g2.groupAccounts = groupAccounts3;
		
		TypeQuestion tq1 = new TypeQuestion();
		tq1.id = 1;
		tq1.name = TypeName.ESSAY;
		TypeQuestion tq2 = new TypeQuestion();
		tq2.id = 2;
		tq2.name = TypeName.MULTIPLECHOICE;
		
		CategoryQuestion cq1 = new CategoryQuestion();
		cq1.id = 1;
		cq1.name = CategoryName.JAVA;
		CategoryQuestion cq2 = new CategoryQuestion();
		cq2.id = 2;
		cq2.name = CategoryName.POSTMAN;
		CategoryQuestion cq3 = new CategoryQuestion();
		cq3.id = 3;
		cq3.name = CategoryName.SQL;
		
		Question q1 = new Question();
		q1.id = 1;
		q1.content = "Câu hỏi 1";
		q1.categoryQuestion = cq1;
		q1.typeQuestion = tq1;
		q1.account = a1;
		q1.createDate = new Date("2019/03/12");
		Question q2 = new Question();
		q2.id = 2;
		q2.content = "Câu hỏi 2";
		q2.categoryQuestion = cq1;
		q2.typeQuestion = tq2;
		q2.account = a1;
		q2.createDate = new Date("2019/03/13");
		Question q3 = new Question();
		q3.id = 3;
		q3.content = "Câu hỏi 3";
		q3.categoryQuestion = cq2;
		q3.typeQuestion = tq2;
		q3.account = a1;
		q3.createDate = new Date("2019/04/13");
		
		System.out.println("Account 1:");
		System.out.println("id:"+a1.id);
		System.out.println("username:"+a1.username);
		System.out.println("email:"+a1.email);
		System.out.println("fullname:"+a1.fullname);
		System.out.println("position:"+a1.position.name);
		System.out.println("department:"+a1.department.name);
		System.out.println("create date:"+a1.createDate);
		for(int i=0;i<groupAccounts1.length;i++) {
			System.out.println("group account:"+a1.groupAccounts[i].group.name);
		}
		System.out.println();
		System.out.println("Group 1:");
		System.out.println("id:"+g1.id);
		System.out.println("name:" + g1.name);
		for(int i=0;i<groupAccounts2.length;i++) {
			System.out.println("account:" + g1.groupAccounts[i].account.fullname);
		}
		System.out.println("create date:" + g1.createDate);
	}

}
