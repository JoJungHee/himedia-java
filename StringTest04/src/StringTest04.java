
public class StringTest04 {
	public static void main(String[] args) {
		String s1;  	  // 사용할 때 에러 -> 초기화를 하지 않았기 때문에
		String s2 = null; // null로 초기화를 함, null: 아무곳도 참조하지 않음 // 참조하고 있지 않다라고 명시해서 에러 X
		String s3 = "";   // 빈 문자열을 참조
		
		// System.out.println(s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		System.out.println("-----");
		
		// 1. 값에 대한 비교
		// System.out.println(s2.hashCode());  // 에러: null이기 때문에 hashCode 가 존재하지 않음
		System.out.println(s3.hashCode());
		System.out.println("-----");
		
		// 2. 참조에 대한 비교
		System.out.println(System.identityHashCode(s2)); // 0, null일때는 0을 출력하고, 에러를 발생시키지는 않음
		System.out.println(System.identityHashCode(s3)); 
		
	}
}
