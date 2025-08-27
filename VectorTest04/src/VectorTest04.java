import java.util.Vector;

public class VectorTest04 {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		Vector<Integer> v3 = new Vector<Integer>();
		Vector<Integer> v4 = new Vector<Integer>();

		v1.add(10); v1.add(20); v1.add(30);
		v2.add(40); v2.add(50); v2.add(60);
		v3.add(30); v3.add(40); v3.add(50);
		v4.add(10); v4.add(20); v4.add(30);
		
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("v3: " + v3);
		System.out.println("v4: " + v4);
		System.out.println("------");
		
		
		// 15. addAll(벡터명): 벡터에 다른 벡터의 모든 내용을 처음부터 추가
		//     addAll(인덱스, 벡터명): 벡터에 다른 벡터의 모든 내용을 해당 인덱스부터 추가
		// 순차적인 추가
		v1.addAll(v2);
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		
		// 비순차적인(중간에서) 추가
		// 10 다음에 추가 -> v4의 1번 인덱스부터 v2의 모든 내용을 추가
		v4.addAll(1, v2);
		System.out.println("v4: " + v4);
		System.out.println("v2: " + v2);
		System.out.println("------");
		
		// 16. contains(값): 벡터에 특정 값이 존재하는지의 여부
		// v1에 50 값이 존재하는지의 여부
		System.out.println(v1.contains(50));  // true
		// v1에 80 값이 존재하는지의 여부
		System.out.println(v1.contains(80));  // false
		System.out.println("------");
		
		// 17. containsAll(벡터명): 벡터에 다른 벡터의 모든 값이 존재하는지의 여부
		// v1에 v2의 모든 값이 존재하는지의 여부
		System.out.println(v1.containsAll(v2));  // true
		
		// v2에 v1의 모든 값이 존재하는지의 여부
		System.out.println(v2.containsAll(v1));  // false
		
		
		// 18. clone(): 벡터를 복제
		
		// 많이 사용하지는 앟음
		@SuppressWarnings("unchecked")
		Vector<Integer> v5 = (Vector<Integer>) v1.clone();
		System.out.println("v5: " + v5);
		System.out.println("v1: " + v1);
		
	}

}
