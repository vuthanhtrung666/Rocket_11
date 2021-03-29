package TestingSystem_Assignment_4.com.vti.entity.Exer5;

public class HighSchoolStudent extends Student {
	private String clazz;
	private String desiredUniversity;

	public HighSchoolStudent(String name, int id, String clazz, String desiredUniversity) {
		super(name, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getDesiredUniversity() {
		return desiredUniversity;
	}

	public void setDesiredUniversity(String desiredUniversity) {
		this.desiredUniversity = desiredUniversity;
	}

	@Override
	public String toString() {
		return "HighSchoolStudent \n[id:"+getId()+"| name:"+getName()+"| class:"+getClazz()+
				"| desired university:"+getDesiredUniversity()+"]";
	}

	

	
	
}
