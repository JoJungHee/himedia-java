// 예외 처리 방법 1
public class ExceptionTest02 {
	public static void main(String[] args) {
		// 1. java.lang.ArithmeticException: / by zero
		int a = 10, b = 0, c = 0;
		
		try {
			c = a / b; // 예외 발생 지점		
		} catch(ArithmeticException e) {
			// 1. 처리메시지 1번 - 전체 메시지
			//e.printStackTrace();
			// 2. 처리메시지 2번 - 간결한 메시지
			//System.err.println(e.getMessage());
			// 3. 처리메시지 3번 - 직접 작성
			System.err.println("0으로 나눌수는 없습니다.");
			c = 33;
		}
		System.out.println(c);
		
		// 2. java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		
		int[] arr = {10, 20, 30, 40, 50};
		int tot = 0;
		
		try {
			for(int i=0; i<=arr.length; i++) { 
				tot += arr[i]; // 예외 발생 지점
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			// 1번 - 전체 메시지
			//e.printStackTrace();
			// 2번 - 간결한 메시지
			//System.err.println(e.getMessage());
			// 3번 - 직접 작성
			System.err.println("배열의 인덱스 범위를 벗어났습니다.");
		}
		System.out.println("총점: " + tot);
		
		
		System.out.println("정상적인 종료를 하였습니다...");
	}

}
