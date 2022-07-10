package 클래스;

class XY{
	private static int counter = 0; // 식별번호를 몇번까지 할당했는가?
	private int id;
	
	private int x = 0;
	private int y = 0;
	
	{
		id = ++counter;
	}
	
	public XY() {}
	public XY(int x) {this.x = x;}
	public XY(int x, int y ) { this.x = x; this.y = y;}
	
	/*
	 * 만약에 인스턴스 초기화가 없으면
	 * public XY() { id = ++counter; }
	 * public XY(int x) { id = ++counter; this.x = x; }
	 * public XY(int x, int y) { id = ++counter; this.x = x; this.y = y;}
	 */
	
	@Override
	public String toString() {
		return "NO. [id=" + id + ", x=" + x + ", y=" + y + "]";
	}
}

public class XYTester {

	public static void main(String[] args) {
		XY a = new XY();  
		XY b = new XY(10);
		XY c = new XY(20,30);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

	}

}
