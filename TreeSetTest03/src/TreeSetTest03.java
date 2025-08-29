import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetTest03 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set1 = new HashSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		
		// 로또번호: 1 ~ 45까지의 난수로 생성
		// 문제점: 중복된 숫자가 들어감
		// 해결책: 
		// 정렬: 오름차순 정렬
		System.out.println("◆ ArrayList로 로또번호 6개를 생성");
		int cnt = 0;
		
		// 1번 방법 - 배열과 리스트에서 모두 가능
		/*
		for (int i = 0; i < 6; i++) {
			int n = (int)(Math.random() * 45)+1;
			int j = 0;
			for (; j < list.size(); j++) {
				if (n == list.get(j)) {
					--i;
					break;					
				}
				++cnt;
			}
			if (j == list.size()) {
				list.add(n);
			}
		}
		*/
		
		// 2번 방법 - 리스트에서만 가능한 방법
		while (list.size() < 6) {
			int n = (int)(Math.random() * 45)+1;
			if (!list.contains(n)) {
				list.add(n);
			}
			++cnt;
		}
		// 오름차순 정렬
		list.sort((x, y) -> x.compareTo(y));
		System.out.println(list);
		System.out.println("반복 횟수: " + cnt);
		System.out.println("-------");
		
		
		
		// HashSet의 장점: 중복값을 가지지 않음
		// 개선점: 정렬이 되지 않음 
		System.out.println("◆ HashSet으로 로또번호 6개를 생성");
		cnt = 0;
		while (set1.size() < 6) {
			int n = (int)(Math.random() * 45)+1;
			set1.add(n);
			++cnt;
		}
		System.out.println(set1);
		System.out.println("반복 횟수: " + cnt);
		System.out.println("-------");
		
		
		// TreeSet의 장점: 중복값을 가지지 않음, 오름차순으로 정렬
		System.out.println("◆ TreeSet으로 로또번호 6개를 생성");
		cnt = 0;
		while (set2.size() < 6) {
			int n = (int)(Math.random() * 45)+1;
			set2.add(n);
			++cnt; 
		}
		System.out.println(set2);
		System.out.println("반복 횟수: " + cnt);
		System.out.println("-------");
	}
}
