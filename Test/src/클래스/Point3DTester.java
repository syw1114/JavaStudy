package 클래스;

public class Point3DTester {

	public static void main(String[] args) {
		Point3D p1 = new Point3D();
		Point3D p2 = new Point3D(1);
		Point3D p3 = new Point3D(2,3);
		Point3D p4 = new Point3D(4,5,6);
		
		
		System.out.println("마지막으로 할당된 식별번호 : " + Point3D.getCounter());
		System.out.println("p1 = " + p1 + " 식별번호 : " + p1.getId());
		System.out.println("p2 = " + p2 + " 식별번호 : " + p2.getId());
		System.out.println("p3 = " + p3 + " 식별번호 : " + p3.getId());
		System.out.println("p4 = " + p4 + " 식별번호 : " + p4.getId());

	}

}
