package 문자열;

import java.util.Scanner;

public class Tester1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열 s1 : ");
			String s1 = scanner.next();
		System.out.print("문자열 s2 : ");
			String s2 = scanner.next();
			
			
		for(int i = 0; i<s1.length(); i++) {
			System.out.println("s1[" + i + "] = " + s1.charAt(i));
		}
		for(int i = 0; i<s2.length(); i++) {
			System.out.println("s2[" + i + "] = " + s2.charAt(i));
		}
		
		int idx = s1.indexOf(s2);
		if(idx == -1)
			System.out.println("s1 안에 s2는 포함되어 있지 않습니다.");
		else
			System.out.println("s1의 " + (idx + 1) + "번째 문자에 s2가 포함되어 있습니다.");
		
		if(s1.equals(s2))
			System.out.println("s1과 s2의 내용은 같습니다");
		else
			System.out.println("s1과 s2의 내용은 다릅니다");
		
		for(int i = 0; i<=4; i++) {
			System.out.printf(String.format("%%%dd\n", i), 5);
		}
		System.out.println("문자열 \"123\" 을 정수 값으로 변환한 결과 : " + Integer.parseInt("123"));
		System.out.println("문자열 \"123.45\" 를 부동소수점으로 변환한 결과 : " + Double.parseDouble("123.45"));
	}
}
