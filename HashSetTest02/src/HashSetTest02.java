import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest02 {
	public static void main(String[] args) {
		// 1. 해시셋 생성
		HashSet<String> set = new HashSet<String>();
		
		// 2. 데이터 추가 - 순서가 없음(인덱스가 없음)
		String[] names = {"이익준", "김준완", "채송화", "안정원", "양석형"};
		for (String s : names) {
			set.add(s);
		}
		
		System.out.println(set);
		System.out.println("크기: " + set.size());
		System.out.println("------");
		
		// 3. 중복 데이터 추가 -> 중복을 허용하지 않음
		set.add("채송화");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		System.out.println("------");
		
		// 4. 중복되지 않은 데이터 추가
		set.add("장겨울");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		System.out.println("------");
		
		// 5. 데이터 삭제 - 값을 통한 삭제
		set.remove("김준완");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		System.out.println("------");
		
		// 6-1. 출력 for-in문
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("------");
		
		// 6-2. 출력 forEach(), 람다식
		set.forEach(i -> System.out.println(i));
		System.out.println("------");
		
		// 6-3. 출력 forEach(), ::
		set.forEach(System.out::println);
		System.out.println("------");
		
		// 6-4. Iterator 출력
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("------");
		
		System.out.println("★ HashSet의 메서드 ★");
		HashSet<String> set2 = new HashSet<String>();
		set2.add("안정원");
		set2.add("장겨울");
		set2.add("이익준");
		System.out.println(set2);
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("추민하");
		set3.add("도재학");
		set3.add("장겨울");
		System.out.println(set3);
		
		// 1. contains(데이터): 셋에서 특정 데이터가 존재하는지의 여부
		System.out.println(set.contains("채송화"));
		System.out.println(set.contains("추민하"));
		System.out.println("------");
		
		// 2. containsAll(셋명): 셋에 다른 셋의 모든 데이터가 존재하는지의 여부 
		System.out.println(set.containsAll(set2));
		System.out.println(set.containsAll(set3));
		
		// 3. addAll(셋명): 셋에 다른 셋의 모든 데이터를 추가, 중복 데이터는 허용하지 않음 
		set.addAll(set3);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		System.out.println("------");
		
		// 4. clear(): 셋의 모든 내용을 삭제하고, 크기를 0으로 만듦
		set.clear();
		System.out.println(set);
		System.out.println("크기: " + set.size());
		System.out.println("------");
		
		
		
		
	}
}
