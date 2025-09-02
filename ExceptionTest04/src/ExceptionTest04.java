
/*
문제) 
1. scores 배열을 사용하여 학생들의 총점과 평균을 구하시오.
2. 예외가 발생할 때, 예외를 밝히고, 예외를 제외하고 정상적으로 종료되도록 하시오.
3. 총점과 평균을 구할 수 있도록 하시오.
*/
public class ExceptionTest04 {
	
	// 정수인지를 판별하는 메서드
	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch(NumberFormatException e) {
			System.err.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] scores = {"95", "87", "55.5", "66", "77", "83"};
		int tot = 0;
		double avg = 0.0;
		int cnt = 0;
		
		// java.lang.NumberFormatException: For input string: "55.5"

		for(int i=0; i<scores.length; i++) {
			// 문자열의 값이 정수일때만 더함.
			if(isInteger(scores[i])) {
				tot += Integer.parseInt(scores[i]);
				++cnt;
			}
		}

		avg = (double) tot / cnt;
		System.out.printf("합계: %d, 평균: %.2f\n", tot, avg);
		
		
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
	}

}
