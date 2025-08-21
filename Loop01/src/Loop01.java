import java.util.Scanner;

public class Loop01 {
	public static void main(String[] args) {
		// 문제) 구구단의 단을 입력하여 해당하는 구구단을 출력하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단의 단을 입력하세요. : ");
		int n = sc.nextInt();
		
		// 1번 - while문
		/*
		int i = 1;
		while(i <= 9) {
			System.out.println(n + " * " + i + " = " + n*i);
			i++;
		}
		*/
				
		// 2번 - do~while문
		int i = 1;
		do {
			System.out.println(n + " * " + i + " = " + n*i);
			i++;
		} while(i <= 9);
		
		
		// 3번 - for문
		/*
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", n, i, n*i);
		}
		*/
		
		sc.close();
	}

}
