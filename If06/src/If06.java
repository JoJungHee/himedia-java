
import java.util.Scanner;

public class If06 {
	public static void main(String[] args) {
		// 문제) 나이를 입력하여 연령대를 판별하시오.
		// 2개의 변수를 사용하시오. age(나이, 정수), ageRange(연령대, 문자열)
		// 유년기: 0~6, 소년기: 7~18, 청년기: 19~29, 중년기: 30~49, 장년기: 50~64, 노년기: 65 이상
		// < 입력화면 설계 > 나이를 입력하세요. 연령대를 판별합니다.: 32
		// < 출력화면 설계 > 32세는 중년기에 해당합니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요. 연령대를 판별합니다.: ");
		int age = sc.nextInt();
		String ageRange;
		
		if(age >= 0 && age <= 6) {
			ageRange = "유년기";
		} else if(age >= 7 && age <= 18) {
			ageRange = "소년기";
		} else if(age >= 19 && age <= 29) {
			ageRange = "청년기";
		} else if(age >= 30 && age <= 49) {
			ageRange = "중년기";
		} else if(age >= 50 && age <= 64) {
			ageRange = "장년기";
		} else {
			ageRange = "노년기";
		}
		
		//System.out.println(age + "세는 " + ageRange + "에 해당합니다.");
		System.out.printf("%d세는 %s에 해당합니다.", age, ageRange);
		
		sc.close();
	}

}
