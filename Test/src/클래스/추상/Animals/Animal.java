package 클래스.추상.Animals;

public abstract class Animal {
	private String name;
	
	public Animal (String name) {
		this.name = name;
	}
	public abstract void bark();   // 짖는다.
	public abstract String toString(); // 문자열 표현을 반환.
	
	public String getName() {
		return name;
	}
	
	public void introduce() {
		System.out.print(toString() + "입니다. ");
		bark();
	}
}
