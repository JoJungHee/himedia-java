
public class StringBufferTest01 {
	public static void main(String[] args) {
		// 1. String의 문제점
		// - immutable한 특성 (바꿀수 없는)
		// - 문자열의 추가, 변경, 삭제시에 새로운 인스턴스로 변경한다.
		// - 기존의 인스턴스를 유지하지 않는다.
		// - 확인: 문자열의 추가, 변경, 삭제 전의 해시코드와 이후에 해시코드가 다르다.
		String s1 = "ABC";
		System.out.println(s1);
		System.out.println("String 연결 전: " + System.identityHashCode(s1));
		s1 += "DEF";
		
		System.out.println(s1);
		System.out.println("String 연결 후: " + System.identityHashCode(s1));
		System.out.println("------");
		
		// 2. StringBuffer 클래스
		// - mutable한 특성 (바꿀수 있는)
		// - 문자열의 추가, 변경, 삭제시에 기존의 인스턴스를 유지하여 변경한다.
		// - 확인: 문자열의 추가, 변경 삭제 전의 해시코드와 이후의 해시코드가 같다.
		// - string 클래스의 문제점을 해결함.
		// - 문자열의 추가, 변경, 삭제에 특화된 클래스
		StringBuffer sb1 = new StringBuffer("ABC");
		System.out.println(sb1.toString()); // toString() 생략 가능
		System.out.println("StringBuffer 연결 전: " + System.identityHashCode(sb1));
		
//		sb1 += "DEF";  // 불가
		sb1.append("DEF");
		System.out.println(sb1); // toString() 생략 가능
		System.out.println("StringBuffer 연결 후: " + System.identityHashCode(sb1));
	}
}
