package point;

// 부모 클래스
public class Point2D {
	// 인스턴스 변수
	// 접근 권한을 완화하는 것은 캡슐화 원칙을 깨는 것이므로 권장하지 않음
//	protected int x;
//	protected int y;
	
	private int x;
	private int y;
	
	
	// 기본 생성자
	public Point2D() {
		
	}
	
	// 매개변수를 갖는 생성자
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// setter
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	// getter
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	

	// 출력 메서드
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
	
}
