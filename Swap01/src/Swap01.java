import java.util.Scanner;
public class Swap01 {
	public static void main(String[] args) {
		// 문제1) a와 b의 값을 바꾸어 저장하시오.
		/*
		int a = 10, b = 20;
		int t;
		
		System.out.printf("스왑 전: a = %d, b = %d\n", a, b);
		
		t = a;
		a = b;
		b = t;
		
		System.out.printf("스왑 후: a = %d, b = %d", a, b);
		*/
		
		// 문제2) 정수 a와 b의 값을 입력하고, a에는 항상 작은 값이 저장되고, b에는 항상 큰 값이 저장되도록 하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("어떤 값을 입력하든지 a는 항상 작은 값, b는 항상 큰 값이 저장됩니다.");
		
		System.out.print("정수 a 입력: ");
		int a = sc.nextInt();
		
		System.out.print("정수 b 입력: ");
		int b = sc.nextInt();
		
		int t;
		
		System.out.printf("스왑 전 : a = %d, b = %d\n", a, b);
		
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		System.out.printf("스왑 후 : a = %d, b = %d", a, b);
		
		sc.close();
		
	}
}
