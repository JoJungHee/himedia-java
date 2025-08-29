import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest06 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		

		String[] str = {"abc", "alien", "bat", "car", "Car", "disco", "dance", "dZZZZ", "dzzzz",
            "elephant", "elevator", "fan", "flower", "d", "a", "바다", "하늘", "나무", "강", "?", "!",
            "*", "#"
        };
		
		// 데이터 추가
		Arrays.stream(str).forEach(i -> set.add(i));
		System.out.println(set);
		
		// 4. 부분셋 - 범위를 기준으로 부분셋을 나누는 방법 (subSet)
		// a부터 d앞까지를 부분셋으로 저장(d는 미포함)
		// subSet(값1, 값2): 값1은 포함, 값2는 미포함
		// subSet(값1, boolean, 값2, boolean): 값1과 값2의 포함 여부를 boolean값으로 지정할 수 있음
		SortedSet<String> set2 = set.subSet("a", "d");  // a부터 d앞까지
		System.out.println(set2);
		
		// a부터 d로 시작하는 값을 부분셋으로 저장(d 포함)
		SortedSet<String> set3 = set.subSet("a", "e");  // a부터 d로 시작하는 값을 저장
//		SortedSet<String> set3 = set.subSet("a", "dzzzzzzzzzz");
		System.out.println(set3);
		
		
		SortedSet<String> set4 = set.subSet("a", true, "d", false);
		System.out.println(set4);
		
		// ㄱ부터 ㄷ으로 시작하는 모든 단어를 부분셋으로 저장
		//한글일 경우에는 한 글자를 단위로 인식함 
		SortedSet<String> set5 = set.subSet("가", "라");
		System.out.println(set5);
		
		
	}
}
