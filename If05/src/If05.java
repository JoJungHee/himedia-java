import java.util.Scanner;

public class If05 {
	public static void main(String[] args) {
		// 월을 입력하여 계절을 판별하시오.
		// 1~12까지의 정수를 입력하고, 범위를 벗어나면 '잘못 입력하셨습니다.'를 출력하시오.
		// 3,4,5: 봄, 6,7,8: 여름, 9,10,11: 가을, 12,1,2: 겨울
		// 변수명: month(int)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하시오.(1~12): ");
		int month = sc.nextInt();
		
		// 1번
		/*
		if(month == 3 || month == 4 || month == 5) {
			System.out.println(month + "은 봄입니다.");
		} else if(month == 6 || month == 7 || month == 8) {
			System.out.println(month + "은 여름입니다.");
		} else if(month == 9 || month == 10 || month == 11) {
			System.out.println(month + "은 가을입니다.");
		} else if(month == 12 || month == 1 || month == 2) {
			System.out.println(month + "은 겨울입니다.");
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
		*/
		
		// 2번
		if(month >= 3 && month <= 5) {
			System.out.println(month + "은 봄입니다.");
		} else if(month >= 6 && month <= 8) {
			System.out.println(month + "은 여름입니다.");
		} else if(month >= 9 && month <= 11) {
			System.out.println(month + "은 가을입니다.");
		} else if(month == 12 || month == 1 || month == 2) {
			System.out.println(month + "은 겨울입니다.");
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
		
		sc.close();
	}

}
