class XY {
	// 클래스 변수
	private static int count = 0;
	
	// 인스턴스 변수
	private int x = 0;
	private int y = 0;
	private int id;
	
	// 개선할 점: 모든 생성자에 id값을 대입하는 코드가 중복해서 들어가 있음.
	// 디폴트 생성자
	public XY() {
		this.id = ++count;
	}
	
	public XY(int x) {
		this.x = x;
		this.id = ++count;
	}
	
	public XY(int x, int y) {
		this.x = x;
		this.y = y;
		this.id = ++count;
	}
	
	// 복사 생성자
	public XY(XY a) {
		this.x = a.x;
		this.y = a.y;
		this.id = ++count;
	}
	
	// 출력 메서드
	public String toString() {
		return String.format("NO: %d (%d, %d)", id, x, y);
	}
}
public class XYTest01 {
	public static void main(String[] args) {
		// 문제) id에는 1부터 1씩 자동으로 증가하는 일련번호를 추가하시오.
		XY p1 = new XY();
		XY p2 = new XY(10);
		XY p3 = new XY(30, 40);
		XY p4 = new XY(p3);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		
	}
}
