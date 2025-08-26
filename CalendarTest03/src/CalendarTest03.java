import java.util.Calendar;

// Calendar 클래스 다양한 활용 방법
public class CalendarTest03 {
	
	public static void printDate(Calendar c) {
		String[] dayWeek = {"", "일", "월", "화", "수", "목", "금", "토"};
		String[] ampm = {"오전", "오후"};
		System.out.printf(
				"%04d-%02d-%02d (%s) %s %02d:%02d:%02d:%04d\n",
				c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1,
				c.get(Calendar.DATE), 
				dayWeek[c.get(Calendar.DAY_OF_WEEK)],
				ampm[c.get(Calendar.AM_PM)],
				c.get(Calendar.HOUR),
				c.get(Calendar.MINUTE), 
				c.get(Calendar.SECOND), 
				c.get(Calendar.MILLISECOND));
	}
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		
		// 날짜 설정
		c.set(2025, 7, 31);  // 2025년 8월 31일
		
		// 날짜의 모든 정보 확인
		System.out.println(c.toString());
		
		// 날짜와 간랸학 정보 확인
		System.out.println(c.getTime());
		
		// [ 다양한 날짜의 보정 방법 ]
		// - add() 메서드를 사용
		// - 년, 월, 일, 시, 분, 초에 대한 모든 값이 자동으로 보정되는 방법
		// - 일에 대한 값을 변경하면, 월과 년도까지 모두 보정이 됨
		// 1. 1일후
		c.add(Calendar.DATE, 1);
		printDate(c);
		
		// 2. 6개월 후
		c.add(Calendar.MONTH, 6);
		printDate(c);
		
		// 3. 3개월 전
		c.add(Calendar.MONTH, -3);
		printDate(c);
		
		// 4. 7일 전
		c.add(Calendar.DATE, -7);
		printDate(c);
		System.out.println("------");
		
		
		// (2) roll() 메서드를 사용하는 방법
		// - add() 메서드와는 달리 지정한 값만 변경하고, 다른 값에는 영향을 주지 않는 방법
		// - 일에 대한 값을 변경하며느 일과 년도에는 영향을 주지 않고, 일만 변경됨
		// 1. 40일 후
		c.roll(Calendar.DATE, 40);
		printDate(c);
		
	}
}
