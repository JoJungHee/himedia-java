import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsTest01 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		
		// 1. allAll(): 한꺼번에 여러 개의 데이터를 저장
		Collections.addAll(list, 10, 20, 30, 40, 50);
		System.out.println(list);
		
		Collections.addAll(set, 10, 20, 30, 40, 50);
		System.out.println(set);
		System.out.println("-----");
		
		// 2. rotate(): 값을 이동
		Collections.rotate(list, 2); // 오른쪽으로 2자리 이동
		System.out.println(list);
		
		Collections.rotate(list, -3); // 왼쪽으로 3자리 이동
		System.out.println(list);
		
		Collections.rotate(list, 1); // 오른쪽으로 1자리 이동
		System.out.println(list);
		System.out.println("-----");
		
		// 3. swap(): 두 개의 인덱스에 해당하는 값을 바꿈
		Collections.swap(list, 1, 3); // 1번과 3번의 값을 바꿈
		System.out.println(list);
		System.out.println("-----");
		
		// 4. shuffle(): 모든 요소의 값을 섞어서 임의의 자리로 이동
		// - 난수를 생성할 때 유용하게 사용할 수 있는 기능
		Collections.shuffle(list);
		System.out.println(list);
		System.out.println("-----");
		
		// 5. sort(): 모든 요소를 오름차순으로 정렬
		//list.sort((x, y) -> x.compareTo(y)); // 오름차순 정렬
		//list.sort((x, y) -> y.compareTo(x));   // 내림차순 정렬
		
		Collections.sort(list); // 오름차순 정렬
		//Collections.sort(list, Collections.reverseOrder()); // 내림차순 정렬
		System.out.println(list);
		System.out.println("-----");
		
		// 6. reverse(): 역순으로 저장
		Collections.reverse(list);
		Collections.reverse(list);
		System.out.println(list);
		System.out.println("-----");
		
		// 7. binarySearch(): 컬렉션에서 값에 대한 인덱스를 구함.
		// - 오름차순으로 정렬되어 있을 때만 사용 가능
		System.out.println(Collections.binarySearch(list, 30)); // 2
		
		// 8. max(): 최대값을 구함
		// 9. min(): 최소값을 구함
		System.out.println("최대값: " + Collections.max(list)); // 50
		System.out.println("최소값: " + Collections.min(list)); // 10
		
		// 10. fill(): 모든 요소의 값을 지정한 값으로 변경하여 채움
		Collections.fill(list, 60);
		System.out.println(list);
		System.out.println("-----");
		
		// 11. nCopies(개수, 값): 개수만큼 값을 채운 새로운 리스트를 생성
		List<Integer> newList = Collections.nCopies(5, 10);
		System.out.println(newList);
		
		// 12. copy(변경할 컬렉션, 원본 컬렉션): 원본 컬렉션의 모든 요소의 값을 변경할 컬렉션에 복사함.
		Collections.copy(list, newList); // list의 모든 값이 newList의 값으로 변경
		System.out.println(list);
		
		
	}

}
