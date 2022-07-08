package 클래스;

public class Point2D {
	private int x = 0;
	private int y = 0;
	
	public Point2D() {}
	
	public Point2D(int x, int y) {
		set(x,y);
	}

	public Point2D(Point2D p) {
		this(p.x, p.y);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void set(int x, int y) {
		setX(x);
		setY(y);
	}
	
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
}
