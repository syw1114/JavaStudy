package 클래스;

class Static {
	private static int s; // 정적필드(클래스 변수)
	private int a; // 비정적 필드(인스턴스 변수)

	public static void m1() {} // 정적 메소드(클래스 메소드)
	public void f1() {} // 비정적 메소드(인스턴스 메소드)
	
	public static void m2(int x) {
		s = x;  // 정적 필드에는 액세스 가능
	//	a = x;  비정적 필드에는 액세스 불가(에러)
		m1();  // 정적 메소드는 호출 가
	//	f1();  비정적 메소드는 호출 불가(에러)
	}
	public void f2(int x) {
		s = x;  // 정적 필드에는 액세스 가능
		a = x; // 비정적 필드에는 액세스 가능
		m1();  // 정적 메소드에는 액세스 가능
		f1();  // 비정적 메소드에는 액세스 가능
		System.out.println("s = " + s + " a = " + a);
	}
}
public class StaticTester {

	public static void main(String[] args) {
		Static c1 = new Static();
		Static c2 = new Static();
		
		Static.m2(5);
		c1.f2(10);
		c2.f2(20);

	}

}
