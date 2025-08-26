import java.util.StringTokenizer;


public class StringTokenizerTest01 {
	public static void main(String[] args) {
		String animals = "dog,cat,tiger,lion,bear,rabbit";
		
		// < 구분자를 사용하여 문자열을 분리 >
		// 1. split() 메서드를 사용
		// - 문자열을 구분자로 분리하여 문자열의 배열을 생성
		String[] words = animals.split(",");
		for (String w : words) {
			System.out.println(w);
		}
		
		// 2. StringTokenizer 클래스 사용
		// - 문자열을 구분자로 분리하여 토큰을 생성함.
		StringTokenizer sb1 = new StringTokenizer(animals, ",");
		System.out.println("토큰의 개수: " + sb1.countTokens());
		
		while (sb1.hasMoreTokens()) {
			System.out.println(sb1.nextToken());
		}
		
		System.out.println("토큰의 개수: " + sb1.countTokens()); // 0 -> 토큰은 사용하면 사라짐.
		System.out.println("-----------");
		
		String animals2 = "dog cat/tiger|lion-bear.rabbit";
		// 1. split() 메서드를 사용 
		String[] words2 = animals2.split("[/| -.]");
		for (String w : words) {
			System.out.println(w);
		}
		
		// 2. StringTokenizer 클래스 사용
		StringTokenizer st2 = new StringTokenizer(animals2, "/| -.");
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		// 3. StringTokenizer 클래스 사용
		// - 구분자를 토큰으로 사용할 수 있음
		StringTokenizer st3 = new StringTokenizer(animals2, "/| -.", true);
		System.out.println("토큰의 개수: " + st3.countTokens());
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		
	}
}
