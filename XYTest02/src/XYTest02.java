class XY {
	// 클래스 변수
	private static int count = 0;
	
	// 인스턴스 변수
	private int x = 0;
	private int y = 0;
	private int id;
	
	// 인스턴스 초기화 블럭, 비정적 초기화 블럭
	// - 모든 생성자를 사용하기 바로 직전에 사용하는 블럭
	{
		this.id = ++count;
	}

	// 디폴트 생성자
	public XY() {
		
	}
	
	public XY(int x) {
		this.x = x;
	}
	
	public XY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 복사 생성자
	public XY(XY a) {
		this.x = a.x;
		this.y = a.y;
	}
	
	// 출력 메서드
	public String toString() {
		return String.format("NO: %d (%d, %d)", id, x, y);
	}
}
public class XYTest02 {
	public static void main(String[] args) {
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
