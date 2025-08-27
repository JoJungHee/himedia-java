import java.util.ArrayList;
import java.util.Arrays;

/*
문제)
- 대량의 데이터가 있다는 가정하에 문제를 해결하시오
1. ArrayList인 list를 생성하고 배열 scores의 모든 값을 저장하시오.
2. 리스트에서 60점 미만인 데이터를 모두 삭제하시오.
3. 리스트에서 100점인 데이터를 모두 삭제하시오.
4. 리스트의 총점과 평균을 구하시오.
5. 리스트의 최고점수와 최저점수를 구하시오.
6. 3가지의 for문으로 출력하시오

*/
public class ArrayListTest02 {
	public static void main(String[] args) {
		int[] scores = {95, 88, 75, 63, 52, 100, 100, 77, 47, 48, 93, 91, 100};
		int tot = 0, max = 0, min = 0;
		double avg = 0.0;
		
		// 1. 리스트 생성 및 데이터 추가
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		/*
		for (Integer i : scores) {
			list.add(i);
		}
		*/
		
		// 람다식(lambda) -> 자바스크립트 화살표 함수
		Arrays.stream(scores).forEach(i -> list.add(i));
		System.out.println(list);
		
		max = scores[0];
		min = scores[0];
		
		// 2. 60점 미만인 데이터 삭제
		// remove(index): 인덱스에 해당하는 값을 삭제
		// 문제점: 48이 삭제되지 않음
		// 이유: 삭제하면서 바로 뒤에 값이 앞으로 이동하기 때문에 연속된 2개의 값 중에서 뒤에 있는 값을 검사하지 못함
		/*
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < 60) {
				list.remove(i);
			}
		}
		*/
		
		// 해결책 1번: --i를 해서 인덱스를 1 앞으로 이동시켜서 검사함
		/*
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < 60) {
				list.remove(i);
				--i;
			}
		}
		*/
		
		// ★★★★★
		// 해결책 2번: 반복문을 뒤에서부터 적용함
		// 가장 효율적인 방법: 리스트에서 삭제를 할때는 반복문을 뒤에서부터 적용시킨다.
		for (int i = list.size() - 1; i >=0 ; i--) {
			if (list.get(i) < 60) {
				list.remove(i);
			}
		}
		
		System.out.println(list);
		
		// 3. 100점인 데이터 삭제
		// 문제점: 연속된 2번째의 100이 삭제되지 않음
		/*
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 100) {
				list.remove(i);
			}
		}
		*/
		
		// 해결책: 반복문을 뒤에서부터 적용하여 해결함
		for (int i = list.size()-1; i >=0; i--) {
			if (list.get(i) == 100) {
				list.remove(i);
			}
		}
		System.out.println(list);
		
		// 4. 총점과 평균
		for (Integer i : list) {
			tot += i;
			
		}
//		list.forEach(i -> tot += i);  // 사용 불가
		avg = (double) tot / list.size();
		System.out.println("학생수: " + list.size());
		System.out.printf("총점: %d, 평균: %.2f\n", tot, avg);
		
		// 5. 최고점수와 최저점수
		// 1번 방법
		/*
		max = list.get(0);
		min = list.get(0);
		for (Integer i : list) {
			if (i > max) max = i;
			if (i < min) min = i;
		}
		*/
		
		// 2번 방법
		// 오름차순 정렬
		list.sort((x, y) -> x.compareTo(y));
		// 내림차순 정렬
		// list.sort((x, y) -> y.compareTo(x));
		
		max = list.get(list.size() - 1);
		min = list.get(0);
		System.out.println(list);
		System.out.printf("최고점수: %d, 최저점수: %d\n", max, min);
		// 6-1. 기본 for문
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----");
		
		// 6-2. for-in문
		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println("-----");
		
		// 6-3. forEach()
		list.forEach(i -> System.out.println(i));
		System.out.println("-----");
		
		
		
		/*
		int[] scores = {95, 88, 75, 63, 52, 100, 77, 47, 48, 93, 91, 100};
		int tot = 0, max = 0, min = 0;
		double avg = 0.0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		
		for (Integer i : scores) {
			list.add(i);
		}
		System.out.println(list);
		
		max = scores[0];
		min = scores[0];
		for (int i = 0; i < list.size(); i++) {
			// if (list.get(i) >= 60 && list.get(i) < 100) {
			if (list.get(i) < 60 || list.get(i) == 100) {
				list2.add(list.get(i));
			}
		}
		
		list.removeAll(list2);
		
		for (int i = 0; i < list.size(); i++) {
			tot += list.get(i);
			if (list.get(i) > max) {
				max = list.get(i);
			}
			if (list.get(i) < min) {
				min = list.get(i);
			}
		}
		avg = (double) tot / list.size();
		// list.retainAll(list2);
		System.out.println("list: " + list);
		System.out.println("총점: " + tot);
		System.out.printf("평균: %.2f \n", avg);
		System.out.printf("최대값: %3d, 최소값: %3d", max, min);
		*/
		
		
		
		
	}
}
