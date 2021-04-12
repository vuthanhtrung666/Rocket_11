package TestingSystem_Assignment_8.com.vti.entity.exer4;

public class MyNumber<N extends Number> {
	private N number;

	public N getNumber() {
		return number;
	}

	public void setNumber(N number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "MyNumber [number=" + number + "]";
	}

}
