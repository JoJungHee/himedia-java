import java.util.Random;

class RandomId {
	private static int count = 0;
	private int id;
	
	
	// 클래스 초기화 블럭, 정적 초기화 블럭
	// - 클래스를 사용하는 최초의 시점에 딱 1번만 사용
	// r.nextInt(10): 0 ~ 9 사이의 정수 난수
	static {
		Random r = new Random();
		count = r.nextInt(10) * 100;
	}
	
	public RandomId() {
		this.id = ++count;
	}
	
	public static int getCount() {
		return count;
	}
	
	public int getId() {
		return id;
	}
}
public class RandomIdTest01 {
	public static void main(String[] args) {
		// 문제) 처음 생성하는 인스턴스의 id에 0부터 100단위의 난수를 생성하여 초기화하고,
		// 모든 인스턴스의 id는 1씩 증가하는 값을 가지도록 설정하시오.
		// count: 0, 100, 200, 300, 400, 500, 600, 700, 800, 900 중에 1개가 랜덤으로 생성
		// id: 만약 count가 300이 생성되었다면 301, 302, 303, 304 ...의 값을 가지도록 설정
		RandomId a = new RandomId();
		RandomId b = new RandomId();
		RandomId c = new RandomId();
		
		System.out.println("a id: " + a.getId());
		System.out.println("b id: " + b.getId());
		System.out.println("c id: " + c.getId());
	}
}
