import java.util.TreeMap;

public class TreeMapTest01 {
	public static void main(String[] args) {
		// 키: 사번, 값: 사원명
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		// 데이터 추가 - 입력한 순서대로 출력되지 않음, 오름차순 정렬이 되어 있음
		map.put(555555, "안정원");
		map.put(333333, "채송화");
		map.put(111111, "이익준");
		map.put(444444, "양석형");
		map.put(222222, "김준완");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 데이터 중복 - 키에 대한 중복 -> 키에 대한 중복을 허용하지 않음
		// 키에 대한 값을 수정하는 방법으로 사용
		map.put(444444, "장겨울");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 데이터 중복 - 값에 대한 중복 -> 값에 대한 중복을 허용함
		map.put(666666, "채송화");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
	}
}
