package 클래스.추상.Shape2;

public class ShapeTester {
	public static void main(String[] args) {
		Shape[] p = new Shape[4];
		
		p[0] = new Point(); // 점
		p[1] = new HorzLine(5); // 수평직선
		p[2] = new VirtLine(3); // 수직직선
		p[3] = new Rectangle(4,3); // 직사각형
		
		for(Shape s : p) {
			s.print();
			System.out.println();
		}
	}
}
