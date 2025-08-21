package point;

// 자식 클래스
public class Point3D extends Point2D {
	private int z;
	
	// 매개변수를 갖는 생성자
	public Point3D(int x, int y, int z) {
		// 생성자 안에서 부모의 생성자를 호출하는 방법
		super(x, y);
//		this.x = x;  // private으로 선언된 멤버변수는 자식이라도 접근할 수 없음.
//		this.y = y;
		this.z = z;
	}

	
	// setter
	public void setZ(int z) {
		this.z = z;
	}
	
	// getter
	public int getZ() {
		return z;
	}
	
	
	// ★★★★★
	// 오버라이딩
	// 출력 메서드
	@Override
	public String toString() {
//		return "x = " + getX() + ", y = " + getY() + ", z = " + z;
		return super.toString() + ", z = " + z;
	}
}
