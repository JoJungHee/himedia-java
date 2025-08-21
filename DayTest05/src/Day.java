
// DayTest05
// - DayTest04번의 Day 클래스의 생성자에서 개선할 점
// - 다양한 생성자를 사용함으로써 멤버변수의 초기화에 대한 일관성이 떨어지는 점을 해결하고자 함
// - 멤버변수의 값을 설정하는 것을 한 곳으로 집약함
public class Day {
	// 멤버 변수
	private int year = 1900; // 초기값
	private int month = 1;
	private int date = 1;
	
	
	// 생성자 오버로딩
	
	// 기본 생성자
	// - 클래스를 생성하면 자동으로 생성되지만, 다른 생성자를 만들면 사라짐
	public Day() {
		
	}
	
	// 년을 설정하는 생성자
	public Day(int year) {
		this.year = year;
	}
	
	// 년, 월을 설정하는 생성자
	// this   : 자신의 클래스 내에서 자신의 멤버변수 또는 멤버메서드를 참조할 때 사용함(참조변수)
	// this() : 생성자 안에서 다른 생성자를 호출할 때 사용함
	public Day(int year, int month) {
		this(year);
		this.month = month;
	}
	
	
	// 년, 월, 일 모든 멤버변수에 대한 매개변수를 갖는 생성자
	public Day(int year, int month, int date) {
		this(year, month);
		this.date = date;
	}
	
	// ★★★★★
	// 복사생성자 - 인스턴스를 생성하여 값을 그대로 복사한 역할을 하는 생성자
	public Day(Day d) {
		this(d.year, d.month, d.date);
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
	
	// 두 개의 날짜를 비교하는 메서드
	public boolean equalDay(Day d) {
		return year == d.getYear() && month == d.getMonth() && date == d.getDate();
	}
	
	// 날짜를 출력하는 메서드
	// toString(): 특별한 출력 메서드
	// String.format(): 서식에 맞춘 문자열을 리턴하도록 할 때 사용하는 문자열 메서드
	public String toString() {
		String[] weekDay = {"일", "월", "화", "수", "목", "금", "토"};
		
		return String.format("%4d년 %02d월 %02d일 (%s)", year, month, date, weekDay[dayOfWeek()]);
	}
	
	
}
