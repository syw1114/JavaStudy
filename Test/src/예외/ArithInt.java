package 예외;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
 * try {
 * 	// 뭔가를 처리
 * }
 * catch(ExpA e){
 *	// 처리 한다.
 * }
 * catch(ExpB E){
 * 	// 처리 한다.
 * }
 * finally{
 *	// 뒤처리
 * }
 * 
 */


public class ArithInt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("X와 Y의 사칙연산을 합니다.");
		
		while(true) {
			try {
				System.out.println("X의 값 : ");
				int x = scanner.nextInt();
				
				System.out.println("Y의 값 : ");
				int y = scanner.nextInt();
				
				System.out.println("x + y = " + (x + y));
				System.out.println("x - y = " + (x - y));
				System.out.println("x * y = " + (x * y));
				System.out.println("x / y = " + (x / y)); 
				System.out.println("x % y = " + (x % y));
			} catch (InputMismatchException e) {
				System.out.println("입력 오류 발생." + e);
				String s = scanner.next();
				System.out.println(s + "는 무시했습니다.");
			} catch ( ArithmeticException e) {
				System.out.println("산술 오류 발생." + e);
				System.out.println("오류가 나지 않는 수치를 입력해 주세요.");
			} finally {
				System.out.println("---------------------");
				System.out.print("한번 더? (1.예 / 2.아니오) : ");
				int retry = scanner.nextInt();
				if(retry == 2) break;
				System.out.println("---------------------");
			}
		}
	}

}
