package test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import member.Member;

/*
문제)
1. Member 클래스를 완성하시오
2. 키는 Member 객체, 값음 전화번호를 가지는 TreeMap인 map을 생성하시오
3. 맵에 5명의 데이터를 추가히시오
4. [223344, 장겨울, 32], 010-6666-6666인 데이터를 추가하여 키의 중복을 확인하시오
5. 회원번호가 123456인 회원의 나이를 42로 변경하시오
6. 회원번호가 123459인 데이터를 삭제하시오
7. 전화번호가 010-5555-5555인 데이터를 삭제하시오
8. 3가지 방법으로 출력하시오

< 데이터 >
123456, 이익준, 35, 010-1111-1111
123457, 김준완, 36, 010-2222-2222
123458, 채송화, 37, 010-3333-3333
123459, 양석형, 38, 010-4444-4444
123460, 안정원, 39, 010-5555-5555

*/
public class TreeMapTest07 {
	public static void main(String[] args) {
		TreeMap<Member, String> map = new TreeMap<Member, String>();
		
		map.put(new Member("123456", "이익준", 35), "010-1111-1111");
		map.put(new Member("123457", "김준완", 36), "010-2222-2222");
		map.put(new Member("123458", "채송화", 37), "010-3333-3333");
		map.put(new Member("123459", "양석형", 38), "010-4444-4444");
		map.put(new Member("123460", "안정원", 39), "010-5555-5555");
		
		// 4.
		map.put(new Member("223344", "장겨울", 32), "010-6666-6666");
		map.forEach((x, y) -> System.out.println(x + " : " + y));
		System.out.println("------");
		
		
		// 5. 회원번호가 123456인 회원의 나이를 42로 변경하시오
		Set<Member> keySet = map.keySet();
		Iterator<Member> it = keySet.iterator();
		while(it.hasNext()) {
			Member m = it.next();
			if (m.getSno().equals("123456")) {
				m.setAge(42);
			}
		}
		map.forEach((x, y) -> System.out.println(x + " : " + y));
		System.out.println("------");
		
		
		// 6. 회원번호가 123459인 데이터를 삭제
		Set<Member> keySet2 = map.keySet();
		Iterator<Member> it2 = keySet2.iterator();
		while(it2.hasNext()) {
			Member m = it2.next();
			if (m.getSno().equals("123459")) {
				it2.remove();
			}
		}
		map.forEach((x, y) -> System.out.println(x + " : " + y));
		System.out.println("------");
		
		
		// 7. 전화번호가 010-5555-5555인 데이터를 삭제
		Set<Member> keySet3 = map.keySet();
		Iterator<Member> it3 = keySet3.iterator();
		while(it3.hasNext()) {
			Member m = it3.next();
			String tel = map.get(m);
			if (tel.equals("010-5555-5555")) {
				it3.remove();
			}
		}
		map.forEach((x, y) -> System.out.println(x + " : " + y));
		
		
	}
}
