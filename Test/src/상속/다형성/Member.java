package 상속.다형성;

public class Member {
	private String name;
	private int no;
	private int age;
	
	public Member(String name, int no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void print() {
		System.out.println("Member [name=" + name + ", no=" + no + ", age=" + age + "]");
	}
}
