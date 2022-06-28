//난수 생성.
import java.util.Random;
import java.util.Scanner;
public class Random_Variable {

	public static void main(String[] args) {
		Random num = new Random();
		
		int lucky = num.nextInt(10); // 0~9의 난수
		int a  = -lucky;
		int b = num.nextInt(100);
		/*
		 * 1자릿수의 양의 정숫값을 난수로 생성해서 표시
		 * 1자리수의 음의 정수값을 난수로 생성해서 표시.
		 * 2자리수의 양의 정수값을 난수로 생성해서 표시.
		 */
		
		System.out.println("오늘의 행운의 숫자는 " + lucky + "입니다.");
		System.out.println("오늘의 행운의 숫자는 " + a + "입니다.");
		System.out.println("오늘의 행운의 숫자는 " + b + "입니다.");
		
		/*
		 * 키보드로 입력한 정수값 ±5의 볌위 내에서 정수값을 난수로 생성해서 표시.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int c = scanner.nextInt();
		int d = num.nextInt(10) - 5; // 음수와 양수의 랜덤값을 표현하고싶으면  nextInt()메소드 뒤에 음수값을 넣어주면됩니다.
		
		System.out.println("이 값의 ±5의 난수를 생성했습니다.\n생성한 난수는 " + (c+d) + "입니다");
	
	}

}
