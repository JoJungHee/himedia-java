import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapTest06 {
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
		
		// 출력 4
		// isEmpty() - 맵에 데이터가 없는지의 여부
		// pollFirstEntry() - 맵의 처음부터 데이터를 꺼낸 후, 삭제함
		// pollLastEntry() - 맵의 끝에서부터 데이터를 꺼낸 후, 삭제함
		while(!map.isEmpty()) {
//			Entry<Integer, String> entry = map.pollFirstEntry();
			Entry<Integer, String> entry = map.pollFirstEntry();
			System.out.println(entry.getValue() + "(" + entry.getKey() + ")");
		}
		System.out.println(map);
		System.out.println("크기: " + map.size());
	}
}
