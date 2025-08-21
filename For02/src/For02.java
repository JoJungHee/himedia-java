import java.util.Scanner;

public class For02 {
	public static void main(String[] args) {
		// 문제) 정수를 입력하여 1부터 입력한 수 사이에서 홀수와 짝수의 합계를 각각 출력하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("범위를 입력하세요. 홀수와 짝수의 합계를 구합니다.: ");
		int n = sc.nextInt();
		int oddSum = 0, evenSum = 0;
		
		for(int i=1; i<=n; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		
		// 1 3 5 7 9
		// 2 4 6 8 10
		System.out.println("홀수의 합: " + oddSum);
		System.out.println("짝수의 합: " + evenSum);
		
		sc.close();
	}

}
