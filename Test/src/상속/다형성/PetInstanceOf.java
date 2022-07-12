package 상속.다형성;

public class PetInstanceOf {
	public static void main(String[] args) {
		Pet[] a = {
				new Pet("Kurt","아이"),
				new RobotPet("R2D2","루크"),
				new Pet("마이클","조던"),
		};
	
		for(int i =0; i< a.length; i++) {
			System.out.println("a[" + i + "] ");
			
			/*
			 * x instaanceof x
			 * 변수 x가 형 t로에 암묵적으로 캐스트할 수 있는 하위클래스면 true, 그렇지않으면 false생성.
			 * 
			 * if(a[i[\] instanceof Pet   // Pet을 포함해서  Pet의 하위 클래스면 true가 된다.
			 * 		a[i].introduce();    // 즉, a[i]가 Pet이든 RobotPet이든 실행된다.
			 * else 
			 * 		((RobotPet)a[i]).work(0); // 실행되지 않는다.
			 * 
			 */
			
			if(a[i] instanceof RobotPet) //a[i]가 로봇이면
				((RobotPet)a[i]).work(0); // 집안 일(청소)
			else // 그렇지 않으면
				a[i].introduce(); // 자기소개
			
			
		}
	}
}
