import java.util.HashMap;

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
		
		map.remove("채송화");
		System.out.println(map);
		
	}
}
