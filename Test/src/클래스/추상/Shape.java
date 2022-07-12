package 클래스.추상;


/*
 * 메소드 앞에 선언된 abstract는 여기에서는 메소드의 실체를 정의할 수 없기 때문에 나로부터 파생된 클래스에서 정의해 주십시오
 * 라는 의미를 가진다.
 * 
 * 추상메소드는 본체가 없기 때문에 { } 대신에 ;을이용한다. 설령 아무것도 없어도 블록 { } 을 사용해서는 안된다.
 * 
 * 
 * 클래스 Point와 Rectangle에서는 메소드 draw를 오버라이드해서 본체를 정희하고 있다.
 * 	이와같이 추상클래스로부터 파생된 클래스에서 추상 메소드를 오버라이드해서 본체를 정의하는 것을 메소드를 구현한다 라고 한다.
 * 
 * 클래스 Point와 Rectangle은 추상 클래스 Shape의 메소드 draw를 구현하고 있다.
 * 
 * 
 *	Shape와 같이 추상 메소드를 1개라도 갖는 클래스는 반드시 추상 클래스로 선언해야한다.
 *	대신, 추상 클래스는 추상 메소드를 갖지 않아도 된다.
 * 
 */


// === 도형 === //
abstract class Shape {
	abstract void draw();  // 그리기(추상 메소드)
}
// === 점 === //
class Point extends Shape{
	Point(){} // 생성자
	void draw() {
		System.out.println('+');
	}
}
// === 직사각형 === //
class Rectangle extends Shape{
	private int width;
	private int height;
	
	Rectangle(int width, int height) { // 생성자
		this.width = width;
		this.height = height;
	}
	
	void draw() {
		for(int i = 0; i<=height; i++) {
			for(int j = 0; j<=width; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
}