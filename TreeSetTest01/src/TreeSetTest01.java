import java.util.TreeSet;

public class TreeSetTest01 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		// 1.데이터 추가
		set.add(82);
		set.add(63);
		set.add(58);
		set.add(97);
		set.add(76);
		System.out.println(set);  // [58, 63, 76, 82, 97]
		System.out.println("크기:" + set.size());
		
		
		// 2. 중복 데이터 추가 - 허용하지 않음
		set.add(97);
		System.out.println(set);  // [58, 63, 76, 82, 97]
		System.out.println("크기:" + set.size());
		
		// 3. 중복되지 않은 데이터 추가 - 허용함
		set.add(80);
		System.out.println(set);  // [58, 63, 76, 80, 82, 97]
		System.out.println("크기:" + set.size());
		
		// 4. 데이터 삭제 - 존재하지 데이터
		set.remove(63);
		System.out.println(set);  // [58, 76, 80, 82, 97]
		System.out.println("크기:" + set.size());
		
		// 5. 데이터 삭제 - 존재하지 않는 데이터
		set.remove(90);
		System.out.println(set);  // [58, 76, 80, 82, 97]
		System.out.println("크기:" + set.size());
		
		// 6. 모든 데이터 삭제
		set.clear();
		System.out.println(set);
		System.out.println("크기:" + set.size());
		
	}
}
