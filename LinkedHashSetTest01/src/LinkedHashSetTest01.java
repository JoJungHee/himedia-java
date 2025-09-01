import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest01 {
	public static void main(String[] args) {
		// 1. 셋을 생성
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		
		// 2. 데이터 추가
		set.add(78);
		set.add(86);
		set.add(57);
		set.add(92);
		set.add(65);
		
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 3. 중복 데이터 추가
		set.add(92);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 4. 데이터 삭제
		set.remove(57);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		System.out.println("-------");
		
		// 5-1. for-in문
		for (Integer i : set) {
			System.out.println(i);
		}
		System.out.println("-------");
		System.out.println("-------");
		// 5-2. forEach() + 람다식
		set.forEach(i -> System.out.println(i));
		System.out.println("-------");
		
		// 5-3. forEach() + 메서드 참조 연산자
		set.forEach(System.out::println);
		System.out.println("-------");
		
		// 5-4. Iterator
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
