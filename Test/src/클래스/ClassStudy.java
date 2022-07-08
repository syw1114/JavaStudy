package 클래스;

import java.awt.geom.CubicCurve2D;

class Account {
	String name; 
	String no;
	long balance;
}

public class ClassStudy {
	/*
	 *  은행게좌 클래스 클래스 선언.
	 *  은행게좌 클래스는 세 개으 필드가 세트로 되어 있다.
	 *  데이터 보호에 대한 무보증.
	 */
	
private void mian() {
	//클래스의 생성
	Account chulsoo = new Account(); // Account형의 chulsoo
	
	chulsoo.name = "철수"; // 철수의 계좌명의
	
	
	// ========================================= //
	
	/*
	 * private 선언된 필드는 클래스의 외부에 대해서 비공개가 된다.
	 * getName , getNo, getBalance 메소드 
	 */
	class Account2 {
		private String name;
		private String no;
		private long balance;
		
		
	// --- 생성자 --- //
		Account2(String n, String num, long z){
			name = n;
			no = num;
			balance = z;
		}
	// --- 계좌명의를 검색한다 --- //
		String getName() {
			return name;
		}
	// --- 계좌번호를 검색한다 --- //
		String getNo() {
			return no;
		}
	// --- 예금잔고를 검색한다 --- //
		long getBalance() {
			return balance;
		}
	// --- k원을 예금한다 --- //
		void deposit(long k) {
			balance += k;
		}
	// --- k원을 인출한다 --- //
		void withdraw(long k) {
			balance -= k;
		}	
	}
	Account2 chulsoo1 = new Account2("철수", "123456", 1000); // 생성
}
}
