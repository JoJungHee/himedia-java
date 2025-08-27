import java.util.List;
import java.util.Vector;

public class VectorTest05 {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		Vector<Integer> v3 = new Vector<Integer>();
		
		v1.add(10); v1.add(20); v1.add(30); v1.add(40);
		v2.add(30); v2.add(40); v2.add(50); v2.add(60);
		
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		
		// 19. retainAll(벡터명): 벡터에서 다른 벡터에 있는 같만 남기고, 나머지 값은 삭제
		v1.retainAll(v2);
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		
		// v3에 값을 추가
		for (int i = 10; i <= 100; i+=10) {
			v3.add(i);
		}
		System.out.println("v3: " + v3);
		
		// 20. subList(시작인덱스, 끝인덱스): 벡터에서 시작 인덱스부터 끝 인덱스 전까지를 새로운 리스트로 생성
		// ★ 주의: 리턴하는 것은 벡터가 아니라 리스트가 됨
		// Vector<Integer> v4 = (Vector<Integer>) v3.subList(3,  9);  // 에러: java.lang.ClassCastException
		List<Integer> v4 = v3.subList(3,  9);  // 3번에서 9번 전까지
		System.out.println("v4: " + v4);
		
		
		
		
	}
}
