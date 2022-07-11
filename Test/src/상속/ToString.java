package 상속;

/**
 * 
 * 클래스 X는 암묵적으로 Object 클래스로부터 파생하고 클래스 Y는 클래스 X로부터 파생하고 있다.
 * print에 전달되는 가인수 obj형은 Object형이기 때문에 모든 클래스형의 인스턴스 참조를 obj에 전달할수있음.
 * main메소드를 보면 X형의 인스턴스 x와 Y형의 인스턴스 y와 int형의 배열 c를 생성하고 이 객체의 참조를 메소드 print에 전달하고있음.
 *
 */


class X { //Object 의 자식
	public String toString() {
		return "Class X";
	}
}
class Y extends X{ //Object 의 손자
	public String toString() {
		return "Class Y";
	}
}
public class ToString {
	static void print(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		
		int[] c = new int[5];
		
		print(x);
		print(y);
		print(c);
	}
}
