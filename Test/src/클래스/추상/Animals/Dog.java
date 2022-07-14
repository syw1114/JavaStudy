package 클래스.추상.Animals;

public class Dog extends Animal {
	public String type;

	public Dog(String name, String type) {
		super(name);
		this.type = type;
	}
	
	public void bark() {
		System.out.println("멍멍!");
	}

	@Override
	public String toString() {
		return type + "인" + getName();
	}
}
