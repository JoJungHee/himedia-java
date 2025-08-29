import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest02 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
		// 1. 데이터 추가 - 오름차순 정렬
		set.add("이익준");
		set.add("김준완");
		set.add("채송화");
		set.add("장겨울");
		set.add("안정원");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 2. 중복 데이터 추가 - 허용하지 않음
		set.add("장겨울");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 3. 중복되지 않는 데이터 추가 - 허용함
		set.add("도재학");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 4. 데이터 삭제
		set.remove("채송화");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 5. 존재하지 않는 데이터
		set.remove("추민하");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 6-1. for-in문
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println();
		
		// 6-2. forEach() + 람다식
		set.forEach(i -> System.out.println(i));
		System.out.println();
		
		// 6-3. forEach() + 메서드 참조 연산자
		set.forEach(System.out::println);
		System.out.println();
		
		// 6-4. Iterator
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
