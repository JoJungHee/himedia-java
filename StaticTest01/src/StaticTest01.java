
class Static {
	private static int s;	// 클래스 변수
	private int i;			// 인스턴스 변수
	
	public static void sm1() { }	// 클래스 메서드
	public void im1() { }  			// 인스턴스 메서드	
	
	// 클래스 메서드
	public static void sm2(int x) {
		s = x;
//		i = x;	// 에러
		sm1();
//		im1();	// 에러
	}
	
	// 인스턴스 메서드
	public void im2(int x) {
		s = x;
		i = x;
		sm1();
		im1();
	}
	
	// 클래스 메서드
	public static int getS() {
		return s;
	}
	
	// 인스턴스 메서드
	public int getI() {
		return i;
	}
}
public class StaticTest01 {
	public static void main(String[] args) {
		Static s1 = new Static();
		Static s2 = new Static();
		Static s3 = new Static();
		
		
		s1.im2(10);
		Static.sm2(20);
		
		System.out.println("s1 i: " + s1.getI());
		System.out.println("s2 i: " + s2.getI());
		System.out.println("s3 i: " + s3.getI());
		
		System.out.println("static s: " + Static.getS());
	}
}
