package point;

public class Point {
	private int x;
	private int y;
	
	// 생성자
	public Point(int x, int y) {
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
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public String toString() {
		return String.format("(%d, %d)", x, y);
	}
	
	// 두 개의 Point를 비교하는 메서드
	// Object equals() 메서드를 오버라이딩
	public boolean equals(Point p) {
		return this.x == p.x && this.y == p.y;
	}
}
