package test;

import java.util.Iterator;
import java.util.Map.Entry;
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
		// 2. 트리맵 생성, 키: Member 객체, 값: 전화번호
		TreeMap<Member, String> map = new TreeMap<Member, String>();
		
		// 3. 데이터 추가 - 회원번호에 대한 오름차순 정렬
		map.put(new Member("123460", "안정원", 39), "010-5555-5555");
		map.put(new Member("123456", "이익준", 35), "010-1111-1111");
		map.put(new Member("123459", "양석형", 38), "010-4444-4444");
		map.put(new Member("123458", "채송화", 37), "010-3333-3333");
		map.put(new Member("123457", "김준완", 36), "010-2222-2222");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 4. 데이터 중복 - 키 중에서 회원번호에 대한 중복을 확인 -> 허용하지 않음
		// [123458, 장겨울, 32], 010-6666-6666
		// - 키 중에서 회원번호에 중복을 허용하지 않음 -> 값에 대한 수정 기능
		map.put(new Member("123458", "장겨울", 32), "010-6666-6666");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 5. 회원번호가 123456인 회원의 나이를 42로 변경하시오.
		Set<Member> keySet = map.keySet();
		Iterator<Member> it = keySet.iterator();
		while(it.hasNext()) {
			Member m = it.next();    // 회원정보
			if(m.getNo().equals("123456")) {
				m.setAge(42);
			}
		}
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 6. 회원번호가 123459인 데이터를 삭제하시오.
		keySet = map.keySet();
		it = keySet.iterator();
		Member member1 = null;
		while(it.hasNext()) {
			Member m = it.next();
			if(m.getNo().equals("123459")) {
				member1 = m;
			}
		}
		map.remove(member1);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 7. 전화번호가 010-5555-5555인 데이터를 삭제하시오.
		keySet = map.keySet();
		it = keySet.iterator();
		Member member2 = null;
		while(it.hasNext()) {
			Member m = it.next();
			String tel = map.get(m);
			if(tel.equals("010-5555-5555")) {
				member2 = m;
			}
		}
		map.remove(member2);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		System.out.println("-----");
		
		// 8-1. 출력 1번 - Iterator + keySet
		keySet = map.keySet();
		it = keySet.iterator();
		while(it.hasNext()) {
			Member m = it.next();
			String tel = map.get(m);
			System.out.println(m + " : " + tel);
		}
		System.out.println("-----");
		
		// 8-2. 출력 2번 - Iterator + entrySet
		Set<Entry<Member, String>> entrySet = map.entrySet();
		Iterator<Entry<Member, String>> entryIt = entrySet.iterator();
		while(entryIt.hasNext()) {
			Entry<Member, String> entry = entryIt.next();
			Member m = entry.getKey();
			String tel = entry.getValue();
			System.out.println(m + " : " + tel);
		}
		System.out.println("-----");
		
		// 8-3. 출력 3번 - for-in + entrySet
		entrySet = map.entrySet();
		for(Entry<Member, String> entry : entrySet) {
			Member m = entry.getKey();
			String tel = entry.getValue();
			System.out.println(m + " : " + tel);
		}
		System.out.println("-----");
		
		// 8-4. 출력 4번 - forEach()
		// - 간단하게 값을 출력할 때 사용
		map.forEach((k, v) -> System.out.println(k + " : " + v));
		
		
	}
}
