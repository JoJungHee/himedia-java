
/*
< 메서드에 사용에서 예외 발생과 예외 던지기 >
1. 예외가 발생한 메서드에서 예외 처리 -> 권장하는 방법
2. 메서드를 호출한 곳으로 예외를 던지기

< 예외 처리의 원칙 >
- 원칙1: 예외가 발생한 메서드에서 예외를 처리함.
- 원칙2: 메서드를 호출한 곳으로 예외를 던져서 처리함.
- 변형: 여러 개의 메서드에서 같은 예외가 발생하고, 
- 예외 처리를 하나의 메서드에서 하나의 방법으로 처리하고자할 때는 여러 번 예외를 던질 수도 있음.
*/

// < 예외 던지기 >
// 개선할 점: main에서는 어느 메서드에서 예외가 발생하고, 처리되었는지 확인할 수가 없음.
public class ExceptionTest06 {
	public static void main(String[] args) throws Exception {
		method1();
		
		// 3번 방법
		/*
		try {
			method1();
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
		*/
	}
	
	public static void method1() throws Exception {
		method2();
		
		// 2번 방법
		/*
		try {
			method2();
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
		*/
	}
	
	// 예외가 발생한 메서드
	public static void method2() throws Exception {
		throw new Exception("method2에서 예외 발생");
		
		// 1번 방법
		/*
		try {
			throw new Exception("method2에서 예외 발생");
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
		*/
	}

}
