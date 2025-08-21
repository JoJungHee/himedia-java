import java.util.Scanner;

public class LoopTest07 {
	public static void main(String[] args) {
		// < 가위-바위-보 게임 >
		// 0(가위), 1(바위), 2(보)
		
		// 문제) 유저가 반드시 0, 1, 2 중에서 하나의 정수를 입력하도록 하고, 컴퓨터는 0, 1, 2 중에서 난수를 발생시켜, 
		// 승-패-무승부의 여부를 알 수 있도록 프로그래밍 하시오.
		// - 이 게임을 유저가 중단할 때까지 계속 반복하도록 하시오.
		// - 유저가 게임을 마쳤을 때는 최종 결과를 알려주도록 하시오.
		// - ex) 10전 5승 2패 3무승부 (승률: 5할)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 가위-바위-보 게임을 시작합니다. ***");
		int userNum;
		String[] game = new String[] {"가위", "바위", "보"};
		
		// 컴퓨터 난수 발생 - 0, 1, 2의 난수
		// 난수: 0 ~ 1 미만의 실수 난수, 0 ~ 0.9999... 사이의 난수
		// 0 ~ 0.9999... -> 0 ~ 2.9999...
		int compNum = (int)(Math.random() * 3); // 0, 1, 2 중에서 난수 발생
		
		// 반드시 사용자는 0, 1, 2 중에서 하나를 입력하도록 설계
		do {
			System.out.print("가위-바위-보를 입력하시오.(0,1,2): ");
			userNum = sc.nextInt();
		} while(userNum < 0 || userNum > 2 );
		//} while(!(userNum <= 0 && userNum >= 2)); // 드 모르간의 법칙
		
		// 가위-바위-보 확인
		System.out.printf("유저(%s) : 컴퓨터(%s)\n", game[userNum], game[compNum]);
		
		// 승-패-무 계산
		//int result = userNum - compNum;
		int result = (userNum - compNum + 3) % 3;
		
		switch(result) {
		case 1: 
			System.out.println("유저가 승리하였습니다.");
			break;
		case 2:
			System.out.println("유저가 패배하였습니다.");
			break;
		case 0:
			System.out.println("무승부입니다.");
			break;
		}
		
		sc.close();
	}

}
