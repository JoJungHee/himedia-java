import java.util.StringTokenizer;

public class WrapperTest02 {
	public static void main(String[] args) {
		String str = "85,88,72,91,56,73,66,87,68,95";
		int tot = 0;
		double avg = 0.0;
		
		// 문제) 문자열을 ,구분자로 분리하여 scores 배열에 저장한 후, 총점과 평균을 구하시오.
		// 1번 - split() 메서드 사용
		String[] scores = str.split("[,]");
		
		for (String s : scores) {
			tot += Integer.parseInt(s);
		}
		
		avg = (double) tot / scores.length;
		System.out.println("총점: " + tot);
		System.out.println("평균: " + avg);
		System.out.println("-----------");
		
		
		
		// 2번 - StringTokenizer 클래스 사용
		// - 토큰은 사용하면 사라짐
		tot = 0;
		avg = 0.0;
		StringTokenizer st = new StringTokenizer(str, ",");
		
		// 토큰의 갯수
		int count = st.countTokens();
		
		while (st.hasMoreTokens()) {
			tot += Integer.parseInt(st.nextToken());
		}
		avg = (double) tot / count;
		System.out.println("총점: " + tot);
		System.out.println("평균: " + avg);
		
	}
}
