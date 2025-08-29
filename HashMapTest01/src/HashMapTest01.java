import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest01 {
	public static void main(String[] args) {
		// 학생 데이터를 저장하는 맵
		// 키: 학번(Integer), 값: 이름(String)
		// 키를 통해서 값을 찾도록 만든 구조
		
		// 1. 해시맵 생성
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// 2. 데이터 추가 -> 순서가 없음(인덱스가 없음)
		map.put(123456, "이익준");
		map.put(223344, "김준완");
		map.put(556677, "채송화");
		map.put(998877, "양석형");
		map.put(111111, "안정원");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 3-1. 중복 데이터 추가 - 키가 중복일 때 -> 중복을 허용하지 않음
		// - 키에 대한 값을 변경하는 용도로 사용함
		// - 데이터에 대한 값을 수정하는 방법
		map.put(111111, "도재학");
		System.out.println(map);
		System.out.println("크기: " + map.size());

		
		// 3-2. 중복 데이터 추가 - 값이 중복일 때 -> 중복을 허용함
		map.put(222222, "채송화");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		
		// 4. 데이터의 삭제
		// 4-1. 키가 같을 때 데이터를 삭제
		map.remove(998877);  
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		
		// 4-2. 키와 값이 모두 같을 때 데이터 삭제
		map.remove(123456, "이익준");
		// map.remove(123456, "이익순");  // 키는 같지만 값이 다를 때는 삭제되지 않음
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		
		// 출력 방법 1번 - Iterator + keySet()
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		while (it.hasNext()) {
			Integer sno = it.next(); // 키 - 학번
			String name = map.get(sno);	// 값 - 이름
			System.out.println(sno + " : " + name);
		}
		System.out.println("---------");
		
		// 출력 방법 2번 - Iterator + entrySet()
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> entryIt = entrySet.iterator();
		
		while (entryIt.hasNext()) {
			Entry<Integer, String> entry = entryIt.next();
			Integer sno = entry.getKey();
			String name = entry.getValue();
			System.out.println(sno + " : " + name);
		}
		System.out.println("---------");
		
		// 출력 방법 3번 - for-in + entrySet()
		Set<Entry<Integer, String>> entrySet2 = map.entrySet();
		for (Entry<Integer, String> entry : entrySet2) {
			Integer sno = entry.getKey();
			String name = entry.getValue();
			System.out.println(sno + " : " + name);
		}
		System.out.println("---------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
