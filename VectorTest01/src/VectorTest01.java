import java.util.Vector;

/* 
< List 계열 > 
1. 가변적인 배열 구조 
2. 순서가 있고, 중복 데이터를 허용
3. Vector, ArrayList, LinkedList, Stack, Queue ...


*/
public class VectorTest01 {
	public static void main(String[] args) {
		// 1. raw type
		// - 타입을 정하지 않은 상태, 원시 타입, 추상적인 타입
		// - 장점: 여러 가지의 데이터 타입을 함께 저장할 수 있음
		// - 단점: 하나의 방법과 목적으로 데이터를 처리할 수 없음
		// - 결론: 단점이 치명적이므로 raw type으로는 거의 사용하지 않음
		// - 해결책: generic type으로 만들어 사용함.
		
		Vector v = new Vector();
		
		
		// add(): 백터에 값을 추가
		v.add(10);
		v.add(3.14);
		v.add(true);
		v.add('A');
		v.add("Hello");
		
		// 확인
		System.out.println(v); // toString() 생략 가능
		
		// 출력
		// get(): 벡터의 인덱스를 사용하여 값을 출력
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		System.out.println(v.get(3));
		System.out.println(v.get(4));
//		System.out.println(v.get(5)); // 에러: java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 5
		
		// 벡터 크기 확인
		System.out.println("크기: " + v.size());
		
		// 출력 1번 - 기본 for문
		for (int i = 0; i < v.size(); i++) {
			// System.out.printf(""); // 사용 불가: 5가지 데이터 타입을 처리할 수 없음 -> raw 타입
			 System.out.println(i + " : " + v.get(i));
			
		}
		System.out.println("------");
		
		
		// 출력 2번 - for-in문
		// 5가지의 데이터 타입을 처리하기가 어려움 -> raw 타입
		// - 모든 데이터의 부모 타입을 사용
		for (Object i : v) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
	}
}
