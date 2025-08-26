import java.util.Calendar;

/*
Calendar 클래스
- Date 클래스의 문제점을 보완하여 생성한 클래스
- 추상 클래스: 몇 개의 추상 메서드를 가지고 있음
- Calendar 클래스는 기본 방법인 new로는 인스턴스를 생성할 수 없음
- getInstance() 클래스 메서드를 사용하여 인스턴스를 생성함


*/
public class CalendarTest01 {
	public static void main(String[] args) {
//		Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;  // 월은 0 ~ 11까지의 값을 가짐, 사용할 때는 1을 더하여 보정해서 사용
		int date = c.get(Calendar.DATE);
		
		System.out.printf("%4d년 %2d월 %2d일\n", year, month, date);
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int millisecond = c.get(Calendar.MILLISECOND);
		System.out.printf("%02d:%02d:%02d:%3d\n", hour, minute, second, millisecond);
		
		// 요일: 1 ~ 7 사이의 상수
		// 1: 일, 2: 월, 3: 화, 4: 수, 5: 목, 6: 금, 7: 토
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		// [ 요일을 출력하는 방법 ]
		// 1번
		String[] weekDay = {"", "일", "월", "화", "수", "목", "금", "토"};
		System.out.println("오늘 요일: " + weekDay[week]);
		
		// 2번
		switch (week) {
		case Calendar.SUNDAY:
			System.out.println("일요일");
			break;
		case Calendar.MONDAY:
			System.out.println("월요일");
			break;
		case Calendar.TUESDAY:
			System.out.println("화요일");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("수요일");
			break;
		case Calendar.THURSDAY:
			System.out.println("목요일");
			break;
		case Calendar.FRIDAY:
			System.out.println("금요일");
			break;
		case Calendar.SATURDAY:
			System.out.println("토요일");
			break;

		default:
			break;
		}
		
		// [ 시간을 표현하는 방법 ]
		int hour1 = c.get(Calendar.HOUR);
		int hour2 = c.get(Calendar.HOUR_OF_DAY);
		minute = c.get(Calendar.MINUTE);
		second = c.get(Calendar.SECOND);
		
		System.out.printf("12시간제: %02d시 %02d분 %02d초\n", hour1, minute, second);
		System.out.printf("24시간제: %02d시 %02d분 %02d초\n", hour2, minute, second);
		
		// [ 12시간제일 때 오전, 오후를 붙히는 방법 ]
		// Calendar.AM: 0, Calendar.PM: 1
		// Calendar.AM_PM: 9 -> 오전인지 오후인지를 구할 때 사용
		int ampm = c.get(Calendar.AM_PM);
		System.out.println(ampm);
		
		// 1번
		String[] ap = {"오전", "오후"};
		System.out.printf("12시간제: %s %02d시 %02d분 %02d초\n", ap[ampm], hour1, minute, second);
		
		// 2번
		String ampm2 = "";
		switch (ampm) {
		case Calendar.AM:
			ampm2 = "오전";
			break;
		case Calendar.PM:
			ampm2 = "오후";
			break;
		}
		System.out.printf("12시간제: %s %02d시 %02d분 %02d초\n", ampm2, hour1, minute, second);
		System.out.println("------");
		
		
	}
}
