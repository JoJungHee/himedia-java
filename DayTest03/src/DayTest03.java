import java.util.Scanner;

public class DayTest03 {
	
	// 두 개의 날짜를 비교하는 메서드
	static boolean compareDay(Day d1, Day d2) {
		return d1.getYear() == d2.getYear() && d1.getMonth() == d2.getMonth() && d1.getDate() == d2.getDate();
		
	}
	
	
	public static void main(String[] args) {
		// 두 개의 날짜를 비교해서 같은지 다른지의 여부를 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.println("날짜1을 입력하시오.");
		System.out.print("년 입력: ");
		int y = sc.nextInt();
		System.out.print("월 입력: ");
		int m = sc.nextInt(); 
		System.out.print("일 입력: ");
		int d = sc.nextInt();
		
		Day day1 = new Day(y, m, d);
		System.out.println();
		
		System.out.println("날짜2를 입력하시오.");
		System.out.print("년 입력: ");
		y = sc.nextInt();
		System.out.print("월 입력: ");
		m = sc.nextInt(); 
		System.out.print("일 입력: ");
		d = sc.nextInt();
		
		Day day2 = new Day(y, m, d);
		
		
		// 1번 방법 -> 틀린 방법
		// - 결과는 항상 다르다고 나옴
		// - 날짜의 값이 아닌 참조를 비교하고 있기 때문 
		/*
		if (day1 == day2) {
			System.out.println("두 날짜는 같습니다.");
		} else {
			System.out.println("두 날짜는 다릅니다.");
		}
		*/
		
		
		// 2번 방법 -> 올바른 방법
		// - 해결책) 각각의 날짜를 비교함
		// - 올바른 방법이긴 하지만, 효율적 방법은 아님
		/*
		if (day1.getYear() == day2.getYear() && day1.getMonth() == day2.getMonth() && day1.getDate() == day2.getDate()) {
			System.out.println("두 날짜는 같습니다.");
		} else {
			System.out.println("두 날짜는 다릅니다.");
		}
		*/
		
		// 3번 방법 -> 올바른 방법
		// - 2번의 문제를 메서드를 사용하여 효율적으로 해결
		// - 개선책: 날짜를 비교하는 메서드도 날짜 클래스와 깊은 관련을 가지므로, 날짜 클래스 안에 있어야함
		/*
		if (compareDay(day1, day2)) {
			System.out.println("두 날짜는 같습니다.");
		} else {
			System.out.println("두 날짜는 다릅니다.");
		}
		*/
		
		// 4번 방법 -> 올바른 방법 -> 3개의 방법 중에서 제일 좋은 방법
		// - 3번에 대한 개선책: 날짜 비교 메서드를 날짜 클래스 안에 생성함
		// - 날짜 비교 메서드를 생성하고 활용 하는 최종적인 방법
		if (day1.equalDay(day2) && day2.equalDay(day1)) {
			System.out.println("두 날짜는 같습니다.");
		} else {
			System.out.println("두 날짜는 다릅니다.");
		}
		sc.close();
	}
}
