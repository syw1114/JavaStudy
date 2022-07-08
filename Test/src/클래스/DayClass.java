package 클래스;


public class DayClass {
	private int year;
	private int month;
	private int date;
	
	// -----  생성자  ----- //
	DayClass(int year, int month, int date){
		this.year = year;
		this.month = month;
		this.date = date;
	}
	// ----- 년, 월, 일을 취득 ----- //
	/*
	 * 필드의 값을 취득하는 메소드를 getter
	 * 
	 */
	int getYear() {
		return year;
	}

	int getMonth() {
		return month;
	}
	
	int getDate() {
		return date;
	}
	// ----- 년, 월, 일을 설정 ----- //
	/*
	 * 필드의 값을 설정하는 메소드를 setter라고 한다.
	 * 
	 * getter,setter을 accessor이라고 한다.
	 * 
	 */
	void setYear(int year) {
		this.year = year;
	}

	void setMonth(int month) {
		this.month = month;
	}

	void setDate(int date) {
		this.date = date;
	}
	
	void DayClass(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	// --- 요일을 계산 --- //
	int dayOfWeek() {
		int y = year; // 0 일요일 ~ 6 토요일
		int m = month;
		if(m == 1 || m == 2) {
			y--;
			m +=12;
		}
		return (y+y / 4-y / 100+7 / 400+(13*m+8) / 5+date) % 7;
	}
}
