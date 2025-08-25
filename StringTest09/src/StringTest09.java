import java.util.Arrays;

public class StringTest09 {
	public static void main(String[] args) {
		// 17. split(구분자): 문자열을 구분자(seperator)로 분리하여 문자열의 배열로 만듦
		// - split(구분자, 분리할 문자열 개수): 문자열을 구분자로 개수만큼 분리하여 문자열의 배열로 만듦
		// - split(정규식을 사용한 구분자): 정규식을 구분자로 사용하여 문자열의 배열로 만듦
		// - 정규식을 사용할 수 있음
		String animals = "사자,표범,치타,기린,코끼리,하이에나,하마,코뿔소,누,얼룩말";
		String[] words = animals.split(",");
		
		for (String w : words) {
			System.out.println(w);
		}
		System.out.println("단어 개수: " + words.length);
		
		// 배열 확인
		System.out.println(Arrays.toString(words));
		System.out.println("-----");
		
		
		// 5개의 문자열을 배열로 저장
		String[] words2 = animals.split(",", 5);
		System.out.println(Arrays.toString(words2));
		
		// 기본 for문
		for (int i = 0; i < words2.length; i++) {
			System.out.printf("words2[%d] = %s\n", i, words2[i]);
		}
		
		// 문제) 아래의 문자열을 단어로 분리하여 문자열의 배열로 저장하고, 확인하시오.
		// 구분지: / | . 공백 * &
		String str1 = "twins/eagles|landers.giants wids*dinos,lions tigers bears&heros";
		// 방법 1
		// String str2 = str1.replace("/", ",").replace("|", ",").replace(".", ",").replace("*", ",").replace("&", ",").replace(" ", ",");

		// 방법 2
		String str2 = str1.replaceAll("[/|. *&]", ",");
		System.out.println(str2);
		String[] str3 = str2.split(",");
		for (int i = 0; i < str3.length; i++) {
			System.out.printf("[%d] = %s\n", i+1, str3[i]);
		}
		System.out.println("------");
		
		// 방법 3
		String str4 = "twins/eagles|landers.giants wids*dinos,lions tigers bears&heros";
		String[] base3 = str4.split("[/|. *&,]");
		for (int i = 0; i < base3.length; i++) {
			System.out.printf("[%d] = %s\n", i+1, base3[i]);
		}
		System.out.println("------");
		
		// 18. String.join("연결기호", 문자열의 배열): 배열의 각 요소를 연결 기호로 연결한 하나의 문자열로 만듦
		// - split()의 반대기능
		String baseball = String.join("-", base3);
		System.out.println(baseball);
		
	}
}
