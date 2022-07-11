package 상속.다형성;

public class PetTester1 {
	public static void main(String[] args) {
		Pet kurt = new Pet("Kurt","아이");
		kurt.introduce();
		System.out.println();
		
		RobotPet r2d2 = new RobotPet("R2D2", "루크");
		r2d2.introduce();
		System.out.println();
		
		Pet p = r2d2;
		p.introduce();
	}
}
