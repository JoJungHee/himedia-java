
public class Printf01 {
	public static void main(String[] args) {
		int a = 34567, b = 12345;
		double x = 3.141592, y = 4.7;
		
		// 1. 정수: %d, decimal, 10진 정수 
		System.out.printf("%d\n", a);
		System.out.printf("%d %d\n", a, b);
		System.out.printf("a=%d, x=%f\n", a, x);
		
		System.out.printf("%7d\n", a);   // 오른쪽 맞춤
		System.out.printf("%-7d확인\n", a); // 왼쪽 맞춤
		System.out.printf("%4d\n", a);
		System.out.println("-----");
		
		// 2. 실수: %f, float
		// - 실수에서 소수점 이하 출력값을 제어할 때 주로 사용
		System.out.printf("%f\n", x);
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);  // 3.1416, 소수점 4자리에서 반올림
		System.out.printf("%f\n", y);    // 4.700000, 소수점 6자리까지 출력
		System.out.printf("%6.2f\n", x); // %전체자리수.소수점이하자리수, 소수점도 1자리를 차지
		System.out.printf("%-6.2f확인\n", x);
		
		// 3. 문자: %c, character
		// 
		char c = 'A', d = 'a';
		System.out.printf("%c\n", c);
		System.out.printf("%5c\n", c);     // 오른쪽 맞춤
		System.out.printf("%-5c확인\n", c); // 왼쪽 맞춤
		System.out.printf("%c, %c\n", c, d);
		
		// 4. 문자열: %s, String
		String s = "JAVA";
		System.out.printf("%s\n", s);
		System.out.printf("%6s\n", s);
		System.out.printf("%-6s확인\n", s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
