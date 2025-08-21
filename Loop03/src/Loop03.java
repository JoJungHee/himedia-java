
public class Loop03 {
	public static void main(String[] args) {
		// 문제) 구구단 2단부터 9단까지를 가로로 출력하시오.
		// 각 단의 첫 줄에 해당하는 단을 출력하시오.
		
		// 1번 - for문
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.printf("%d * %d = %2d   ", j, i, j*i);
			}
			System.out.println();
 		}
 		
		
		// 2번 - while문
		/*
		int i = 1, j = 2; 
		while(i <= 9) {
			j = 2;
			while(j <= 9) {
				System.out.printf("%d * %d = %2d   ", j, i, j*i);
				j++;
			}
			i++;
			System.out.println();
		}
		*/
		
		// 3번 - do~while문
		/*
		int i = 1, j = 2;
		do {
			j = 2;
			do {
				System.out.printf("%d * %d = %2d   ", j, i, j*i);
				j++;
			} while(j <= 9);
			i++;
			System.out.println();
		} while(i <= 9);
		*/
		
	}

}
