import java.util.Scanner;

public class Switch02 {
	public static void main(String[] args) {
		// 문제) 월을 입력하여 계절을 판별하시오.
		// 1~12를 벗어나는 값을 입력했을 때는 '잘못된 월을 입력하였습니다.'라는 메시지를 출력하시오.
		// 판별식은 switch ~ case문을 사용하시오.
		// 3,4,5: 봄, 6:7,8: 여름, 9,10,11: 가을, 12,1,2: 겨울
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요. 계절을 판별합니다.(1~12): ");
		int month = sc.nextInt();
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "월은 가을입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println(month + "월은 겨울입니다.");
			break;
		default:
			System.out.println("잘못된 월은 입력하였습니다.");
			break;
		}
		
		
		sc.close();
	}

}
