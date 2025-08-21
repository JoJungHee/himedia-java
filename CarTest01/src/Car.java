/*
< Car 클래스 >
- 멤버변수: name, width, length, height, x, y, fuel (이름, 너비, 길이, 높이, x좌표, y좌표, 연료)
- 매개변수를 갖는 생성자
- setter/getter
- 출력 메서드

*/


public class Car {
	// 멤버변수
	private String name;
	private int width;
	private int length;
	private int height;
	private double x;
	private double y;
	private double fuel;
	
	// 생성자
	public Car(String name, int width, int length, int height, double fuel) {
		this.name = name;
		this.width = width;
		this.length = length;
		this.height = height;
		this.fuel = fuel;
		x = y = 0.0;
	}
	
	// 멤버변수 중에서 x, y, fuel만 생성
	// setter
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	
	// getter
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getFuel() {
		return fuel;
	}
	
	// 기타 메서드
	// 제원 출력 메서드 - name, width, length, height
	public void putSpec() {
		System.out.println("차 이름: " + name);
		System.out.println("차 너비: " + width);
		System.out.println("차 길이: " + length);
		System.out.println("차 높이: " + height);
	}
}
