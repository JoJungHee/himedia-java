
public class StringTest02 {
	public static void main(String[] args) {
		// 문자열을 만드는 방법 2
		String s1 = new String("ABC");
		String s2 = new String("XYZ");
		String s3 = new String("ABC");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("------");
		
		// 해시코드 확인
		// - hashCode 메서드는 Object 클래스에 존재함.
		// - Object 클래스에 있는 hashCode 메서드는 참조에 대해서 고유한 id를 식별하지만,
		// - String 클래스에는 hashCode()를 오버라이딩하여 값에 대한 비교를 하도록 해 놓음
		
		// 문자열은 hashCode() 메서드로 값을 비교하는 것이고, 참조에 대한 비교는 할 수 없음
		// 비교 -> 값에 대한 비교
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("------");
		
		// 2. 비교 -> 참조에 대한 비교
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	}
}
