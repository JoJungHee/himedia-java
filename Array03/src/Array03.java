
public class Array03 {
	public static void main(String[] args) {
		// 문제) 모든 학생들의 성적을 인덱스와 함께 출력하고, 총점과 평균을 구하시오.
		// 평균을 소수점 둘째자리까지 반올림하여 출력하시오.
		// 학생들의 점수 중에서 최고점수와 최저점수를 구하시오.
		int[] scores = new int[] {85, 93, 71, 63, 82, 67, 52};
		int tot = 0;
		double avg = 0.0;
		int maxScore = scores[0], minScore = scores[0];
		
		for(int i=0; i<scores.length; i++) {
			System.out.printf("%d번 학생 점수: %d\n", i+1, scores[i]);
			tot += scores[i];
			
			// 최고점수
			if(scores[i] > maxScore) {
				maxScore = scores[i];
			}
			// 최소점수
			if(scores[i] < minScore) {
				minScore = scores[i];
			}
		}
		
		avg = (double)tot / scores.length;
		System.out.printf("총점: %d\n평균: %.2f\n", tot, avg);
		System.out.printf("최고점수: %d\n최저점수: %d\n", maxScore, minScore);
		
	}

}
