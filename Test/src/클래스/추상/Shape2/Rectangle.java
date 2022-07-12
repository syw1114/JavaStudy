package 클래스.추상.Shape2;
/**
 * 직사각형을 나타내는 클래스
 * 추상클래스 Shape로 부터 파생된 클래스.
 * @author seoyeong-u
 *
 */
public class Rectangle extends Shape {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public String toString() {
		return "Rectangle (width:" + width + ", height=" + height + ")";
	}
	
	public void draw() {
		for(int i = 1; i<=height; i++) {
			for(int j = 1; j<=width; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
