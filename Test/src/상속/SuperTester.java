package 상속;

//상위 클래스
class Base {
	
	/*
	 * protected로 선언된 멤버는 패키지 외부라도 하위 클래스에서 액세스할 수 있는 '한정공개 액세스'가 됨
	 * 
	 * 상위 클래스의 메소드와 동일한 형식의 메소드를 하위 클래스에서 다시 정의하고 수정하는 것을 오버라이드 라고 표현한다.
	 * 
	 */
	protected int x;
	
	Base(){ this.x = 0; }
	Base(int x) { this.x = x; }
	
	void print() { System.out.println("Base.x = " + x); }
	
}

//하위 클래스
class Derived extends Base{
	int x;
	
	Derived(int x1, int x2){
		super.x = x1; // Base의 x
		this.x = x2; // Derived의 x
	}
	//상위 클래스의 메소드를 오버라이드
	void print() { 
		super.print();
		System.out.println("Derived.x = " + x);
	}
}

public class SuperTester {

	public static void main(String[] args) {
		Base a = new Base(10);
		System.out.println("-- a --");
		a.print();
		Derived b = new Derived(20, 30);
		System.out.println("-- b --");
		b.print();
	}

}
