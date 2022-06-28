//키보드를 이용한 입력.
import java.util.Scanner; // 키보드를 이용한 입력을 사용하기위해선 스캐너를 선언해줘야 사용가능.
public class Scan {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); // System.in은 키보드와 연결된 표준 출력 스트림입니다.
		
		System.out.println("x와Y의 사칙연산을 합니다.");
		
		System.out.println("x의 값 : "); // x값의 입력을 요
		// int x = stdIn.nextInt(); // x에 정수값을 입력. nextInt()는 키보드에서 입력된 '값'
		double x = stdIn.nextDouble(); //x에 실숫값을 입력.
		
		System.out.println("y의 값 : ");
		// int y = stdIn.nextInt(); // y에 정수값을 입력.
		double y = stdIn.nextDouble(); //y에 실숫값을 입력 
		
	    /*
	     * 키보드로 int형 정수값을 입력할 경우에는 nextInt();
	     * double형 실숫값을 입력할 경우에는 nextDouble();
	     */
		
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x % y = " + (x % y));
		
		
	}

}
