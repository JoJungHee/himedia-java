
public class StringBufferTest02 {
	public static void main(String[] args) {
		// < String 클래스의 비교 >
		String s1 = new String("ABC");
		String s2 = new String("XYZ");
		String s3 = new String("ABC");
		
		// 1. 참조 비교
		System.out.println(s1 == s2);  // false
		System.out.println(s1 == s3);  // false
		System.out.println("--------");
		
		// 2. 값을 비교
		// Object의 equals() 메서드는 참조를 비교
		// ★ 자식 클래스인 String 클래스에서는 Object의 equals() 메서드를 [오버라이딩]하여 값을 비교하도록 정의함
		System.out.println(s1.equals(s2));  // false
		System.out.println(s1.equals(s3));  // true
		System.out.println("--------");
		
		
		
		// < StringBuffer 클래스의 비교 >
		// 1. toString(): StringBuffer를 String형으로 경
		StringBuffer sb1 = new StringBuffer("ABC");
		StringBuffer sb2 = new StringBuffer("XYZ");
		StringBuffer sb3 = new StringBuffer("ABC");
		
		// 1. 참조 비교
		System.out.println(sb1 == sb2);  // false
		System.out.println(sb1 == sb3);  // false
		System.out.println("-----------");
		
		// ★★★★★ 주의: StringBuffer 클래스를 사용할 때의 문제점
		// 2. 참조를 비교
		// Object의 equals() 메서드는 참조를 비교함
		// 자식 클래스인 StringBuffer 클래스는 equals() 메서드를 오버라이딩하지 않음
		// - Object의 equals() 메서드를 사용하고, 값을 비교하는 것이 아니라 참조를 비교하고 있음
		System.out.println(sb1.equals(sb2));  // false
		System.out.println(sb1.equals(sb3));  // false -> 주의
		System.out.println("-----------");
		
		// 3. 2번 문제의 해결책
		// - 문자열로 변경하여 값을 비교
		String x = sb1.toString();
		String y = sb2.toString();
		String z = sb3.toString();
		System.out.println(x.equals(y));  // false
		System.out.println(x.equals(z));  // true
		System.out.println("----------");
		
		System.out.println(sb1.toString().equals(sb2.toString()));
		System.out.println(sb1.toString().equals(sb3.toString()));
	}
}
