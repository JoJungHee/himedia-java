import java.util.Scanner;

public class Method07 {
	static Scanner sc = new Scanner(System.in);
	
	// 배열을 생성하는 메서드
	static int[] makeArray(int[] a) {
		System.out.print("배열의 개수 입력: ");
		int n = sc.nextInt();
		
		a = new int[n];
		
		return a;
	}
	
	// 배열의 값을 입력하는 메서드
	static void inputArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%2d번 값 입력: ", i + 1);
			a[i] = sc.nextInt();
		}
	}
	
	// 배열의 값을 출력하는 메서드
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("[%2d] = %2d\n", i+1, a[i]);
		}
	}
	
	public static void main(String[] args) {
		// 문제) 1차원 정수 배열의 개수를 입력하여 배열을 생성하는 부분, 배열의 값을 입력하는 부분, 배열의 값을 출력하는 부분을
		// 각각 메서드로 만들어 처리하는 프로그램을 작성하시오.
		// 참조하고 있지 않다.
		int[] a = null;
		
		
		// 배열 생성
		a = makeArray(a);
		
		
		// 배열 값 입력
		inputArray(a);
		
		
		// 배열 출력
		printArray(a);
		
		sc.close();
	}
}
