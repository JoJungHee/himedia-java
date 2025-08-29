package test;

import java.util.HashSet;
import java.util.Iterator;

import student.Student;

/*
문제)
1. Student 클래스를 완성하시오
2. Student 클래스를 담는 HashSet인 set을 생성하시오
3. Student 클래스에 서로 다른 학생 데이터 5개를 저장하시오
4. 중복 데이터에 대한 하용 여부를 확인하시오 (학번, 이름, 학번과 이름)
5. 중복 데이터를 허용한다면, 이 문제를 해결하시오.
6. 데이터를 삭제하여 확인하시오 
7. set의 데이터를 4가지 방법으로 출력하시오

*/
public class HashSetTest04 {
	public static void main(String[] args) {
		// 1. 해시셋 생성
		HashSet<Student> set = new HashSet<Student>();
		
		// 2. 데이터 추가
		set.add(new Student("123456", "이익준"));
		set.add(new Student("112233", "김준완"));
		set.add(new Student("336699", "채송화"));
		set.add(new Student("998877", "양석형"));
		set.add(new Student("987456", "안정원"));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 3-1. 중복 데이터 확인 - 학번만 같은 데이터 추가 -> 허용
		set.add(new Student("123456", "도재학"));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 3-2. 중복 데이터 확인 - 이름만 같은 데이터 추가 -> 허용
		set.add(new Student("555555", "채송화"));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		
		// 3-3. 중복 데이터 확인 - 학번과 이름이 모두 같은 데이터 추가 -> 허용함 -> 문제점
		// 해결책: Obejct 클래스의 hashCode(), equals() 매서드 오버라이딩함
		set.add(new Student("112233", "김준완"));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		
		// 4-1. 데이터 삭제 - 학번만 같을 때 삭제 -> 삭제되지 않음
		set.remove(new Student("998877", "장겨울"));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		
		// 4-2. 데이터 삭제 - 이름만 같을 때 삭제 -> 삭제되지 않음
		set.remove(new Student("135791", "안정원"));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 4-3. 데이터 삭제 - 학번과 이름이 모두 같을 때 삭제 -> 삭제되지 않음 -> 문제점
		// 해결책: Obejct 클래스의 hashCode(), equals() 매서드 오버라이딩함
		set.remove(new Student("998877", "양석형"));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		
		
		
		// 5-1. for-in문
		for (Student s : set) {
			System.out.println(s);
		}
		System.out.println();
		
		// 5-2. forEach() + 람다식
		set.forEach(i -> System.out.println(i));
		System.out.println();
		
		// 5-3. forEach() + 메서드 참조 연산자(::)
		set.forEach(System.out::println);
		System.out.println();
		
		
		// 5-4. Iterator
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
