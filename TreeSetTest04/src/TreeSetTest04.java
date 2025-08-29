import java.util.TreeSet;

public class TreeSetTest04 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		// 1.데이터 추가 -> 오름차순으로 정렬
		set.add(82);
		set.add(63);
		set.add(58);
		set.add(97);
		set.add(76);
		System.out.println(set);
		
		// 최대값, 최소값
		System.out.println("최저점수: " + set.first());
		System.out.println("최고점수: " + set.last());
		System.out.println("-------");
		
		// 특정값을 기준으로 바로 위의 값과 바로 아래의 값 (특정값을 포함하지 않음)
		System.out.println("95점 바로 아래 점수: " + set.lower(95));
		System.out.println("95점 바로 위의 점수: " + set.higher(95));
		System.out.println("-------");
		
		// 특정값을 기준으로 바로 위의 값과 바로 아래의 값 (특정값을 포함)
		System.out.println("82점이거나 바로 아래 점수: " + set.floor(82));
		System.out.println("82점이거나 바로 위의 점수: " + set.ceiling(82));
		System.out.println("-------");
		
		// 데이터의 출력
		// isEmpty(): 셋에 데이터가 없는지의 여부
		// pollFirst(): 셋의 데이터를 처음부터 꺼내고, 삭제
		// pollLast(): 셋의 데이터를 마지막부터 꺼내고, 삭제
		while (!set.isEmpty()) {
//			System.out.println(set.pollFirst());
			System.out.println(set.pollLast());
		}
		System.out.println(set);
		System.out.println("크기: " + set.size());
	}
}
