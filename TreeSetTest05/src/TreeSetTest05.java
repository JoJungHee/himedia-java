import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest05 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		// 1.데이터 추가 -> 오름차순으로 정렬
		set.add(82);
		set.add(63);
		set.add(58);
		set.add(97);
		set.add(76);
		System.out.println("오름차순 정렬: " + set);
		
		// 2. 내림차순 정렬
		// NavigableSet<Integer> set2 = set.descendingSet();
		TreeSet<Integer> set2 = (TreeSet<Integer>) set.descendingSet();
		System.out.println("내림차순 정렬: " + set2);
		
		TreeSet<Integer> set3 = (TreeSet<Integer>) set2.descendingSet();
		System.out.println("오름차순 정렬: " + set3);
		
		// 3. 부분셋 - 특정값을 기준으로 headSet과 tailSet으로 나누는 방법
		// 87점보다 작은 값을 가진 셋을 생성, 지정한 값은 포함하지 않음
//		SortedSet<Integer> set4 = set.headSet(82);
		TreeSet<Integer> set4 = (TreeSet<Integer>) set.headSet(82);
		System.out.println("82점(미포함)보다 작은 부분셋: " + set4);
		
		// 82점보다 큰 값을 가진 셋을 생성, 지정한 값은 포함함
//		SortedSet<Integer> set5 = set.tailSet(82);
		TreeSet<Integer> set5 = (TreeSet<Integer>) set.tailSet(82);
		System.out.println("82점이거나(포함) 큰  부분셋: " + set5);
		
		// 82점 이거나 작은 값을 가진 셋을 생성 (지정한 값을 포함)
		SortedSet<Integer> set6 = set.headSet(82, true);
		System.out.println("82점이거나(포함) 작은 부분셋: " + set6);
		
		// 82점보다 큰 값을 가진 셋을 생성 (지정한 값을 미포함)
		SortedSet<Integer> set7 = set.tailSet(82, false);
		System.out.println("82점보다(미포함) 큰 부분셋" + set7);
		
		
	}
}
