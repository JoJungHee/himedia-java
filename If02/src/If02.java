import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		// 문제) 정수를 입력하여 홀수인지, 짝수인지를 판별하시오.
		// if문의 활용, %연산자의 활용
		// 짝수: 2로 나누었을 때 나머지가 0, 2로 나누어 떨어진다.
		// 홀수: 2로 나누었을 때 나머지가 1, 2로 나누어 떨어지지 않는다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		if(n % 2 == 1) {
			System.out.println(n + "은 홀수입니다.");
		} else {
			System.out.println(n + "은 짝수입니다.");
		}
		
		sc.close();
	}

}
