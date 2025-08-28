import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList와 LinkedList의 효율을 비교하는 클래스
// ArrayList: 순차적인 추가, 삭제가 빠름, 비순차적인(중간) 추가와 삭제는 느림, 접근속도(읽기) 속도가 빠름,
// LinkedList: 순자적인 추가와 삭제가 느림, 비순차적인(중간) 추가와 삭제는 빠름, 접근속도(읽기) 속도가 느림
public class LinkedListTest03 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		
		System.out.println("- 1. 순차적인 추가");
		System.out.println("ArrayList 시간: " + add1(a1) + "ms");
		System.out.println("LinkedList 시간: " + add1(l1) + "ms");
		System.out.println();
		
		System.out.println("- 2. 중간에서 추가");
		System.out.println("ArrayList 시간: " + add2(a1) + "ms");
		System.out.println("LinkedList 시간: " + add2(l1) + "ms");
		System.out.println();
		
		System.out.println("- 3. 중간에서 삭제");
		System.out.println("ArrayList 시간: " + remove1(a1) + "ms");
		System.out.println("LinkedList 시간: " + remove1(l1) + "ms");
		System.out.println();
		
		System.out.println("- 4. 순차적인 삭제");
		System.out.println("ArrayList 시간: " + remove2(a1) + "ms");
		System.out.println("LinkedList 시간: " + remove2(l1) + "ms");
		System.out.println();
	}
	
	// 순차적인 추가
	public static long add1(List<Integer> list) {
		long startTime = System.currentTimeMillis();
		
		// 백만 건의 데이터를 추가 1000000 
		for (int i = 0; i < 1000000; i++) {
			list.add(i);
		}
		
		long endTime = System.currentTimeMillis();
		return endTime - startTime;  // 수행 시간
	}
	
	// 중간에서 추가
	public static long add2(List<Integer> list) {
		long startTime = System.currentTimeMillis();
		
		// 500번 인덱스에 데이터를 10000건 추가
		for (int i = 0; i < 10000; i++) {
			list.add(500, i);
		}
		
		long endTime = System.currentTimeMillis();
		return endTime - startTime;  // 수행 시간
	}
	
	// 중간에서 삭제
	public static long remove1(List<Integer> list) {
		long startTime = System.currentTimeMillis();
		
		// 0번부터 1000개의 데이터를 중간에서 삭제
		for (int i = 0; i < 10000; i++) {
			list.remove(i);
		}
		
		long endTime = System.currentTimeMillis();
		return endTime - startTime;  // 수행 시간
	}
	
	// 중간에서 삭제
	public static long remove2(List<Integer> list) {
		long startTime = System.currentTimeMillis();
		
		// 모든 데이터를 뒤에서부터 삭제
		for (int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}
		
		long endTime = System.currentTimeMillis();
		return endTime - startTime;  // 수행 시간
	}
}
