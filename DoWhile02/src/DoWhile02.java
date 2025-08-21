import java.util.Scanner;

public class DoWhile02 {
	public static void main(String[] args) {
		// 문제) 정수를 입력하여 1부터 입력한 수 사이에서 5의 배수이고 6의 배수인 수를 출력하고, 개수와 합계를 구하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요.: ");
		int n = sc.nextInt();
		int cnt = 0, tot = 0;
		
		int i = 1;
		do {
			if(i % 5 == 0 && i % 6 == 0) {
				System.out.println(i);
				++cnt;
				tot += i; // tot = tot + i;
			}
			i++;
		} while(i <= n);
		
		System.out.println("5의 배수이고, 6의 배수의 개수: " + cnt);
		System.out.println("5의 배수이고, 6의 배수의 합계: " + tot);
		
		sc.close();		
	}

}
