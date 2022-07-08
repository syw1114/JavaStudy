package 클래스;

public class Account1 {
	private static int counter = 0; //식별번호를 몇 번까지 할당했는가?
	
	private String name; // 계좌명의
	private String no; // 계좌번호
	private long balance; // 예금잔고
	private int id; // 식별번호 
	
	//-- 생성자 -- //
	
	public Account1(String n, String num, long z) {
		name = n;
		no = num;
		balance = z;
		id = ++counter;
	}

	public static int getCounter() {
		return counter;
	}

	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}

	public long getBalance() {
		return balance;
	}
	// 식별번호를 취득
	public int getId() {
		return id;
	}
	// k원을 예금
	public void deopsit(long k) {
		balance += k;
	}
	// k원을 인출
	public void withdraw(long k) {
		balance -= k;
	}
	
	public static void main(String[] args) {
		Account1 chulsoo = new Account1("철수", "123456", 1000);
		Account1 younghee = new Account1("영희", "654321", 200);
		
		System.out.println("철수의 계좌");
		System.out.println("계좌명의 : " + chulsoo.getName());
		System.out.println("계좌번호 : " + chulsoo.getNo());
		System.out.println("예금잔고 : " + chulsoo.getBalance());
		System.out.println("식별번호 : " + chulsoo.getId());
		
		System.out.println("영희 계좌");
		System.out.println("계좌명의 : " + younghee.getName());
		System.out.println("계좌번호 : " + younghee.getNo());
		System.out.println("예금잔고 : " + younghee.getBalance());
		System.out.println("식별번호 : " + younghee.getId());
		
	}
}
