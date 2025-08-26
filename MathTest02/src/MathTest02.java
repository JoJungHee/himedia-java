
public class MathTest02 {
	public static void main(String[] args) {
		double x = 34567.56789;
		
		// < 반올림 활용 >
		// - 같은 방법으로 ceil(), floor() 메서드에서도 활용 가능
		System.out.println(Math.round(x)); // 34568, 정수를 반올림
		
		
		double n1 = Math.round(x * 10) / 10.0;  // 소수 첫째자리로 반올림
		System.out.println(n1);
		
		double n2 = Math.round(x * 100) / 100.0;  // 소수 둘째자리로 반올림
		System.out.println(n2);
		
		double n3 = Math.round(x * 1000) / 1000.0;  // 소수 셋째자리로 반올림
		System.out.println(n3);
		
		double n4 = Math.round(x * 0.1) / 0.1;	// 345670.0 십의 자리로 반올림
		System.out.println(n4);
		
		double n5 = Math.round(x * 0.01) / 0.01;  // 34600.0 백의 자리로 반올림
		System.out.println(n5);
	}
}
