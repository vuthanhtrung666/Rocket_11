package TestingSystem_Assignment_4.com.vti.entity;

public class TypeQuestion {
	private int id;
	private TypeName name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TypeName getName() {
		return name;
	}
	public void setName(TypeName name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "\nTypeQuestion \n[id=" + id + ",\n name=" + name + "]";
	}
	
}
