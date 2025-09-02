
// < 예외 발생의 사례 >
// 예외의 문제점: 예외가 발생하면 예외가 발생한 지점에서 중단이 됨.
// 해결책: 예외가 발생했을 때 다음 처리를 할 수 있도록 예외 처리를 해야 함.
public class ExceptionTest01 {
	public static void main(String[] args) {
		// 1. java.lang.ArithmeticException: / by zero
		int a = 10, b = 0, c;
		c = a / b; 
		System.out.println(c);
		
		// 2. java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		int[] arr = {10, 20, 30, 40, 50};
		int tot = 0;
		
		for(int i=0; i<=arr.length; i++) {
			tot += arr[i];
		}
		System.out.println("총점: " + tot);
		
	}

}
