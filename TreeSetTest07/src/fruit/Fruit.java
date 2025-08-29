package fruit;

public class Fruit implements Comparable<Fruit> {
	private String name; // 과일 이름
	private int price;  // 과일 가격
	private int volume; // 과일 수량
	
	
	// 생성자
	public Fruit(String name, int price, int volume) {
		this.name = name;
		this.price = price;
		this.volume = volume;
	}
	
	public String toString() {
		return String.format("%s(%5d, %3d)", name, price, volume);
	}
	
	public void print() {
		System.out.println("과일 이름: " + name);
		System.out.println("과일 가격: " + price);
		System.out.println("과일 수량: " + volume);
	}

	// ★★★★★
	// Comparable 인터페이스의 추상 메서드인 compareTo() 메서드를 오버라이딩함
	// - compareTo() 메서드는 this와 매개변수의 멤버변수의 값을 비교하여 오름차순 정렬과 내림차순 정렬을 결정함
	// - 오름차순 정렬: this의 값이 매개변수의 값보다 크다면 양수(1), 작다면 음수(-1), 같다면 0을 리턴하도록 함
	// - 내림차순 정렬: this의 값이 매개변수의 값보다 크다면 음수(-1), 작다면 양수(1), 같다면 0을 리턴하도록 함
	
	// 1. 과일 이름을 기준으로 오름차순 정렬
	@Override
	public int compareTo(Fruit f) {
		if (this.name.compareTo(f.name) > 0) return 1;
		else if (this.name.compareTo(f.name) < 0) return -1;
		else return 0;
	}
	
	
	// 2. 과일 가격을 기준으로 오름차순 정렬
	/*
	@Override
	public int compareTo(Fruit f) {
		if (this.price > f.price) return 1;
		else if (this.price < f.price) return -1;
		else return 0;
	}
	*/
	
	// 3. 과일 수량을 기준으로 오름차순 정렬
	/*
	@Override
	public int compareTo(Fruit f) {
		if (this.volume > f.volume) return 1;
		else if (this.volume < f.volume) return -1;
		else return 0;
	}
	*/
	
	// 4. 과일 이름을 기준으로 내림차순 정렬
	/*
	@Override
	public int compareTo(Fruit f) {
		if (this.name.compareTo(f.name) < 0) return 1;
		else if (this.name.compareTo(f.name) > 0) return -1;
		else return 0;
	}
	*/
	
	// 5. 과일 가격을 기준으로 내림차순 정렬
//	@Override
//	public int compareTo(Fruit f) {
//		if (this.price < f.price) return 1;
//		else if (this.price > f.price) return -1;
//		else return 0;
//	}
	
	// 6. 과일 수량을 기준으로 내림차순 정렬
//	@Override
//	public int compareTo(Fruit f) {
//		if (this.volume < f.volume) return 1;
//		else if (this.volume > f.volume) return -1;
//		else return 0;
//	}
	
	
}
