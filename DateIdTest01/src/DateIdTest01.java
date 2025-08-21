import java.util.Calendar;

class DateId {
	private static long count = 0;
	private long id;
	
	// 클래스 초기화 블럭
	static {
		Calendar c = Calendar.getInstance();
		long year = c.get(Calendar.YEAR);
		long month = c.get(Calendar.MONTH) + 1;
		long date = c.get(Calendar.DATE);
		
		count = year*100000000 + month*1000000 + date*10000;
	}
	
	
	public DateId() {
		this.id = ++count;
	}
	
	public static long getCount() {
		return count;
	}
	
	public long getId() {
		return id;
	}
}
public class DateIdTest01 {
	public static void main(String[] args) {
		// 문제) id를 현재 날짜를 기반으로 1부터 1씩 증가하는 일련번호로 생성하시오
		DateId a = new DateId();
		DateId b = new DateId();
		DateId c = new DateId();
		
		System.out.println("a: " + a.getId());
		System.out.println("b: " + b.getId());
		System.out.println("c: " + c.getId());
	}
}
