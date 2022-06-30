import java.util.Scanner;

import javax.net.ssl.SNIHostName;

public class IfStudy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * 실행결과와 같이 정숫값을 입력하면 그 절대값을 구해서 표시하는 프로그램을 작성하시오.
		 *
		  System.out.print("정수값: ");
		  int a = scanner.nextInt();
		  System.out.println("절대값은 "+ Math.abs(a) + "입니다.");
		 *
		 */
		
		/*
		 * 실행 예와 같이 두 양의 정수값을 입력해서 후자가 전자의 약수라면 'B는 A의 약수입니다' 라고 표시하고,
		 * 그렇지 않으면 'B는 A의 약수가 아닙니다' 라고 표시하는 프로그램을 작성하시오.
		 *
		  System.out.print("정수 A: ");
		  int a = scanner.nextInt();
		  System.out.print("정수 B: ");
		  int b = scanner.nextInt();
		
		  if(a % b == 0) {
			System.out.println("B는 A의 약수입니다.");
		  }else {
			System.out.println("B는 A의 약수가 아닙니");
		  }	
		 */
		
		/*
		 * 두 변수 a,b에 값을 입력한 후 그 대소관계를 다음 세 가지 문 중에서 하나가 표시되는 프로그램을 작성하시오.
		 * 'a'가 큽니다, 'b'가 큽니다, 'a와b가 같은 값입니다'
		 * 
		  int a = scanner.nextInt();
		  int b = scanner.nextInt();
		
		  if(a > b) System.out.println("a가 큽니다");
		  else if(a < b) System.out.println("b가 큽니다");
		  else System.out.println("a와 b가 같은 값입니다");
		 */
		
		/*
		 * 두 값을 오름차순으로 정
		 * 
		  System.out.print("변수a : ");
		  int a = scanner.nextInt();
		  System.out.print("변수b : ");
		  int b = scanner.nextInt();
		
		  if(a>b) {
			  int t = a;
			  a = b;
			  b = t;
		  }
		  System.out.println("정렬 " + a + " " + b);
		 */
		
	}

}
