package test;

import java.util.Iterator;
import java.util.LinkedList;

import point.Point;

/*
문제)
1. 인스턴스 변수 x, y를 정수로 가지는 Point 클래스를 완성하시오.
2. Point 클래스에 생성자, setter/getter, toString() 메서드를 생성하시오.
3. Point 객체를 저장하는 LinkedList인 list를 생성하시오.
4. 리스트에 Point 객체 5개를 저장하시오
5. 리스트에서 (10, 10) 데이터 뒤에 (11, 11)을 추가하시오.
6. 리스트에서 (40, 40) 데이터를 삭제하시오.
7. 리스트에서 (50, 50) 데이터를 (55, 55)로 수정하시오.
8. 리스트의 맨 앞에 (1, 1) 데이터를 추가하시오.
9. 4가지 방법(3가지 for문과 Iterator)를 사용하여 출력하시오.

*/
public class LinkedListTest02 {
	
	public static boolean compare(Point p1, Point p2) {
		return p1.getX() == p2.getX() && p1.getY() == p2.getY();
	}
	
	public static void main(String[] args) {
		// 3. 리스트 생성
		LinkedList<Point> list = new LinkedList<Point>();
		
		// 4. 리스트에 데이터를 추가 - 순차적인 추가
		for (int i = 10; i <= 100; i+=10) {
			list.add(new Point(i, i));
		}
		System.out.println(list);
		
		// 5. (10, 10) 데이터 뒤에 (11, 11)을 추가하시오.
		System.out.println("5. (10, 10) 데이터 뒤에 (11, 11)을 추가");
		/*
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getX() == 10 && list.get(i).getY() == 10) {
				list.add(i+1, new Point(11, 11));
			}
		}
		*/
		// (1-3) 객체를 메서드를 사용하여 비교 -> 멤버 메서드가 아님 -> 효율적인 방법이 아님, 매번 메서드를 정의하여 사용하기 때문
		/*
		for (int i = 0; i < list.size(); i++) {
			if (compare(list.get(i),  new Point(10, 10))) {
				list.add(i+1, new Point(11, 11));
			}
		}
		*/
		// (1-4) 멤버 메서드를 사용하여 비교 -> 가장 논리적이고, 효율적인 방법
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(new Point(10, 10))) {
				list.add(i+1, new Point(11, 11));
			}
		}
		System.out.println(list);
		
		
		// 6. (40, 40) 데이터를 삭제하시오.
		// 리스트에서 삭제를 할 떄는 뒤에서 해야함
		System.out.println("6. (40, 40) 데이터를 삭제");
		list.add(new Point(40, 40));
		list.add(new Point(40, 40));
		System.out.println(list);
		for (int i = list.size() - 1; i >= 0; i--) {
//			if (list.get(i).getX() == 40 && list.get(i).getY() == 40) {
			if (list.get(i).equals(new Point(40 ,40))) {
				list.remove(i);
			}
		}
		System.out.println(list);
		
		// 7. (50, 50) 데이터를 (55, 55)로 수정하시오.
		System.out.println("7. (50, 50) 데이터를 (55, 55)로 수정");
		list.add(new Point(50, 50));
		list.add(new Point(50, 50));
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(new Point(50, 50))) {
				list.set(i, new Point(55, 55));
			}
		}
		System.out.println(list);
		
		
		// 8. 맨 앞에 (1, 1) 데이터를 추가하시오.
		System.out.println("8. 맨 앞에 (1, 1) 데이터를 추가");
//		list.add(0, new Point(1, 1));   // ArrayList, LinkedList 모두 사용
		list.addFirst(new Point(1, 1)); // LinkedList일 때만 사용 가능 
		System.out.println(list);
		System.out.println("------");
		
		// 9-1. 기본 for문
		System.out.println("9-1. 기본 for문");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 9-2. for-in문
		System.out.println("9-2. for-in문");
		for (Point p : list) {
			System.out.println(p);
		}
		
		// 9-3. forEach() 메서드
		System.out.println("9-3. forEach() 메서드");
		list.forEach(i -> System.out.println(i));
		
		
		// 9-4. Iterator 사용
		System.out.println("9-4. Iterator 사용");
		Iterator<Point> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
