package test;

import java.util.HashSet;

import member.Member;
 
public class HashSetTest03 {
	public static void main(String[] args) {
//		raw -> generic member를 담은 해시셋 생성
		// 1. 해시셋 생성
		HashSet<Member> set = new HashSet<Member>();
		
		
		// 2. 데이터 추가 -> 순서가 없음
		set.add(new Member("이익준", 42));
		set.add(new Member("김준완", 41));
		set.add(new Member("안정원", 39));
		set.add(new Member("채송화", 38));
		set.add(new Member("양석형", 40));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 3-1. 중복 데이터 추가 - 이름만 같은 데이터 추가 -> 허용함
		set.add(new Member("채송화", 25));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 3-2. 중복 데이터 추가 - 나이만 같은 데이터 추가 -> 허용함
		set.add(new Member("도재학", 40));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		
		// ★★★★★
		// 3-3. 중복 데이터 추가 - 이름과 나이가 모두 같은 데이터 추가 -> 허용함 -> 문제점이 발현
		// -> 이 문제를 해결하지 않으면 HashSet을 사용하면 안됨
		// 해결책: 사용하는 클래스에서 Object 클래스의 hashCode(), equals() 메서드를 오버라이딩하여 해결함
		set.add(new Member("이익준", 42));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
	}
}
