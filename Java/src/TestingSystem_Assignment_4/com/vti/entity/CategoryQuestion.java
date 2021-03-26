package TestingSystem_Assignment_4.com.vti.entity;

public class CategoryQuestion {
	private int id;
	private CategoryName name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CategoryName getName() {
		return name;
	}
	public void setName(CategoryName name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "\nId:" + id + "\nName:" + name;
	}
	
}
