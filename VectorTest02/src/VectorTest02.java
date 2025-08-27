import java.util.Vector;

public class VectorTest02 {
	public static void main(String[] args) {
		// 2. generic type
		// - 구체화된 타입, 일반회된 타입
		// - 단점: 여러가지 데이터타입을 저장할 수 없음, 한 가지 데이터타입만 저장할 수 있음.
		// - 장점: 반복문을 통해 처리할 때 에러가 발생하지 않음
		Vector<Integer> v = new Vector<Integer>();
		
		// 오토박싱
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		// 박싱
		Integer ii = new Integer(50);
		v.add(ii);
		
		// 에러: The method add(Integer) in the type Vector<Integer> is not applicable for the arguments (double)
		// v.add(3.14);
		
		
		int tot = 0;
		// 출력 1 - 기본 for문
		for (int i = 0; i < v.size(); i++) {
			tot += v.get(i);
			System.out.printf("%d : %d\n", i, v.get(i));
		}
		System.out.println("총계 : " + tot);
		System.out.println("-------");
		
		tot = 0;
		for (Integer i : v) {
			tot += i;
			System.out.printf("%d\n", i);
		}
		System.out.println("총계 : " + tot);
		
		
		
	}
}
