package test;

import java.util.TreeSet;

import fruit.Fruit;

/*
문제)
1. 과일 클래스인 Fruit 클래스를 완성하시오
2. Fruit 객체를 담아 처리하는 TreeSet인 set을 생성하시오
3. set에 5가지의 과일을 저장하시오. (과일 이름, 가격, 수량을 다르게 줄 것)
4. set에 중복 데이터를 허용하는지의 여부를 확인하시오.
5. set이 오름차순 정렬을 하고 있는지 확인하고, 그렇지 않다면 이 문제를 해결하시오.
6. set에 있는 특정 과일을 삭제하시오.
7. set에 있는 특정 과일을 수정하시오.
8. 4가지 방법으로 출력하시오.

*/

/*
- 주의 ★★★★★
  TreeSet에 사용자가 정의한 클래스 객체를 담아서 처리하려면,
  해당 클래스는 Comparable 인터페이스 안의 추상 메서드인 compareTo() 메서드를 오버라이딩 해야 함

- compareTo() 메서드에는 this의 멤버변수와 매개변수의 멤버변수의 값을 비교하도록 구현해야 함
- 오름차순 정렬: this의 값이 매개변수의 값보다 크다면 양수(1), 작다면 음수(-1), 같다면 0을 리턴하도록 함
- 내림차순 정렬: this의 값이 매개변수의 값보다 크다면 음수(-1), 작다면 양수(1), 같다면 0을 리턴하도록 함
 
*/
public class TreeSetTest07 {
	public static void main(String[] args) {
		// 2. 트리셋 생성
		TreeSet<Fruit> set = new TreeSet<Fruit>();
		
		// 3. 데이터 추가
		// 예외 발생: TreeSet에 객체를 담고자 한다면, Comparable 인터페이스를 구현한 객체를 사용해야 함
		// Exception in thread "main" java.lang.ClassCastException: class fruit.Fruit cannot be cast to class java.lang.Comparable
		set.add(new Fruit("사과", 1000, 35));
		set.add(new Fruit("자두", 3000, 53));
		set.add(new Fruit("포도", 6000, 27));
		set.add(new Fruit("망고", 4500, 30));
		set.add(new Fruit("참외", 2700, 28));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		System.out.println();
		
		
		// 4-1. 중복 데이터를 확인 - 과일 이름이 같을 때 -> 허용하지 않음
		System.out.println("- 과일 이름이 같을 때 -");
		set.add(new Fruit("사과", 1500, 45));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 4-2. 중복 데이터 확인 - 과일 가격이 같을 때 -> 허용함
		System.out.println("- 과일 가격이 같을 때 -");
		set.add(new Fruit("메론", 6000, 25));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 4-3. 중복 데이터 확인 - 과일 수량이 같을 때 -> 허용함
		System.out.println("- 과일 수량이 같을 때 -");
		set.add(new Fruit("수박", 9900, 30));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		
		// 5-1. 삭제 - 과일 이름이 같을 때 -> 삭제 됨
		set.remove(new Fruit("망고", 4100, 31));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		
		// 5-2. 삭제 - 과일 가격이 같을 때 -> 삭제 되지 않음
		set.remove(new Fruit("감귤", 6000, 33));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 5-2. 삭제 - 과일 수량이 같을 때
		set.remove(new Fruit("거봉", 3500, 30));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		
		
		
	}
}	
