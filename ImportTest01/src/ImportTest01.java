//import java.util.Scanner;

public class ImportTest01 {
	public static void main(String[] args) {
		// 클래스 사용 1번방법 - 단순 수식명(Simple Name, SN)
//		Scanner sc = new Scanner(System.in);
		
		// 2번방법 - 완전 수식명(Full Qualified Name, FQN)
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		
		
		System.out.print("국어 점수 입력: ");
		int kor = sc.nextInt();
		
		System.out.println("당신의 국어 점수는 " + kor + "입니다.");
		sc.close();
	}
}
