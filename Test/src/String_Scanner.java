//문자열 입력
import java.util.Scanner;
public class String_Scanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름은 : ");
		String s = scanner.next(); // 문자열 입력.
		//String s = scanner.nextLine();  공백문자를 포함한 문자열을 한 줄 입력.
		System.out.println("안녕하세요 " + s + "씨!");
		
		/*
		 * 
		 * String s1 = "ABC"; //초기화
		 * String s2 = "XYZ"; //초기화
		 * 
		 * s1 = "FBI" // 대입(값을 변경)
		 * System.out.println("문자열s1은 " + s1 + "입니다");
		 * System.out.println("문자열s2은 " + s2 + "입니다");
		 * 
		 */
		
	}

}
