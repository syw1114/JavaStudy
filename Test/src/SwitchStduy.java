import java.util.Scanner;

public class SwitchStduy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int hand = scanner.nextInt();
		System.out.println("0 - 가위, 1 - 바위, 2 - 보");
		switch(hand) {
		case 0 : System.out.println("가위");break; //break -> 스위치문 탈출.
		case 1 : System.out.println("바위");break;
		case 2: System.out.println("보");break;
		default : System.out.println("잘못된 입력입니다"); break;  // default 어느 레이블과도 일치하지 않을 때 이동.
		}
	}

}
