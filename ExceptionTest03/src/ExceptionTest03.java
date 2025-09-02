// 예외 처리 방법 2
public class ExceptionTest03 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int tot = 0;
		
		try {
			for(int i=0; i<=arr.length; i++) { 
				System.out.println("[" + i + "] = " + arr[i]);
				tot += arr[i];
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			// 
			System.out.println("총점: " + tot);
		}
		
		System.out.println("정상적인 종료를 하였습니다...");
	}

}
