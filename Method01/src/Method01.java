import java.util.Scanner;

public class Method01 {
	static int add(int a, int b) {
		int c = a + b;
		return c;
	}
	
	
	public static void main(String[] args) {
		// 문제) 2개의 정수를 입력하여 더하는 프로그램을 작성하시오.
		// 메서드명: add()
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a 입력: ");
		int a = sc.nextInt();
		System.out.print("정수 b 입력: ");
		int b = sc.nextInt();
		
		int result = add(a, b);
		
		System.out.println("결과 : " + result);
		
		sc.close();
	}
}
