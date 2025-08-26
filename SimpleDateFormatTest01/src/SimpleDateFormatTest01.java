import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


// SimpleDateFormat 클래스
// - 날짜의 형식을 간편하게 지정하는 클래스
// - Date 클래스에만 사용이 가능
public class SimpleDateFormatTest01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		// 간단한 날짜 확인
		System.out.println(c.getTime());
		
		
		// Date 객체로 변경
		Date d = new Date(c.getTimeInMillis());
		System.out.println(d);
		
		// Date: 간단한 날짜 확인
		System.out.println(d.toLocaleString());  // 2025. 8. 26. 오후 4:29:11
		System.out.println("------");
		
		/*
		< 날짜와 시간의 형식 >
		- yyyy: 년도 4자리, yy: 년도 2자리
		- MM: 월 2자리(모두), M: 월 1자리(두자리는 2자리, 한자리는 1자리)
		- dd: 일 2자리(모두), d: 일 1자리(두자리는 2자리, 한자리는 1자리)
		- E: 요일
		
		- hh: 시간 2자리(모두), 12시간제, h: 시간 1자리(두자리는 2자리, 한자리는 1자리)
		- HH: 시간 2자리(모두), 24시간, H: 시간 1자리(두자리는 2자리, 한자리는 1자리)
		- mm: 분 2자리(모두), m: 분 1자리(두자리는 2자리, 한자리는 1자리)
		- ss: 초 2자리(모두), s: 초 1자리(두자리는 2자리, 한자리는 1자리)
		- SSS: 밀리초(1000분의 1초)
		- a: 오전 또는 오후
		
		*/
		
		// 날짜 형식을 SimpleDateFormat 클래스의 생성자에 지정
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-M-d");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf4 = new SimpleDateFormat("hh시 mm분 ss초");
		SimpleDateFormat sdf5 = new SimpleDateFormat("h:m:s");
		SimpleDateFormat sdf6 = new SimpleDateFormat("a hh:mm:ss:SSS");
		SimpleDateFormat sdf7 = new SimpleDateFormat("HH:mm:ss:SSS");
		
		// 출력
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		System.out.println(sdf4.format(d));
		System.out.println(sdf5.format(d));
		System.out.println(sdf6.format(d));
		System.out.println(sdf7.format(d));
		
		
	}
}
