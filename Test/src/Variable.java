//변수

public class Variable {

	public static void main(String[] args) {
		System.out.println(57+32);
		/*
		 * 57과32와 같은 정수표시를 정수리터럴, 예를 들어 57은 정수리터럴 이고, "57"은 문자열리터럴이다.
		 * 
		 */
		System.out.println("57+32 =" + 57 + 32); //문자열 연결과 수치의 덧셈을 실행하는 +는 왼쪽부터 순차적으로실행.
		// 5732로 표시되는것은 '57' '32'가 연결되어 표시되고 있는 것.
		
		/*
		 * int는 정수를 의미하는 변수. 예를들어 3.5라는 실수는 취급할 수 없습니다.
		 */
		int x; 
		int y;
		
		x = 63; // x에 63을 대입.
		y = 18;
		
		System.out.println(x); // x의 값을 표시.
		System.out.println(y); // y의 값을 표시.
		
		System.out.println("합계는 "+ (x+y) + "입니다 "); // 합계를 표시
		System.out.println("평균은 "+ (x+y)/2 + "입니다 "); 
		
		/*
		 * int x,y  int형 x와y를 한번에 선언.
		 * int x = 63;
		 * int y = 18;
		 * 이렇게도 가능 int x =63, y = 18;
		 * 
		 * x를 선언함과 동시에 값을 대입.
		 * 
		 * 
		 */
	}

}
