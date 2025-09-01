import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest05 {
	public static void main(String[] args) {
		// 키: 과일이름, 값: 과일가격
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		map.put("grape", 3000);
		map.put("pineapple", 4500);
		map.put("cheery", 2700);
		map.put("apple", 1300);
		map.put("blueberry", 2300);
		map.put("melon", 2800);
		map.put("strawberry", 3300);
		map.put("watermelon", 8800);
		map.put("kiwi", 4400);
		map.put("orange", 3300);
		map.put("peach", 5200);
		map.put("g", 9900);
		System.out.println(map);
		
		// 1. b부터 g 앞까지의 부분셋, g는 포함하지 않음
		SortedMap<String, Integer> map2 = map.subMap("b", "g");
		System.out.println(map2);
		
		// 2. b부터 g까지를 부분셋, g도 포함
		// subMap(값1, true, 값2, true) - 값1부터 값2까지, 값2도 포함함
		SortedMap<String, Integer> map3 = map.subMap("b", true, "g", true);
		System.out.println(map3);
	}
}
