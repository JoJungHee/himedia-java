import java.util.Calendar;

public class CalendarTest05 {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();  // 현재 날짜로 설정 - 2025년 8월 26일
		Calendar c2 = Calendar.getInstance();
		
		c2.set(2026, 8, 19);				   // 2026년 아시안 게임 개최일 설정 - 2026년 9월 19일
		
		// 문제) 현재일로부터 2026년 아시안 게임까지 남은 시간은? (밀리초, 초, 분, 시, 일)
		long difference = c2.getTimeInMillis() - c1.getTimeInMillis();  // 밀리초
		System.out.println(difference);
		
		System.out.println("두 날짜의 차이: " + difference + " 밀리초");
		System.out.println("두 날짜의 차이: " + difference/1000 + " 초");
		System.out.println("두 날짜의 차이: " + difference/1000/60 + " 분");
		System.out.println("두 날짜의 차이: " + difference/1000/60/60 + " 시");
		System.out.println("두 날짜의 차이: " + difference/1000/60/60/24 + " 일");
		
	}
}
