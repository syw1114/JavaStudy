package 클래스.추상;

public class ShapeTester {

	public static void main(String[] args) {
		// 추상 클래스는 구체적인 정의가 없는 메소드를 갖고 있기 때문에 new Shape()에 의한 인스턴스를 생성할 수 없다.
		// Shape s = new Shape();     에러이유 : 추상 클래스는 인스턴스로 할 수 없다.
		
		Shape[] a = new Shape[2];
		a[0] = new Point();
		a[1] = new Rectangle(4, 3);
		
		for(Shape m : a ) {
			m.draw();
			System.out.println();
		}
		// 똑같다.
		for(int i = 0; i < a.length; i++) {
			a[i].draw();
			System.out.println();
		}

	}

}
