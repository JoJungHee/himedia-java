package test;

import java.util.ArrayList;
import java.util.Iterator;

import member.Member;

// 클래스를 다루는 리스트
public class ArrayListTest03 {
	public static void main(String[] args) {
		// 1. Member를 저장하는 리스트 생성
		ArrayList<Member> list = new ArrayList<Member>();
		
		// 2. 리스트에 Member 객체 저장
		list.add(new Member("112233", "이익준", 40));
		list.add(new Member("123456", "양석형", 41));
		list.add(new Member("987654", "추민하", 32));
		list.add(new Member("741852", "채송화", 38));
		list.add(new Member("589632", "인정원", 39));
		
		// 3. 출력
		list.forEach(i -> System.out.println(i));
		
		
		// 4. [223366, 장겨울, 30] 데이터를 맨 뒤에 추가
		System.out.println("1. 장겨울 추가");
		list.add(new Member("223366", "장겨울", 30));
		list.forEach(i -> System.out.println(i));
		
		
		// 5. [778899, 김준완, 40] 데이터를 이익준 뒤에 추가
		System.out.println("2. 이익준 뒤에 김준완 추가");
		// list.add(1, new Member("778899", "김준완", 40));
		
		for (int i = 0; i < list.size(); i++) {
//			Member m = list.get(i);
//			if (m.getName().equals("이익준")) {
			if (list.get(i).getName().equals("이익준")) {
				list.add(i+1, new Member("778899", "김준완", 40));
			}
		}
		list.forEach(i -> System.out.println(i));
		
		
		// 6. 양석형의 나이를 43으로 수정
		System.out.println("3. 양석형 나이 수정");
//		list.set(2, new Member("123456", "양석형", 43));
//		list.get(2).setAge(43);
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals("양석형")) {
				list.get(i).setAge(43);
			}
		}
		list.forEach(i -> System.out.println(i));
		
		
		// 7. 추민하 데이터를 삭제
		System.out.println("4. 추민하 데이터 삭제");
		for (int i = list.size()-1; i >= 0; i--) {
			if (list.get(i).getName().equals("추민하")) {
				list.remove(i);
			}
		}
//		list.remove(3);
//		list.remove(list.get(3));
		list.forEach(i -> System.out.println(i));
		
		
		// 8. 3가지 for문을 사용하여 출력
		System.out.println("1. 기본 for문");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------");
		
		System.out.println("2. 기본 for-in문");
		for (Member m : list) {
			System.out.println(m);
		}
		System.out.println("------");
		
		System.out.println("3. forEach() 메서드");
		list.forEach(i -> System.out.println(i));
		System.out.println("------");
		
		System.out.println("4. Iterator 사용");
		Iterator<Member> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
