
// 1. 예외를 고의로 만드는 방법
// 2. 예외를 던지는 방법
public class ExceptionTest05 {
	public static void main(String[] args) {
		try {
			// 예외 생성
			Exception e = new Exception("고의로 예외를 생성함.");
			// 예외 던지기
			throw e;
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
