
public class Array2D03 {
	public static void main(String[] args) {
		// 문제) 
		// 1. 학생에 대한 국어, 영어, 수학 점수를 저장한 scores 2차원 배열을 사용하여 각 학생에 대한 총점과 평균을 구하시오.
		// 2. scores의 4번째 열에 총점을 저장하시오.
		// 3. scores의 각 학생에 대한 평균을 avgs 배열에 저장하시오.
		// 4. scores의 각 학생에 대한 학점을 grds 배열에 저장하시오.
		// 학점은 평균이 90이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D, 60미만이면 F로 저장하시오.
		// 5. scores의 각 학생에 대한 석차를 ranks 배열에 저장하시오.
		
		// 학생에 대한 국어, 영어, 수학, 총점을 저장
		int[][] scores = {
				{92, 93, 93, 0}, // 00+01+02 -> 03
				{85, 85, 86, 0}, // 10+11+12 -> 13
				{71, 71, 72, 0}, // 20+21+22 -> 23
				{68, 68, 67, 0}, // 30+31+32 -> 33
				{83, 83, 82, 0}, // 40+41+42 -> 43
		};
		// 학생에 대한 평균 저장
		double[] avgs = new double[scores.length];
		// 학생에 대한 학점 저장
		char[] grds = new char[scores.length];
		// 학생에 대한 석차 저장
		int[] ranks = new int[scores.length];
		
		// 타이틀 배열
		String[] titles = {"KOR", "ENG", "MAT", "TOT", "AVG", "GRD", "RANK"};
		
		// 총점, 평균 계산 - 1번 방법
		/*
		for(int i=0; i<scores.length; i++) {
			scores[i][3] = scores[i][0] + scores[i][1] + scores[i][2];
			avgs[i] = (double)scores[i][3] / 3;
			// 학점
			
		}
		*/
		
		// 총점, 평균 계산 - 2번 방법 -> 과목이 많아지게 되면 훨씬 더 효율적인 방법이 됨.
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<3; j++) {
				scores[i][3] += scores[i][j];
			}
			avgs[i] = (double)scores[i][3] / 3;
			
			// 학점
			switch ((int)(avgs[i] / 10)) {
			case 10:
			case 9:
				grds[i] = 'A';
				break;
			case 8:
				grds[i] = 'B';
				break;
			case 7:
				grds[i] = 'C';
				break;
			case 6:
				grds[i] = 'D';
				break;
			default:
				grds[i] = 'F';
				break;
			}
		}
		
		
		// 석차 - 총점으로 석차 계산
		// 모든 학생의 석차를 1로 초기화
		for (int i = 0; i < ranks.length; i++) {
			ranks[i] = 1;
		}
		
		// i: 나, j: 나를 포함한 다른 학생
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores.length; j++) {
				if(scores[i][3] < scores[j][3]) {
					++ranks[i];
				}
			}
		}
		
		/*
		for (int i = 0; i < avgs.length; i++) {
			int rank = 1;
			for (int j = 0; j < avgs.length; j++) {
				if (avgs[i] < avgs[j]) {
					++rank;
				}
			}
			ranks[i] = rank;
		}
		*/
		
		// 타이틀 출력
		System.out.printf("%3s | %3s | %3s | %3s | %3s | %5s | %2s | %4s |", "NO", titles[0], titles[1], titles[2], titles[3], titles[4], titles[5], titles[6]);
		System.out.println("\n--------------------------------------------------");
		
		// 출력
		
		for(int i=0; i<scores.length; i++) {
			System.out.printf("%3d | ", i + 1);
			for(int j=0; j<scores[i].length; j++) {
				System.out.printf("%3d | ", scores[i][j]);
			}
			System.out.printf("%.2f | %3c | %4d | \n", avgs[i], grds[i], ranks[i]);
		}
		

		// end
	}

}
