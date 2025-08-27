import java.util.Arrays;
import java.util.Collections;

// Arrays 클래스
// - 배열을 다룰 때 편리한 기능의 메서드를 가지고 있는 클래스

public class ArraysTest01 {
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		int[] b = {10, 20, 30, 40, 50};
		int[] c = {11, 22, 33, 44, 55};
		int[] d = {0, 20, 30, 40, 50, 60};
		int[][] arr2d = {
				{11, 22, 33},
				{44, 55, 66}
		};
		
		// 배열 확인
		// Arrays.toString(): 1차원
		// Arrays.deepToString(): 2차원
		System.out.println(a.toString());        		// 배열의 해시코드, Object의 toString() 호출 
		System.out.println(Arrays.toString(a));  		// 1차원 배열 [10, 20, 30, 40, 50]
		System.out.println(Arrays.toString(arr2d));		// [[I@7d6f77cc, [I@5aaa6d82]
		System.out.println(Arrays.deepToString(arr2d));  // 2차월 배열 [[11, 22, 33], [44, 55, 66]]
		
		// 배열 복사 
		// 1. Arrays.copyOf(복사할 배열명, 복사할 배열의 개수)
		// - 배열의 길이만큼 복사하여 새로운 배열을 생성
		// 2. Arrays.copyOfRange(복사할 배열명, 시작 인덱스, 끝 인덱스)
		// - 배열을 시작 인덱스부터 끝 인덱스 전까지 복사하여 새로운 배열을 생성, 끝 인덱스는 포함하지 않음
		
		// - 배열을 길이만큼 복사하여 새로운 배열을 생성
		int[] a2 = Arrays.copyOf(a, a.length);  // 똑같이 복사
		int[] a3 = Arrays.copyOf(a, 3);			// 처음부터 3개 복사
		int[] a4 = Arrays.copyOf(a, 7);			// 처음부터 7개 복사, 원본의 개수보다 많을 때는 0을 채움
		int[] a5 = Arrays.copyOfRange(a, 1, 4);	// 1번 인덱스에서 4번 인덱스 전까지 복사
		
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.toString(a4));
		System.out.println(Arrays.toString(a5));
		System.out.println("------");
		
		
		// 배열을 동일한 값으로 채움
		// - Arrays.fill(배열명, 채울 값)
		int[] x1 = new int[5];
		System.out.println(Arrays.toString(x1));
		Arrays.fill(x1,  7);
		System.out.println(Arrays.toString(x1));
		
		
		// 배열을 임의의 값으로 채움 (한 자리 양수 정수로 채움, 0 ~ 9)
		int[] x2 = new int[5];
		System.out.println(Arrays.toString(x2));
		Arrays.setAll(x2, i -> (int)(Math.random()*10));  // 람다식
		System.out.println(Arrays.toString(x2));
		System.out.println("------");
		
		// 배열의 동일 여부를 확인
		// 1차원 배열
		System.out.println(Arrays.equals(a, b)); // true
		System.out.println(Arrays.equals(a, c)); // false
		System.out.println(Arrays.equals(a, d)); // false
		System.out.println("------");
		
		// 2차원 배열
		String[][] str2d1 = {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2d2 = {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2d3 = {{"aaa", "bbb"}, {"AAA", "CCC"}};
		System.out.println(Arrays.deepEquals(str2d1, str2d2));  // true
		System.out.println(Arrays.deepEquals(str2d1, str2d3));  // false
		System.out.println("------");
		
		// 배열의 정렬
		int[] x = {30, 20, 50, 40, 10};
		System.out.println(Arrays.toString(x));
		
		// 오름차순 정렬
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		
		// 내림차순 정렬
		// ★ 주의: Collections.reverseOrder()를 사용할 때는 객체형의 배열이어야 함
		Integer[] y = {30, 20, 50, 40, 10};
		// Arrays.sort(x, Collections.reverseOrder());  // 에러: 기본형인 int형의 배열이기 때문
		Arrays.sort(y, Collections.reverseOrder());
		System.out.println(Arrays.toString(y));
		System.out.println("------");
		
		// 내림차순 정렬
		// int형의 1차원 배열을 Integer형의 1차원 배열로 변경하는 방법
		Integer[] z = Arrays.stream(x).boxed().toArray(Integer[]::new);
		System.out.println(Arrays.toString(z));
		
		// 오름차순 정렬
		Arrays.sort(z);
		System.out.println(Arrays.toString(z));
		
		// 내림차순 정렬
		Arrays.sort(y, Collections.reverseOrder());
		System.out.println(Arrays.toString(y));
		System.out.println("------");
		
		
		// 배열에서 데이터를 검색하여 인덱스를 구함
		int[] n = {33, 22, 55, 11, 44};
		
		// 44의 위치(인덱스)를 확인
		// Arrays.binarySearch(배열명, 찾는 값): 배열에서 찾는 값의 인덱스를 구함
		// - 반드시 오름차순으로 정렬되어 있을 때만 가능
		int idx = Arrays.binarySearch(n, 44);  // -3, 잘못된 결과 (오름차순으로 정렬되지 않았을 때)
		System.out.println(idx);
		
		// 오름차순으로 정렬한 후에 검색
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));
		int idx2 = Arrays.binarySearch(n, 44);  // 3, 올바른 결과 (오름차순으로 정렬되어 있을 때)
		System.out.println(idx2);
		
		
		
		
		
		
		
		
		
		
	}
}
