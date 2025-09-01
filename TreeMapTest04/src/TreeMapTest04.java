import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest04 {
	public static void main(String[] args) {
		// 1. 트리셋 생성 - 키: 점수, 값: 학생이름
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		// 데이터 추가 - 키에 대한 오름차순으로 정렬
		map.put(87, "이익준");
		map.put(98, "김준완");
		map.put(75, "채송화");
		map.put(95, "양석형");
		map.put(80, "안정원");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 1. 오름차순 정렬
		System.out.println("오름차순 정렬: " + map);
		
		// 2 .내림차순 정렬
		NavigableMap<Integer, String> map2 = map.descendingMap();
		System.out.println("내림차순 정렬: " + map2);
		
		// [ 특정값을 기준으로 부분맵을 구하는 방법 ]
		// 3. 95점보다 작은 값을 가지는 맵, 95점은 포함하지 않음
		SortedMap<Integer, String> map3 = map.headMap(95);
		System.out.println("headMap: " + map3);
		
		// 4. 95점보다 큰 값을 가지는 맵
		SortedMap<Integer, String> map4 = map.tailMap(95);
		System.out.println("tailMap: " + map4);
		
		// 5. 95점이거나 작은 값을 가지는 맵
		SortedMap<Integer, String> map5 = map.headMap(95, true);
		System.out.println("headMap: " +  map5);
		
		// 6. 95점보다 큰 값을 가지는 맵, 95점을 포함하지 않음
		SortedMap<Integer, String> map6 = map.tailMap(95, false);
		System.out.println("tailMap: " + map6);
	}
}
