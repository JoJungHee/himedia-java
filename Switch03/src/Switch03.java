import java.util.Scanner;

public class Switch03 {
	public static void main(String[] args) {
		// 문제) 국어, 영어, 수학 점수를 입력하여 총점, 평균, 학점을 출력하시오.
		// 평균을 계산할 때는 명시적인 캐스팅을 사용하시오.
		// 평균은 소수점 첫째 자리까리 반올림하여 출력하시오.
		// 학점은 평균이 90점 이상일 때 A, 80점 이상일 때 B, 70점 이상일 때 C, 60점 이상일 때 D, 
		// 60점 미만일 때 F로 저장하시오.
		// 학점 계산은 switch ~ case문으로 처리하시오.
		// int: kor, eng, mat, tot, double: avg, char: grd
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력: ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력: ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력: ");
		int mat = sc.nextInt();
		
		// 총점, 평균 계산
		int tot = kor + eng + mat;
		double avg = (double)tot / 3;
		
		// 학점 계산
		char grd = ' ';
		switch((int)(avg/10)) { // 캐스팅: double -> int, 소숫점을 자르기 위해서
		case 10: case 9:
			grd = 'A';
			break;
		case 8:
			grd = 'B';
			break;
		case 7:
			grd = 'C';
			break;
		case 6:
			grd = 'D';
			break;
		default:
			grd = 'F';
			break;
		}
		
		
		// 출력
		System.out.printf("총점: %d\n평균: %.1f\n학점: %c\n", tot, avg, grd);
				
		sc.close();
	}

}
