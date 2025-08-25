
public class StringTest10 {
	public static void main(String[] args) {
		// 19. substring(시작 인덱스, 끝 인덱스): 시작 인덱스부터 끝 인덱스 앞까지를 추출함(끝 인덱스는 포함하지 않음)
		// substring(시작 인덱스): 시작 인덱스부터 문자열의 끝까지를 추출함
		String s1 = "Hello Java World!";
		
		String s2 = s1.substring(6, 10); // 6번부터 10번 앞까지 추출
		System.out.println(s2);
		
		String s3 = s1.substring(11, 16); // 11번부터 16번 앞까지 추출
		System.out.println(s3);
		
		String s4 = s1.substring(11); // 11번부터 끝까지 추출
		System.out.println(s4);
		
		// 20. string.format("포맷 형식 ... ", 변수명 ...): 포맷 형식에 맞는 문자열을 생성
		String s5 = String.format("총점: %04d, 평균: %6.2f\n", 275, 91.6666666666);
		System.out.println(s5);
		
		// 21. toLowerCase(): 문자열의 모든 문자를 소문자로 변경 
		String str1 = "Hellow Java World!";
		str1 = str1.toLowerCase();
		System.out.println(str1);
		
		// 22. toUpperCase(): 문자열의 모든 문자를 대문자로 변경
		String str2 = "Hello Java World!";
		str2 = str2.toUpperCase();
		System.out.println(str2);
		
		// 23. trim(): 문자열에서 앞 뒤의 공백을 없앰
		String str3 = "                      Hello           Java       ";
		System.out.println(str3.trim() + "@");
		
		// 24. isEmpty(): 문자열이 비었는지의 여부를 알려줌 (문자열의 길이가 0인지의 여부)
		// - 공백도 1문자로 판단
		String a1;
		String a2 = null;
		String a3 = "";
		String a4 = "java";
		String a5 = " ";
		
//		System.out.println(a1.isEmpty());  // 에러: 초기화되지 않은 문자열을 사용할 수 없음
//		System.out.println(a2.isEmpty());  // 에러: java.lang.NullPointerException
		System.out.println(a3.isEmpty());
		System.out.println(a4.isEmpty());
		System.out.println(a5.isEmpty());
		System.out.println("-----");
		
		// 25. isBlank(): 문자열이 비었는지의 여부를 알려줌
		// - 공백을 무시하고 판단
		String b1;
		String b2 = null;
		String b3 = "";
		String b4 = "java";
		String b5 = " ";
		String b6 = "     ";
		String b7 = "		";
		
//		System.out.println(b1.isBlank());
//		System.out.println(b2.isBlank());
		System.out.println(b3.isBlank());
		System.out.println(b4.isBlank());
		System.out.println(b5.isBlank());
		System.out.println(b6.isBlank());
		System.out.println(b7.isBlank());
		System.out.println("------");
		// 26. compareTo(): 두 개의 문자열의 내용에 대한 비교를 하여 차이 만큼의 정수를 리턴
		// - 0: 같음
		// 양수: 인스턴스로 사용하는 문자열이 매개변수보다 더 뒤에 있을 때
		// 음수: 인스턴스로 사용하는 문자열의 매개변수보다 더 앞에 있을 때 
		// - equals(): 두 개의 문자열의 값이 같은지의 여부 (true, false)
		
		s1 = "ABC";
		s2 = "XYZ";
		s3 = "ABC";
		s4 = "DEF";
		
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s3.compareTo(s4));
		System.out.println(s4.compareTo(s3));
	}
}
