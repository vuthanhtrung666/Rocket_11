package com.vti.frontend;

import java.util.List;

import com.vti.backend.Repository;
import com.vti.entity.Answer;
import com.vti.entity.Exam;
import com.vti.entity.Group;
import com.vti.entity.Image;
import com.vti.entity.Question;
import com.vti.entity.QuestionCategory;
import com.vti.entity.QuestionLevel;
import com.vti.entity.RegistrationUserToken;
import com.vti.entity.ResetPasswordToken;
import com.vti.entity.TestingCategory;
import com.vti.entity.User;
import com.vti.entity.UserGroup;
import com.vti.utils.ScannerUtils;


public class Program {
	
	public static void main(String[] args) {
		Repository repository = new Repository();
		int choose;
		do {
			menu();
			System.out.print("Mời bạn chọn chức năng:");
			choose = ScannerUtils.inputInt("Xin nhap so.");
			switch (choose) {
			case 1:
				System.out.println("***********GET ALL TESTING CATEGORY***********");
				List<TestingCategory> TestingCategorys = repository.getAllTestingCategorys();
				for (TestingCategory TestingCategory : TestingCategorys) {
					System.out.println(TestingCategory);
				}
				break;
			case 2:
				System.out.println("***********GET ALL GROUP***********");
				List<Group> Groups = repository.getAllGroups();
				for (Group Group : Groups) {
					System.out.println(Group);
				}
				break;
			case 3:
				System.out.println("***********GET ALL USER***********");
				List<User> Users = repository.getAllUsers();
				for (User User : Users) {
					System.out.println(User);
				}
				break;
			case 4:
				System.out.println("***********GET ALL REGISTRATION USER TOKEN***********");
				List<RegistrationUserToken> RegistrationUserTokens = repository.getAllRegistrationUserTokens();
				for (RegistrationUserToken RegistrationUserToken : RegistrationUserTokens) {
					System.out.println(RegistrationUserToken);
				}
				break;
			case 5:
				System.out.println("***********GET ALL ANSWER***********");
				List<Answer> Answers = repository.getAllAnswers();
				for (Answer Answer : Answers) {
					System.out.println(Answer);
				}
				break;
			case 6:
				System.out.println("***********GET ALL EXAM***********");
				List<Exam> Exams = repository.getAllExams();
				for (Exam Exam : Exams) {
					System.out.println(Exam);
				}
				break;
			case 7:
				System.out.println("***********GET ALL IMAGE***********");
				List<Image> Images = repository.getAllImages();
				for (Image Image : Images) {
					System.out.println(Image);
				}
				break;
			case 8:
				System.out.println("***********GET ALL QUESTION***********");
				List<Question> Questions = repository.getAllQuestions();
				for (Question Question : Questions) {
					System.out.println(Question);
				}
				break;
			case 9:
				System.out.println("***********GET ALL RESET PASSWORD TOKEN***********");
				List<ResetPasswordToken> ResetPasswordTokens = repository.getAllResetPasswordTokens();
				for (ResetPasswordToken ResetPasswordToken : ResetPasswordTokens) {
					System.out.println(ResetPasswordToken);
				}
				break;
			case 10:
				System.out.println("***********GET ALL QUESTION CATEGORY***********");
				List<QuestionCategory> QuestionCategorys = repository.getAllQuestionCategorys();
				for (QuestionCategory QuestionCategory : QuestionCategorys) {
					System.out.println(QuestionCategory);
				}
				break;
			case 11:
				System.out.println("***********GET ALL QUESTION LEVEL***********");
				List<QuestionLevel> QuestionLevels = repository.getAllQuestionLevels();
				for (QuestionLevel QuestionLevel : QuestionLevels) {
					System.out.println(QuestionLevel);
				}
				break;
			case 12:
//				System.out.println("***********CREATE USER***********");
//				User userCreate = new User();
//				userCreate.setUsername("Trung123456789");
//				userCreate.setEmail("Trung123456789");
//				userCreate.setAddress("Trung123456789");
//				userCreate.setFirstName("Trung123456789");
//				userCreate.setGender(Gender.M);
//				userCreate.setLastName("Trung123456789");
//				userCreate.setPhone("1111111111");
//				userCreate.setDateOfBirth(new Date("2000/04/24"));
//				userCreate.setPassword("1111111111");
//				userCreate.setRole(Role.Employee);
//				userCreate.setStatus(Status.NotActive);
//				repository.createUser(userCreate);
				System.out.println("***********GET ALL USER GROUP***********");
				List<UserGroup> UserGroups = repository.getAllUserGroups();
				for (UserGroup UserGroup : UserGroups) {
					System.out.println(UserGroup);
				}
				break;
			case 13:
//				System.out.println("***********DELETE DEPARTMENTS***********");
//				repository.deleteUser((short) 17);
				break;
			case 0:
				System.out.println("Thoát!");
				return;
			default:
				System.out.println("Nhập sai. Xin nhập lại!");
				break;
			}
		} while(choose != 0);
	}
	
	public static void menu() {
		System.out.println("------MENU------");
		System.out.println("1) TestingCategory");
		System.out.println("2) Group");
		System.out.println("3) User");
		System.out.println("4) RegistrationUserToken");
		System.out.println("5) Answer");
		System.out.println("6) Exam");
		System.out.println("7) Image");
		System.out.println("8) Question");
		System.out.println("9) ResetPasswordToken");
		System.out.println("10) QuestionCategory");
		System.out.println("11) Question level");
		System.out.println("12) Group User");
//		System.out.println("13) Delete User");
		System.out.println("0) Thoát");
	}
}
