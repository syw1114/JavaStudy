package 상속.다형성;

public class SpecialMember extends Member{
	private String privilege; // 특권

	public SpecialMember(String name, int no, int age, String privilege) {
		super(name, no, age);
		this.privilege = privilege;
	}
	
	@Override
	public void print() {
		super.print(); // 상위 클래스의 생성자/메소드 호출.
		System.out.println("특전 : " + privilege);
	}
	
}
