import java.util.ArrayList;

public class ArrayListTest01 {
	public static void main(String[] args) {
		int[] scores = {95, 88, 75, 63, 52, 77, 47, 48, 93, 91};
		
		// 1. ArrayList 생성 및 추가 (순차적인 추가)
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (Integer s : scores) {
			list.add(s);
		}
		System.out.println(list);
		
		
		// 2. 52점인 값을 삭제
//		list.remove(52); // 에러: 정수일 때는 인덱스를 통한 삭제만 가능
//		list.remove(4);  // 인덱스를 통한 삭제
		list.remove(list.indexOf(52));
		System.out.println(list);
		
		// 3. 88 다음에 99를 추가 (중간에 추가)
//		list.add(2, 99);
		list.add(list.indexOf(88)+1, 99);
		System.out.println(list);
		
		// 4. 77을 87로 변경
//		list.set(5, 87);
		list.set(list.indexOf(77), 87);
		System.out.println(list);
		
		// 5-1. 기본 for문
		System.out.println("- 1. 기본 for문 -");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------");
		
		System.out.println("- 2. for-in문 -");
		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println("------");
		
		// 5-3
		System.out.println("- 3. forEach() -");
		// forEach(): 람다식을 활용하여 출력
		list.forEach(i -> System.out.println(i));
		System.out.println("------");
		
	}
}
