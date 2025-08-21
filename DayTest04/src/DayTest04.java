
public class DayTest04 {
	public static void main(String[] args) {
		// 다양한 생성자를 활용하여 인스턴스 생성
		Day day1 = new Day(2000, 6, 13);  // 년, 월, 일의 매개변수 3개를 갖는 생성자
		Day day2 = new Day(day1);		  // 복사 생성자
		Day day3 = new Day();			  // 기본 생성자
		Day day4 = new Day(2000);		  // 년을 설정하는 생성자
		Day day5 = new Day(2000, 7);      // 년, 월을 설정하는 생성자
		
		
		// toString() 메서드: 클래스에 생성하면, 사용할 때 toString()을 생략할 수 있음
		System.out.println(day1.toString());
		System.out.println(day2.toString());
		System.out.println(day3.toString());
		System.out.println(day4.toString());
		System.out.println(day5);
	}
}
