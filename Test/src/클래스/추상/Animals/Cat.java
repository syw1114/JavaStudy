package 클래스.추상.Animals;

public class Cat extends Animal{
	private int age;

	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}
	public void bark() { System.out.println("야옹!!");
	}
	public String toString() {
		return age+ "살인" + getName();
	}
}
