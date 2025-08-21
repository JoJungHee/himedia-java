
// 중첩 반복문, 2중 반복문
public class Loop02 {
	public static void main(String[] args) {
		// 구구단 전체 출력
		// 1번 - for문
		/*
		for(int i=2; i<=9; i++) {
			System.out.printf("*** %d단 ***\n", i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		*/
		
		// 2번 - while문
		/*
		int i = 2, j = 1;
		while(i <= 9) {
			System.out.printf("*** %d단 ***\n", i);
			j = 1;
			while(j <= 9) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
				j++;
			}
			i++;
			System.out.println();
		}
		*/
		
		// 3번 - do~while문
		int i = 2, j = 1;
		do {
			System.out.printf("*** %d단 ***\n", i);
			j = 1;
			do {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
				j++;
			} while(j<=9);
			i++;
			System.out.println();
		} while(i<=9);
		
	}

}
