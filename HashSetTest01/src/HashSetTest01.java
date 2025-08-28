import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest01 {
	public static void main(String[] args) {
		// 1. 해시셋 생성
		HashSet<Integer> set = new HashSet<Integer>();
		
		// 2. 데이터 추가 -> 순서가 없음
		set.add(66);
		set.add(75);
		set.add(57);
		set.add(96);
		set.add(45);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 3. 중복 데이터 추가 -> 중복 데이터를 허용하지 않음
		set.add(57);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		
		// 4. 중복되지 않은 데이터 추가
		set.add(83);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 5. 존재하는 데이터 삭제 -> 인덱스가 없으므로 값을 통해서 삭제
		// 리스트 계열은 인덱스를 통해서 삭제하고, set 계열은 값을 통해서 삭제
		set.remove(96);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 6. 존재하지 않는 데이터 삭제 -> 에러가 나지 않고, 정상적인 처리가 됨 (예외처리가 되어있음)
		set.remove(30);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		System.out.println("------");
		
		
		// 출력 방법 1
		for (Integer i : set) {
			System.out.println(i);
		}
		System.out.println("------");
		
		
		// 출력 방법 2-1 - forEach(), 람다식
		set.forEach(i -> System.out.println(i));
		System.out.println("------");
		
		// 출력 방법 2-2 - forEach(), ::
		// ::(더블 콜론) -> 메서드 참조 연산자 (method reference operator)
		// 클래스에 있는 메서드를 참조하는 연산자 
		set.forEach(System.out::println);
		System.out.println("------");
		
		
		// 출력 방법 3 - Integer
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
