import java.util.Scanner;

public class If03 {
	public static void main(String[] args) {
		// 문제1) 정수를 입력하여 3의 배수이고 4의 배수인지를 판별하시오.
		// 문제2) 정수를 입력하여 3의 배수인지, 4의 배수인지, 3의 배수이면서 4의 배수인지, 
		// 3의 배수도 4의 배수도 아닌지를 판별하시오.
		// 3의 배수: 3으로 나누었을 때 나머지가 0, 3으로 나누어 떨어진다.
		// 4의 배수: 4로 나누었을 때 나머지가 0, 4로 나누어 떨어진다.
		// 3의 배수이고 4의 배수: 12의 배수, 3으로도 나누어 떨어지고, 4로도 나누어 떨어진다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		// 1번
		/*
		if(n % 3 == 0 && n % 4 == 0) {
			System.out.println(n + "은 3의 배수이고 4의 배수입니다.");
		} else {
			System.out.println(n + "은 3의 배수이고 4의 배수가 아닙니다.");
		}
		*/
		
		// 2번
		if(n % 3 == 0 && n % 4 == 0) {
			System.out.println(n + "은 3의 배수이고, 4의 배수입니다.");
		} else if(n % 3 == 0) {
			System.out.println(n + "은 3의 배수입니다.");
		} else if(n % 4 == 0) {
			System.out.println(n + "은 4의 배수입니다.");
		} else {
			System.out.println(n + "은 3의 배수도 4의 배수도 아닙니다.");
		}
		
		
		sc.close();
	}

}
