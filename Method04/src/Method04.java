import java.util.Scanner;

public class Method04 {
	static int calcMax(int a, int b, int c) {
//		int[] arr = {a, b, c};
//		int max = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (max < arr[i]) {
//				max = arr[i];
//			}
//		}
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		
		return max;
	}
	
	static int calcMin(int a, int b, int c) {
//		int[] arr = {a, b, c};
//		int min = arr[0];
//		
//		for (int i = 0; i < arr.length; i++) {
//			if (min > arr[i]) {
//				min = arr[i];
//			}
//		}
		
		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		// 문제) 정수 a, b, c 3개를 입력하여 최대값과 최소값을 구하는 프로그램을 작성하시오.
		// 메서드명) calcMax(), calcMin()
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 a 입력: ");
		int a = sc.nextInt();
		System.out.print("정수 b 입력: ");
		int b = sc.nextInt();
		System.out.print("정수 c 입력: ");
		int c = sc.nextInt();
		
		int max = calcMax(a, b, c);
		int min = calcMin(a, b, c);
		
		
		System.out.printf("a: %2d, b: %2d, c: %2d\n최소값: %2d\n최대값: %2d", a, b, c, min, max);
		sc.close();
	}
}
