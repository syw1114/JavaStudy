//Final사용
import java.util.Scanner;
public class Final_Variable {

	public static void main(String[] args) {
		final double PI = 3.1416;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("반지름 : ");
		double r = scanner.nextDouble();
		
		System.out.println("원주의 길이는 " + 2 * PI * r + "입니다");
		System.out.println("면적은 " + PI * r * r + "입니다");
		
		//final은 마지막 이라는 의미이다. 한번 값을 입력하고 나면 변경할 수 없다. 변경하고싶으면 final 변수의 값을 바꿔야한다.
	}

}
