
public class StringTest07 {
	public static void main(String[] args) {
		String s1 = "Hello Java World.hwp";
		
		// equals(): 같은 문자열인지의 여부
		// contains(): 포함되는지의 여부
		
		// 9. endsWith(): 문자열이 특정 문자열로 끝나는지의 여부
		System.out.println(s1.endsWith(".hwp"));
		System.out.println(s1.endsWith(".ppt"));
		
		if (s1.endsWith(".hwp")) {
			System.out.println("업로드되었습니다.");
		} else {
			System.out.println("업로드되지 않았습니다.");
			System.out.println("파일형식을 hwp로 저장하여 업로드하세요.");
		}
		
		// 10. startsWith(): 문자열이 특정 문자열로 시작하는지의 여부
		System.out.println(s1.startsWith("Hello"));
		System.out.println(s1.startsWith("hello"));
		
		// 11. indexOf(): 문자열에서 앞에서부터 특정 문자열의 인덱스를 구함
		System.out.println(s1.indexOf("J"));
		System.out.println(s1.indexOf("Java"));
		System.out.println(s1.indexOf("java")); // -1: 해당하는 문자열을 찾지 못함
		System.out.println(s1.charAt(6));
		System.out.println("-----");
		
		// 12. lastIndexOf(): 문자열의 끝에서부터 특정 문자열의 인덱스를 구함
		String s2 = "java.lang.java.pdf";
		System.out.println(s2.indexOf("."));
		System.out.println(s2.lastIndexOf("."));
		System.out.println(s2.lastIndexOf("java"));
	}
}
