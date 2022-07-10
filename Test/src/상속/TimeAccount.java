package 상속;

class TimeAccount{
	private String name;
	private String no;
	private long balance;
	private long timeBalance;
	//생성자
	public TimeAccount(String name, String no, long balance, long timeBalance) {
		super();
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.timeBalance = timeBalance;
	}
	String getName() {
		return name;
	}
	String getNo() {
		return no;
	}
	long getBalance() {
		return balance;
	}
	//정기예금 잔고를 검색
	long getTimeBalance() {
		return timeBalance;
	}
	void deposit(long k) {
		balance += k;
	}
	void withdraw(long k) {
		balance -= k;
	}
	
	void cancle() {
		balance += timeBalance;
		timeBalance = 0;
	}
}
