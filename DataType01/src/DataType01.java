
public class DataType01 {
	public static void main(String[] args) {
		// 아스키 코드: A:65, a:97
		// 설명: 메모리에 정수를 저장할 수 있는 4Byte의 공간을 마련하여 a라는 이름을 붙여놓고, a라는 공간에 10이라는 정수값을 넣은 것
		int a = 10;      // 정수 변수 선언, 초기화(변수에 최초로 값을 넣는 것)
		double b = 3.14; // 실수 변수 선언, 초기화
		char c = 'A' + 1;
		boolean d = true;
		
		//byte e = 128; // 오버플로우(overflow) 발생
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}

}
