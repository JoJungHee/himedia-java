import java.util.Calendar;
import java.util.Date;

public class CalendarTest04 {
	public static void main(String[] args) {
		// 1. Calendar 객체를 Date 객체로 변경하는 방법
		Calendar c1 = Calendar.getInstance();
		
		// - Calendar 객체의 밀리초를 Date 객체의 생성자에 넣어 줌
		Date d1 = new Date(c1.getTimeInMillis());
		int year = d1.getYear() + 1900;
		int month = d1.getMonth() + 1;
		int date = d1.getDate();
		
		int hour = d1.getHours();
		int minute = d1.getMinutes();
		int second = d1.getSeconds();
		
		System.out.printf("%04d년 %02d월 %02d일 %02d시 %02d분 %02d초\n", year, month, date, hour, minute, second);
		System.out.println("-----");
		
		// 2. Date 객체를 Calendar 객체로 변경하는 방법
		// 2026 밀라노 동계 올림픽: 2026년 2월 6일
		
		// 년은 1900을 빼고, 월은 1을 빼서 생성
		Date d2 = new Date(126, 1, 6, 18, 40, 50);
		
		Calendar c2 = Calendar.getInstance();
		// - Date 객체를 Calendar의 setTime() 메서드에 넣어줌
		c2.setTime(d2);
		year = c2.get(Calendar.YEAR);
		month = c2.get(Calendar.MONTH) + 1;
		date = c2.get(Calendar.DATE);
		
		hour = c2.get(Calendar.HOUR);
		minute = c2.get(Calendar.MINUTE);
		second = c2.get(Calendar.SECOND);
		System.out.printf("%04d년 %02d월 %02d일 %02d시 %02d분 %02d초\n", year, month, date, hour, minute, second);

		
	}
}
