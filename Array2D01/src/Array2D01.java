
public class Array2D01 {
	public static void main(String[] args) {
		// 1. 2차원 배열의 선언하고, 바로 생성
		//int[][] a = new int[3][4];
		
		// 2. 2차원 배열의 선언과 생성을 분리
		int[][] a;         // int형의 2차원 배열의 참조변수
		a = new int[3][];  // 행의 개수
		a[0] = new int[4]; // 0번 행의 열의 개수
		a[1] = new int[4]; // 1번 행의 열의 개수
		a[2] = new int[4]; // 2번 행의 열의 개수		
		
		
		System.out.println(a[0][0]);
		System.out.println(a[2][3]);
		//System.out.println(a[3][4]); // java.lang.ArrayIndexOutOfBoundsException 예외

		System.out.println("행의 개수: " + a.length);            // 3 -> 행의 개수
		System.out.println("0번 행의 열의 개수: " + a[0].length);  // 0번 행의 열의 개수(기수), 첫번째 행의 열의 개수(서수)
		System.out.println("1번 행의 열의 개수: " + a[1].length);  // 1번 행의 열의 개수, 두번째 행의 열의 개수
		System.out.println("2번 행의 열의 개수: " + a[2].length);  // 2번 행의 열의 개수, 세번째 행의 열의 개수
		System.out.println("-----");
		
		// a.length: 행의 개수
		// a[i].length: 각 행에 대한 열의 개수
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
