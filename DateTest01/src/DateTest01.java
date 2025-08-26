import java.util.Date;

public class DateTest01 {
	public static void main(String[] args) {
		// 1. 현재 날짜와 시간을 구하는 방법 1
		Date d1 = new Date();
		String[] weekDay = {"일", "월", "화", "수", "목", "금", "토"};
		// 년, 월, 일
		int year = d1.getYear() + 1900;	 // 시작을 1900년부터 시작, 사용할 때는 1900을 더해서 사용
		int month = d1.getMonth() + 1;	 // 월은 0 ~ 11 사이의 값을 가짐, 사용할 때는 1을 더해서 사용
		int date = d1.getDate();
		int week = d1.getDay();	    	 // 요일, 0 ~ 6 사이의 값, 0: 일, 1: 월, 2: 화, 3: 수
		System.out.printf("%4d년 %2d월 %2d일 (%s요일) \n", year, month, date, weekDay[week]);
		
		// 시, 분, 초
		int hour = d1.getHours();
		int minute = d1.getMinutes();
		int second = d1.getSeconds();
		System.out.printf("%02d시 %02d분 %02d초\n", hour, minute, second);
		System.out.println("------");
		
		
		// 2. 직접 날짜를 생성하는 방법 1번
		// 2026 밀라노 동계 올림픽: 2026년 2월 6일
		// 2028 로스엔젤레스 하계 올림픽: 2028년 7월 14일
		// 2026 아이치현 아시아 게임: 2026년 9월 19일
		
		// 주의: 생성할 때 년은 1900을 빼고, 월은 1을 빼서 생성
		Date d2 = new Date(126, 1, 6);
		
		year = d2.getYear() + 1900;
		month = d2.getMonth() + 1;
		date = d2.getDate();
		System.out.printf("%4d년 %2d월 %2d일\n", year, month, date);
		System.out.println("------");
		
		
		// 3. 직접 날짜를 생성하는 방법 2번
		Date d3 = new Date();
		
		// 주의: 생성할 때 년은 1900을 빼고, 월은 1을 빼서 생성
		d3.setYear(128);  // 년은 1900을 뺌
		d3.setMonth(6);	  // 월은 1을 뺌
		d3.setDate(14);
		
		year = d3.getYear() + 1900;
		month = d3.getMonth() + 1;
		date = d3.getDate();
		System.out.printf("%4d년 %2d월 %2d일\n", year, month, date);
		System.out.println("------");
		
		System.out.println(d1);
		System.out.println(d1.toString());		  // Tue Aug 26 13:05:16 KST 2025 - 대한민국 날짜와 시간 -> 외국 스타일로 출력
		System.out.println(d1.toGMTString());	  // 26 Aug 2025 04:05:16 GMT - 영국 그리니치 천문대의 날짜와 시간
		System.out.println(d1.toLocaleString());  // 2025. 8. 26. 오후 1:05:16 - 대한민국 날짜와 시간 -> 현지 스타일로 출력 
		
		
	}
}
