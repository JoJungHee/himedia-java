import java.util.LinkedList;

public class LinkedListTest01 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		// 1. 데이터 추가 - 순차적 추가
		list.add("이익준");
		list.add("김준완");
		list.add("양석형");
		list.add("안정원");
		list.add("채송화");
		
		System.out.println(list);
		
		// 2. 데이터 추가 - 비순차적 추가
		// 안정원 다음에 장겨울을 추가
		list.add(4, "장겨울");
		System.out.println(list);
		
		// 3. 데이터 수정
		// 양석형을 추민하로 변경
		list.set(2, "추민하");
		System.out.println(list);
		
		// 4. 데이터 삭제
		// 김준완을 삭제
		list.remove(1);
		System.out.println(list);
		
		// ★ LinkedList에 추가된 기능
		// 5. 첫 번째 위치에 데이터를 추가
//		list.add(0, "안치홍");
		list.addFirst("안치홍");
		System.out.println(list);
		
		// 6. 마지막 위치에 데이터를 추가
		// 도재학을 마지막 데이터로 추가
//		list.add("도재학");
//		list.add(list.size(), "도재학");
		list.addLast("도재학");	// LinkedList에 추가
		System.out.println(list);
		
		// 7. 첫 번째 데이터를 삭제
		// list.remove(0);
		list.removeFirst();		// LinkedList에 추가
		System.out.println(list);
		
		// 8. 마지막 데이터를 삭제
//		list.remove(list.size()-1);
		list.removeLast();		// LinkedList에 추가
		System.out.println(list);
		
		// 9. 첫 번째 데이터를 확인
//		System.out.println(list.get(0));
		System.out.println(list.getFirst());
		
		// 10. 마지막 데이터를 확인
//		System.out.println(list.get(list.size()-1));
		System.out.println(list.getLast());
		
		
	}
}
