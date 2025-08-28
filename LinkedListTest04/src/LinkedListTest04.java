import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest04 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		
		System.out.println("- 데이터 추가 -");
		add(a1);
		add(l1);
		
		
		System.out.println("- 접근시간(읽기)의 비교 -");
		System.out.println("ArrayList 시간: " + access(a1) + "ms");
		System.out.println("LinkedList 시간: " + access(l1) + "ms");
		System.out.println();
		
	}
	
	// 데이터 추가
	public static void add(List<Integer> list) {
		
		// 십만 건의 데이터를 추가 
		for (int i = 0; i < 100000; i++) {
			list.add(i);
		}
	}
	
	// 접근시간 측정
	public static long access(List<Integer> list) {
		long startTime = System.currentTimeMillis();
		
		// 모든 데이터 읽기 
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}
		
		long endTime = System.currentTimeMillis();
		return endTime - startTime;  // 수행 시간
	}
}
