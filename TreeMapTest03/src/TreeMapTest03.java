import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapTest03 {
	public static void main(String[] args) {
		// 1. 트리셋 생성 - 키: 점수, 값: 학생이름
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(87, "이익준");
		map.put(98, "김준완");
		map.put(75, "채송화");
		map.put(95, "양석형");
		map.put(80, "안정원");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 1. 가장 작은 값의 엔트리를 찾음
		Entry<Integer, String> entry = map.firstEntry();
		System.out.printf("가장 낮은 점수: %d(%s)\n", entry.getKey(), entry.getValue());
		
		// 2. 가장 큰 값의 엔트리를 찾음
		entry = map.lastEntry();
		System.out.printf("가장 큰 점수: %d(%s)\n", entry.getKey(), entry.getValue());
		
		// 3. 특정 값을 기준으로 바로 아래의 엔트리를 찾음, 95점은 포함하지 않음
		entry = map.lowerEntry(95);
		System.out.printf("95점 바로 아래의 점수: %d(%s)\n", entry.getKey(), entry.getValue());
		
		// 4. 95점 바로 위의 엔트리를 찾음, 95점은 포함하지 않음
		entry = map.higherEntry(95);
		System.out.printf("95점 바로 위의 점수: %d(%s)\n", entry.getKey(), entry.getValue());
		
		// 5. 95점이거나 바로 아래의 엔트리를 찾음
		entry = map.floorEntry(95);
		System.out.printf("95점이거나 바로 아래의 점수: %d(%s)\n", entry.getKey(), entry.getValue());
		
		// 6. 95점이거나 바로 위의 엔트리를 찾음
		entry = map.ceilingEntry(95);
		System.out.printf("95점이거나 바로 위의 점수: %d(%s)\n", entry.getKey(), entry.getValue());
		
		
		
	}
}
