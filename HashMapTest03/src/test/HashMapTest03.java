package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import member.Member;

/*
문제)
1. Member 클래스를 완성하시오
2. 키는 전화번호(ex, 010-1111-1111)이고, 같은 Member 객체를 저장하는 HashMap인 map을 생성하시오.
3. 맵에 5명의 회원정보를 저장하시오.
4. 전화번호가 010-2222-2222인 회원의 정보를 삭제하시오.
5. 맵에서 전화번호가 010-3333-3333인 회원의 정보에서 이름을 장겨울, 나이를 42로 수정하시오.
6. 맵의 정보를 3가지 출력방법으로 출력하시오.

< 데이터 >
010-1111-1111, 123456, 이익준, 35
010-2222-2222, 123457, 김준완, 36
010-3333-3333, 123458, 채송화, 37
010-4444-4444, 123459, 양석형, 38
010-5555-5555, 123460, 안정원, 39 


*/
public class HashMapTest03 {
	public static void main(String[] ages) {
		// 2. 맵 생성 - 키: 전화번호, 값: Member 객체
		HashMap<String, Member> map = new HashMap<String, Member>();
		
		// 3. 데이터 추가
		map.put("010-1111-1111", new Member("123456", "이익준", 35));
		map.put("010-2222-2222", new Member("123457", "김준완", 36));
		map.put("010-3333-3333", new Member("123458", "채송화", 37));
		map.put("010-4444-4444", new Member("123459", "양석형", 38));
		map.put("010-5555-5555", new Member("123460", "안정원", 39));
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		
		// 4. 데이터 삭제
		map.remove("010-2222-2222");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		
		// 5. 데이터 수정
		// 맵에서 전화번호가 010-3333-3333인 회원의 정보에서 이름을 장겨울, 나이를 42로 수정하시오.
		//map.put("010-3333-3333", new Member("123458", "장겨울", 37));
		
		Member member = map.get("010-3333-3333");
		String no = member.getNo();
		map.put("010-3333-3333", new Member(no, "장겨울", 42));
		System.out.println(map);
		System.out.println("크기: " + map.size());
		System.out.println("-------");
		
		
		
		// 6-1. Iterator + keySet()
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println(tel + " : " + m);
		}
		System.out.println("-------");
		
		// 6-2. Iterator + entrySet()
		Set<Entry<String, Member>> entrySet = map.entrySet();
		Iterator<Entry<String, Member>> entryIt = entrySet.iterator();
		
		while (entryIt.hasNext()) {
			Entry<String, Member> entry = entryIt.next();
			String tel = entry.getKey();
			String nos = entry.getValue().getNo();
			String name = entry.getValue().getName();
			int age = entry.getValue().getAge();
			System.out.printf("전화번호: %s, %s(%s, %d)\n", tel, nos, name, age);
		}
		System.out.println("-------");
		
		// 6-3. for-in + entrySet()
		Set<Entry<String, Member>> entrySet2 = map.entrySet();
		for (Entry<String, Member> entry : entrySet2) {
			String tel = entry.getKey();
			Member mem = entry.getValue();
			System.out.printf("전화번호: %s, %s(%s, %d)\n", tel, mem.getNo(), mem.getName(), mem.getAge());
		}
		System.out.println("-------");
	}
}
