
public class StringTest06 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";

		
		// 1. hashCode(), System.identityHashCode()
		// 2. intern()
		// 3. equals()
		// 4. equalsIgnoreCase()
		// 5. charAt(index): 인덱스에 해당하는 1문자를 리턴
		// 6. length(): 문자열의 길이
		
		System.out.println(s1.charAt(6));
		System.out.println("첫문자: " + s1.charAt(0));
		System.out.println("문자열의 길이: " + s1.length());
		System.out.println("마지막 문자: " + s1.charAt(s1.length() - 1));
		
		// 7. concat(): 문자열을 연결하여 새로운 문자열을 생성
		// 문자열의 연결: +
		// String s2 = s1.concat(" Korea");
		String s2 = s1 + " Korea";
		System.out.println("s2: " + s2);
		
		// 8. contains(): 문자열에 특정문자가 포함되었는지의 여부
		System.out.println(s1.contains("J"));
		System.out.println(s1.contains("Java"));
		System.out.println(s1.contains("java"));
		
		System.out.println(s2.contains("Korea"));
		System.out.println(s2.contains("korea"));
	}
}
