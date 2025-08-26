import java.util.StringJoiner;

public class StringJoinerTest01 {
	public static void main(String[] args) {
		String animals = "사자/코끼리/기린/하마/표범/치타";
		
		// 1. 문자열을 배열로 분리
		String[] words = animals.split("/");
		for (String w : words) {
			System.out.println(w);
		}
		
		// 2. 배열을 문자열로 합침
		String str = String.join("-", words);
		System.out.println(str);
		
		// 3. StringJoiner 클래스를 사용하여 배열을 문자열로 합침
		StringJoiner sj1 = new StringJoiner(",");
		for (String w : words) {
			sj1.add(w);
		}
		System.out.println(sj1.toString());
		
		// 4. StringJoiner 클래스를 사용하여 배열을 문자열로 합침
		// - 문자열의 맨 앞과 맨 뒤에 기호를 추가
		StringJoiner sj2 = new StringJoiner(",", "[", "]");
		for (String w : words) {
			sj2.add(w);
		}
		System.out.println(sj2.toString());
		
		
		
	}
}
