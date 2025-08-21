import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		// 문제) 1부터 입력한 정수 사이에서 3의 배수를 출력하고, 개수와 합계를 구하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요.: ");
		int n = sc.nextInt();
		int cnt = 0, tot = 0;
		
		int i = 1;
		while(i <= n) {
			if(i % 3 == 0) {
				System.out.println(i);
				++cnt;
				tot += i; // tot = tot + i;
			}
			i++;
		}
		
		System.out.printf("3의 배수의 개수: %d\n", cnt);
		System.out.printf("3의 배수의 합계: %d\n", tot);
		
		sc.close();
	}

}
