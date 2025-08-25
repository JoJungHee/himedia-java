
public class StringTest08 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";
		
		// < 문자열을 변경하는 메서드 >
		// 13. replace(이전 문자열, 바꿀 문자열): 이전 문자열을 바꿀 문자열로 변경
		// - 일치하는 모든 문자열을 변경
		// - 정규 표현식을 사용할 수 없음
		s1 = s1.replace("!", "?");
		System.out.println(s1);
		
		String s2 = "Hello Java Hello Java Hello Java";
		s2 = s2.replace("Java", "Oracle");
		System.out.println(s2);   // Hello Oracle Hello Oracle Hello Oracle
		
		// 14. replaceFirst(이전 문자열, 바꿀 문자열): 이전 문자열을 바꿀 문자열로 첫번째 문자열만 변경
		s2 = "Hello Java Hello Java Hello Java";
		s2 = s2.replaceFirst("Java", "Oracle");
		System.out.println(s2);   // Hello Oracle Hello Java Hello Java
		
		// 15. replaceAll(이전 문자열, 바꿀 문자열): 이전 문자열을 바꿀 문자열로 변경
		// - 일치하는 모든 문자열을 변경
		// - 정규 표현식을 사용할 수 있음
		s2 = "Hello Java Hello Java Hello Java";
		s2 = s2.replaceAll("Java", "Oracle");
		System.out.println(s2);   // Hello Oracle Hello Oracle Hello Oracle
		
		/*
		< 정규 표현식 >
		- 정규식: Regular Expression
		- 문자열을 변경, 조회, 삭제할 때 적용되는 특별한 규칙을 만드는 수식
		
		ex)
		[0-9] -> 숫자
		[a-zA-Z] -> 영어
		[가-힣] -> 한글
		d{6} -> 숫자 6개
		d{3, 4} -> 숫자가 3개 또는 4개
		w+ -> 문자 여러개
		
		
		\\d{6}\\-[1-4]\\d{6} -> 주민등록번호 
		\\{2,3}-\\d{3,4}-\\d{4} -> 전화번호
		\\w+@\\w+\\.\\w+(\\.\\w+)? -> 이메일
		*/
		
		// 1) 모든 숫자를 특정 기호로 변경하는 방법
		String str1 = "ai 기능을 탑재한 갤럭시 Z폴드 7 가격은 2,537,700원 입니다.";
		String str2 = str1.replaceAll("[0-9]", "#");
		System.out.println(str2);
		
		// 2) 첫번째 숫자 1개를 특정 기호로 변경
		String str3 = str1.replaceFirst("[0-9]", "@");
		System.out.println(str3);
		
		// [ 특정 패턴을 특정 기호로 변경 ]
		// 3) 주민등록번호를 특정 기호로 변경
		String str4 = "성남에 사는 25세 고윤정씨의 주민등록번호는 001212-4121314이다.";
		String str5 = str4.replaceAll("\\d{6}\\-[1-4]\\d{6}", "******-*******");
		System.out.println(str5);
		
		// 4) 전화번호를 특정 기호로 변경
		String str6 = "성남에 사는 25세 고윤정씨의 전화번호는 010-1234-5678이다.";
		String str7 = str6.replaceAll("01(?:0|1|[6-9])-\\d{3,4}-\\d{4}", "###-#####-####");
		System.out.println(str7);
		
		// 5) 이메일을 특정 기호로 변경
		String str8 = "성남에 사는 25세 고윤정씨의 이메일은 kyj1004@naver.com 이다.";
		String str9 = str8.replaceAll("\\w+@\\w+\\.\\w+(\\.\\w+)?", "***@***.***");
		System.out.println(str9);
		
		// 16. matches(정규식): 문자열이 정규식과 일치하는지의 여부
		String e1 = "aaa@naver.com";		// 올바른 형식
		String e2 = "aaa@korea.co.kr";		// 올바른 형식
		String e3 = "daum.net";  			// 잘못된 형식
		String e4 = "aaa@korea.co.kr.pe";	// 잘못된 형식
		
		System.out.println(e1.matches("\\w+@\\w+\\.\\w+(\\.\\w+)"));
		System.out.println(e2.matches("\\w+@\\w+\\.\\w+(\\.\\w+)"));
		System.out.println(e3.matches("\\w+@\\w+\\.\\w+(\\.\\w+)"));
		System.out.println(e4.matches("\\w+@\\w+\\.\\w+(\\.\\w+)"));
		
		
	}
}
