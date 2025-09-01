import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
문제)
1. 키는 학생이름, 값은 점수를 저장하는 HashMap인 map을 생성하시오.
2. 맵에 5명의 학생 데이터를 저장하시오
3. 맵에 데이터 입력에 대한 중복을 확인하시오.
4. 김준완의 데이터를 삭제하시오
5. 안정원의 점수를 85로 수정하시오
6. 3가지의 방법으로 출력하시오.

<데이터>
이익준, 95
김준완, 88
채송화, 92
양석형, 78
안정원, 63


*/
public class TreeMapTest02 {
	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("이익준", 95);
		map.put("김준완", 88);
		map.put("채송화", 92);
		map.put("양석형", 78);
		map.put("안정원", 63);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 키중복
		map.put("채송화", 30);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 값중복
		map.put("장겨울", 96);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 삭제
		map.remove("김준완");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 수정
		map.put("안정원", 85);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String name = it.next();
			Integer score = map.get(name);
			System.out.println("학생이름: " + name + ", 점수: " + score);
		}
		System.out.println("----------");
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIt = entrySet.iterator();
		while (entryIt.hasNext()) {
			Entry<String, Integer> entry = entryIt.next();
			String name = entry.getKey();
			Integer score = entry.getValue();
			System.out.println("학생이름: " + name + ", 점수: " + score);
		}
		System.out.println("----------");
		
		Set<Entry<String, Integer>> entrySet2 = map.entrySet();
		for (Entry<String, Integer> entry : entrySet2) {
			String name = entry.getKey();
			Integer score = entry.getValue();
			System.out.println("학생이름: " + name + ", 점수: " + score);
		}
		System.out.println("----------");
	}
}
