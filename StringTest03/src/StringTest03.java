import java.util.Scanner;

public class StringTest03 {
	public static void main(String[] args) {
		// 문자열을 만드는 방법 3 - new를 통해 인스턴스를 만드는 것과 같음
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("문자열 1번 입력: ");
		String s1 = sc.next();
		
		System.out.print("문자열 2번 입력: ");
		String s2 = sc.next();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("-----");
		
		
		// 1. 값에 대한 비교
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		// 2. 참조에 대한 비교
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println("-----");
		
		
		// 1. 2개의 문자열을 비교하는 방법
		// ==: 참초를 비교, 같은 곳을 참조하는지를 비교
		if (s1 == s2) {
			System.out.println("두 문자열은 참조가 같습니다.");
		} else {
			System.out.println("두 문자열은 참조가 다릅니다.");
		}
		
		// 2. 2개의 문자열을 비교하는 방법
		// equals(): 값에 대한 비교, 문자열의 값이 같은지를 비교
		if (s1.equals(s2)) {
			System.out.println("두 문자열은 값이 같습니다.");
		} else {
			System.out.println("두 문자열은 값이 다릅니다.");
		}
		
		// 3. 2개의 문자열을 비교하는 방법
		// equalsIgnoreCase(): 문자열을 대소문자 구분없이 같은지를 비교
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("두 문자열은 대소문자 구분없이 값이 같습니다.");
		} else {
			System.out.println("두 문자열은 대소문자 구분없이 값이 다릅니다.");
		}
		
		
		sc.close();
	}
}
