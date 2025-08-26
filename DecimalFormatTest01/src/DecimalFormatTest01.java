import java.text.DecimalFormat;

public class DecimalFormatTest01 {
	public static void main(String[] args) {
		double n = 1234567.789;
		
		/*
		< 숫자의 형식 >
		- ,: 천단위 구분 기호
		- #: 의미없는 0은 생략함
		- 0: 의미없는 0도 표현함
		- E: 지수승, 정수1자리 * 10의 몇승, 아주 큰 수를 보기좋게 표현할 때 사용
		*/
		
		// 숫자 형식을 DecimalFormat 클래스의 생성자에 지정
		DecimalFormat df1 = new DecimalFormat("###,###,###.####");
		DecimalFormat df2 = new DecimalFormat("000,000,000.0000");
		DecimalFormat df3 = new DecimalFormat("#,###.####");  // 실수 표현할 때 많이 사용하는 방식
		DecimalFormat df4 = new DecimalFormat("0,000.0000");  // 실수 표현할 때 많이 사용하는 방식
		DecimalFormat df5 = new DecimalFormat("#.#E0");    // 지수승 1.2E6, 1.2 * 10의 6승
		DecimalFormat df6 = new DecimalFormat("#.###E0");  // 지수승 1.235E6, 1.235 * 10의 6승
		DecimalFormat df7 = new DecimalFormat("0.000E0");  // 지수승 1.235E6, 1.235 * 10의 6승
		DecimalFormat df8 = new DecimalFormat("0E0");	   // 지수승 1.E6, 1 * 10의 승
		
		
		// 출력
		System.out.println(df1.format(n));
		System.out.println(df2.format(n));
		System.out.println(df3.format(n));
		System.out.println(df4.format(n));
		System.out.println(df5.format(n));
		System.out.println(df6.format(n));
		System.out.println(df7.format(n));
		System.out.println(df8.format(n));
	}
}
