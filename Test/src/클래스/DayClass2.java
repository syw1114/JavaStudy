package 클래스;

import java.util.Scanner;

	class Day{
		private int year;
		private int month;
		private int date;
	
	Day(int year, int month, int date){
		this.year = year;
		this.month = month;
		this.date = date;
	}
	int getYear() {
		return year;
	}

	int getMonth() {
		return month;
	}

	int getDate() {
		return date;
	}
	void setYear(int year) {
		this.year = year;
	}
	
	void setMonth(int month) {
		this.month = month;
	}
	
	void setDate(int date) {
		this.date = date;
	}
}
public class DayClass2 {
	//--- d1과 d2의 날짜는 같은지? ---//
	static boolean compDay(Day d1, Day d2) {
		return d1.getYear() == d2.getYear() &&
				d1.getMonth() == d2.getMonth() &&
				d1.getDate() == d2.getDate();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int y, m, d;
		System.out.println("날짜 하나를 입력하십니오.");
		System.out.print("년: "); y = scanner.nextInt();
		System.out.print("월: "); m = scanner.nextInt();
		System.out.print("일: "); d = scanner.nextInt();
		
		Day day1 = new Day(y, m, d);
		
		System.out.println("날짜 두번째를 입력하십니오.");
		System.out.print("년: "); y = scanner.nextInt();
		System.out.print("월: "); m = scanner.nextInt();
		System.out.print("일: "); d = scanner.nextInt();
		
		Day day2 = new Day(y,m,d);
		
		if(compDay(day1, day2))
			System.out.println("같습니다.");
		else
			System.out.println("다릅니다.");
	}
}
