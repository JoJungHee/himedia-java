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
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("이익준", 40);
		map.put("양석형", 41);
		map.put("안정원", 42);
		map.put("김준완", 39);
		map.put("채송화", 45);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 키 중복
		System.out.println("키중복");
		map.put("이익준", 33);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		
		// 값 중복
		System.out.println("값중복");
		map.put("추민하", 45);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 데이터 수정
		System.out.println("데이터 수정");
		map.put("채송화", 30);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 데이터 삭제
		System.out.println("데이터 삭제");
		map.remove("채송화");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 출력 방법 1 - Iterator + keySet()
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String name = it.next();
			int age = map.get(name);
			System.out.printf("이름: %s(%d)\n", name, age);
			
		}
		System.out.println("---------");
		
		// 출력 방법 2 - Iterator + entrySet()
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIt = entrySet.iterator();
		
		while (entryIt.hasNext()) {
			Entry<String, Integer> entry = entryIt.next();
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.printf("이름: %s(%d)\n", name, age);
		}
		System.out.println("---------");
		
		// 출력 방법 3 - for-in + entrySet()
		Set<Entry<String, Integer>> entrySet2 = map.entrySet();
		for (Entry<String, Integer> entry : entrySet2) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.printf("이름: %s(%d)\n", name, age);
		}
		
	}
}
