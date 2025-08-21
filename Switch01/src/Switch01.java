import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		// 메뉴 선택 화면
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴 선택(1~4): ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("파일 열기");
			break;
		case 2:
			System.out.println("파일 읽기");
			break;
		case 3:
			System.out.println("파일 저장");
			break;
		case 4:
			System.out.println("파일 닫기");
			break;
		default:
			System.out.println("다시 입력");
			break;
		}
		
		sc.close();
	}

}
