
public class Suffix01 {
	public static void main(String[] args) {
		// 접미사(suffix) - 변수나 값뒤에 붙여주는 기호
		// 1. 실수형 접미사 F(f)
		// - 실수 상수 뒤에 써줌 -> 자바에서는 실수 상수를 float형으로 간주함.
		// - 자바에서는 기본적으로 실수 상수를 double형으로 파악함.
		double x = 3.14;
		float y = 3.14F; // 접미사 F
		
		// 2. 정수형 접미사 L(l)
		// - 정수 상수 중에서 21억을 넘수 수일 때 상수 뒤에 L을 써줌 -> long형으로 간주함.
		// - 자바에서는 기본적으로 정수 상수를 int형으로 파악함.
		int a = 2100000000; // 21억
		//int b = 2200000000; // 22억, overflow 발생
		long c = 10000000000L; // 100억, 
		
		
		
	}

}
