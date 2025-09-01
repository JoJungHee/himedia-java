import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
문제)
1. 키는 이름, 값은 나이를 쌍으로 저장하는 HashMap인 map을 생성하시오.
2. 맵에 회원 데이터를 5명 저장하고, 확인 하시오.
3. 키와 값에 대한 중복을 확인하시오.
4. 데이터를 수정하시오
5. 데이터를 삭제하시오.
6. 3가지 방법으로 출력하시오

*/

public class HashMapTest02 {
	public static void main(String[] args) {
		// 1. 키: 이름, 값: 나이
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		// 2. 데이터 추가 - 순서가 없음(인덱스가 없음, 입력 순서와 출력 순서가 다름)
		map.put("이익준", 40);
		map.put("양석형", 41);
		map.put("안정원", 42);
		map.put("김준완", 39);
		map.put("채송화", 45);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 3.1 - 중복 데이터 확인 - 키의 중복 -> 중복을 허용하지 않음 -> 키에 대한 값을 변경
		// - 값을 수정하는 방법으로 사용
		System.out.println("키중복");
		map.put("이익준", 33);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		
		// 3.2 - 중복 데이터 확인 - 값의 중복
		System.out.println("값중복");
		map.put("추민하", 45);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 4. 데이터 수정 - 존재하는 키를 사용하여 값을 수정 (키에 대한 중복을 허용하지 않는 특성을 사용)
		System.out.println("데이터 수정");
		map.put("채송화", 30);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 5-1. 데이터 삭제 - 키를 통해서 데이터를 삭제
		System.out.println("데이터 삭제");
		map.remove("채송화");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 5-2. 데이터 삭제 - 키와 값을 모두 확인하여 데이터를 삭제
		map.remove("김준완", 39);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		
		// 6-1. 출력 방법 1 - Iterator + keySet()
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String name = it.next();
			int age = map.get(name);
			System.out.printf("이름: %s(%d)\n", name, age);
			
		}
		System.out.println("---------");
		
		// 6-2. 출력 방법 2 - Iterator + entrySet()
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIt = entrySet.iterator();
		
		while (entryIt.hasNext()) {
			Entry<String, Integer> entry = entryIt.next();
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.printf("이름: %s(%d)\n", name, age);
		}
		System.out.println("---------");
		
		// 6-3. 출력 방법 3 - for-in + entrySet()
		Set<Entry<String, Integer>> entrySet2 = map.entrySet();
		for (Entry<String, Integer> entry : entrySet2) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.printf("이름: %s(%d)\n", name, age);
		}
		
	}
}
