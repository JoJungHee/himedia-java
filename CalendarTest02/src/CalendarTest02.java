import java.util.Calendar;
import java.util.Date;

public class CalendarTest02 {
	public static void main(String[] args) {
		// 1. 날짜를 생성하는 방법 1
		Calendar c1 = Calendar.getInstance();
		String[] dayWeek = {"", "일", "월", "화", "수", "목", "금", "토"};
		String[] ampm = {"오전", "오후"};
		
		
		// 월은 1을 더해서 보정
		c1.set(2026, 1, 26, 17, 30, 30);
		int year = c1.get(Calendar.YEAR);
		int month = c1.get(Calendar.MONTH) + 1;
		int date = c1.get(Calendar.DATE);
		int week = c1.get(Calendar.DAY_OF_WEEK);
		
		int ap = c1.get(Calendar.AM_PM);
		int hour1 = c1.get(Calendar.HOUR);
		int hour2 = c1.get(Calendar.HOUR_OF_DAY);
		int minute = c1.get(Calendar.MINUTE);
		int second = c1.get(Calendar.SECOND);
		int millisecond = c1.get(Calendar.MILLISECOND);
		
		System.out.printf("12시간제: %04d-%02d-%02d (%s) %s %02d:%02d:%02d:%04d\n", year, month, date, dayWeek[week], ampm[ap], hour1, minute, second, millisecond);
		System.out.printf("24시간제: %04d-%02d-%02d (%s) %02d:%02d:%02d:%04d\n", year, month, date, dayWeek[week], hour2, minute, second, millisecond);
		System.out.println("-------");
		
		// 2. 날짜를 생성하는 방법 2 -> Date 클래스를 사용하는 방법
		Calendar c2 = Calendar.getInstance();
		
		// 년은 1900을 빼서 보정, 월은 1을 빼서 보정
		// - Date 클래스를 사용하는 방법
		// - setTime() 메서드 사용
		Date d1 = new Date(128, 6, 14, 17, 50, 30);
		c2.setTime(d1);

		year = c2.get(Calendar.YEAR);
		month = c2.get(Calendar.MONTH) + 1;  // 사용할 때 월은 1을 더해서 보정
		date = c2.get(Calendar.DATE);
		week = c2.get(Calendar.DAY_OF_WEEK);
		
		ap = c2.get(Calendar.AM_PM);
		hour1 = c2.get(Calendar.HOUR);
		hour2 = c2.get(Calendar.HOUR_OF_DAY);
		minute = c2.get(Calendar.MINUTE);
		second = c2.get(Calendar.SECOND);
		millisecond = c2.get(Calendar.MILLISECOND);
		
		System.out.printf("12시간제: %04d-%02d-%02d (%s) %s %02d:%02d:%02d:%04d\n", year, month, date, dayWeek[week], ampm[ap], hour1, minute, second, millisecond);
		System.out.printf("24시간제: %04d-%02d-%02d (%s) %02d:%02d:%02d:%04d\n", year, month, date, dayWeek[week], hour2, minute, second, millisecond);
		
	}
}
