package TestingSystem_Assignment_4.com.vti.entity.Exer4;

public class Student {
	private int id;
	private String name;
	private String homeTown;
	private int academicGrade;
	
	public Student(int id, String name, String homeTown) {
		this.id = id;
		this.name = name;
		this.homeTown = homeTown;
		this.academicGrade = 0;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	public int getAcademicGrade() {
		return academicGrade;
	}
	public void setAcademicGrade(int academicGrade) {
		this.academicGrade = academicGrade;
	}
	
	public void addGrade(int a) {
		if(this.academicGrade + a <10) {
			this.academicGrade = this.academicGrade + a;
		}
	}
	
	public String academic() {
		String academic = "";
		if(academicGrade <= 4) {
			academic = "Yếu";
		} else if (academicGrade>4 && academicGrade<=6) {
			academic = "Trung bình";
		} else if (academicGrade>6 && academicGrade<=8) {
			academic = "Khá";
		} else if (academicGrade>8) {
			academic = "Giỏi";
		}
		return "\nName:" + name + "\nAcademic Grade:" + academicGrade +
				"\nAcademic:" + academic;
	}
	
	@Override
	public String toString() {
		return "\nStudent \n[id=" + id + ", name=" + name + 
				", homeTown=" + homeTown + ", academicGrade=" + academicGrade + "]";
	}
	
	
}
