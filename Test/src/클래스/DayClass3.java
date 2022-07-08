package 클래스;

public class DayClass3 {
	public class Day{
		private int year;
		private int month;
		private int date;
		
	public Day() {}
	
	public Day(int year) {
		this.year = year;
	}
	public Day(int year, int month) {
		this(year);
		this.month = month;
	}
	public Day(int year, int month, int date) {
		this(year,month);
		this.date = date;
	}
	public Day(Day d) {
		this(d.year, d.month, d.date);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	int dayOfWeek() {
		int y = year; // 0 일요일 ~ 6 토요일
		int m = month;
		if(m == 1 || m == 2) {
			y--;
			m +=12;
		}
		return (y+y / 4-y / 100+7 / 400+(13*m+8) / 5+date) % 7;
	}
	//--- 날짜 d와 같은가? ---//
	public boolean eaqulto(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}
	//--- 문자열 표현을 반환 ---//

	@Override
	public String toString() {
		String[] wd = {"일","월","화","수","목","금","토"};
		return String.format("%04d년 %02d월 %02d일(%s)", year, month, date, wd[dayOfWeek()]);
		}
	}
}
