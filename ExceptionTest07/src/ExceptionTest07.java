
// < 예외 되던지기 >
// 해결책: 예외가 발생한 메서드의 해결 방법과 흐름을 파악할 수 있음.
public class ExceptionTest07 {
	public static void main(String[] args){
		try {
			method1();
		} catch(Exception e) {
			System.out.println("main에서 예외를 처리함...");
		}
	}
	
	public static void method1() throws Exception {
		try {
			method2();
		} catch(Exception e) {
			System.out.println("method1에서 예외를 처리함...");
			// 예외처리 후에 다시 예외를 던짐
			throw e;
		}
	}
	
	// 예외가 발생한 메서드
	public static void method2() throws Exception {
		try {
			throw new Exception("method2에서 예외 발생");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("method2에서 예외를 처리함...");
			// 예외처리 후에 발생한 예외를 다시 던짐
			throw e;
		}
	}

}
