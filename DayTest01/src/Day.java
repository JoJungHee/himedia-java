/*
 < Day 클래스 >
 - 멤버 변수: year, month, date (년, 월, 일) - int
 - 매개변수를 갖는 생성자
 - setter/getter
 - 출력 메서드
 - 계산 메서드 
 
 */

// DayTest01
public class Day {
	// 멤버 변수
	private int year;
	private int month;
	private int date;
	
	// 생성자
	public Day(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	// setter
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDate(int date) {
		this.date = date;
	}
	
	// getter
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDate() {
		return date;
	}
	
	// year, month, date를 한꺼번에 초기화 하는 메서드
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	// 요일을 계산하는 메서드
	// 제라의 공식: 날짜를 계산하여 0~6 사이의 값을 요일로 리턴하는 공식
	// 0: 일, 1: 월, 2: 화, 3: 수, 4: 목, 5: 금, 6: 토
	public int dayOfWeek() {
		int y = year;
		int m = month;
		int d = date;
		
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		
		return (y + y/4 - y/100 + y/400 + (13 * m + 8)/5 + d) % 7;
	}
}
