package 상속;
/*
 * 상위 클래스의 생성자는 super를 이용해서 호출할 수 있다.
 */
class Point2D{
	int x;
	int y;
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Y좌표 취득
	public int getX() {
		return x;
	}

	// X좌표 설정
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

class Point3D extends Point2D{
	int z;
	
	Point3D(int x , int y , int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
}
public class PointTester {
	public static void main(String[] args) {
		Point2D a = new Point2D(10, 15);
		Point3D b = new Point3D(20, 30, 40);
		
		System.out.printf("a = (%d, %d)\n", a.getX(),a.getY());
		System.out.printf("b = (%d, %d, %d)\n", b.getX(),b.getY(), b.getZ());
	}
}
