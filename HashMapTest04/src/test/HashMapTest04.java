package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
문제)
1. Student 클래스를 완성하시오.
2. 키는 Student 객체, 값은 점수를 갖는 HashMap인 map을 생성하시오.
3. 맵에 5명의 데이터를 저장하시오
4. 키의 값에 대한 데이터의 중복을 확인하시오.
5. 앙석형 데이터를 삭제하시오.
6. 안정원의 점수를 82로 수정하시오.
7. 3가지 방법으로 출력하시오.

< 데이터 >
123456, 이익준, 95
123457, 김준완, 88
123458, 채송화, 77
123459, 양석형, 85
123460, 안정원, 66

*/
public class HashMapTest04 {
	public static void main(String[] args) {
		// 2. 
		HashMap<Student, Integer> map = new HashMap<Student, Integer>();
		
		// 3.
		map.put(new Student(123456, "이익준"), 95);
		map.put(new Student(123457, "김준완"), 88);
		map.put(new Student(123458, "채송화"), 77);
		map.put(new Student(123459, "양석형"), 85);
		map.put(new Student(123460, "안정원"), 66);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 4-1. 데이터의 중복 - 키 중에서 학번의 중복 -> 중복 허용
		map.put(new Student(123458, "장겨울"), 90);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 4-2. 데이터의 중복 - 키 중에서 이름의 중복 -> 중복 허용
		map.put(new Student(123461, "김준완"), 85);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 4-3. 데이터의 중복 - 키에서 모든 값이 중복 -> 중복 허용 -> 문제점
		// 문제점 - 키가 객체일 때 모든 멤버변수의 값이 동일할 때는 중복을 허용하지 않도록 해야 함
		// 해결책 - Object의 hashCode(), equals() 메서드를 오버라이딩해야 함.
		map.put(new Student(123458, "채송화"), 98);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		
		//5. 양석형 데이터 삭제
		// 키 중에서 일부분의 데이터를 알 때 -> 양석형의 이름만 알고, 나이를 모를 때
		int sno = 0;
		Set<Student> keySet = map.keySet();
		Iterator<Student> it = keySet.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			if (s.getName().equals("양석형")) {
//				it.remove();
				sno = s.getSno();
				System.out.println("양석형의 학번: " + sno);
			}
		}
		// 삭제
		map.remove(new Student(sno, "양석형"));
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		
		// 6. 안정원 점수 82로 수정
		// 키 중에서 일부분의 데이터를 알 때 -> 안정원의 이름만 알고, 학번을 모를 때
		sno = 0;
		Set<Student> keySet2 = map.keySet();
		Iterator<Student> it2 = keySet2.iterator();
		while (it2.hasNext()) {
			Student s = it2.next();
			if (s.getName().equals("안정원")) {
//				it.remove();
				sno = s.getSno();
				System.out.println("안정원의 학번: " + sno);
			}
		}
		// 멤버에서는 중복 키를 허용하지 않고, 중복키를 입력하면, 새로 넣은 값으로 바뀌어줌
		map.put(new Student(sno, "안정원"), 82);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		
		// 7-1. Iterator + keySet
		Set<Student> keySet3 = map.keySet();
		Iterator<Student> it3 = keySet3.iterator();
		while(it3.hasNext()) {
			Student s = it3.next();
			Integer score = map.get(s);
			System.out.println(s + " : " +  score);
		}
		System.out.println("--------");
		
		
		// 7-2. Iterator + entrySet
		Set<Entry<Student, Integer>> entrySet = map.entrySet();
		Iterator<Entry<Student, Integer>> entryIt1 = entrySet.iterator();
		while(entryIt1.hasNext()) {
			Entry<Student,Integer> entry = entryIt1.next();
			Student s = entry.getKey();
			Integer score = entry.getValue();
			
			System.out.println(s + " : " + score);
		}
		System.out.println("--------");
		
		
		// 7-3. for-in + entrySet
		Set<Entry<Student, Integer>> entrySet2 = map.entrySet();
		for (Entry<Student, Integer> entry : entrySet2) {
			Student s = entry.getKey();
			Integer score = entry.getValue();
			System.out.println(s + " : " + score);
		}
		System.out.println("--------");
	}
}
