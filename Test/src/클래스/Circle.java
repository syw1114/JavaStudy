package 클래스;

public class Circle {
	
	private Point2D center;
	private int radius = 0;
	
	public Circle() {
		center = new Point2D();
	}
	public Circle(Point2D c, int radius) {
		center = new Point2D(c); this.radius = radius;
	}
	public Point2D getCenter() {
		return new Point2D(center);
	}
	public void setCenter(Point2D c) {
		center.set(c.getX(),c.getY());
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + "]";
	}
	
	
}
