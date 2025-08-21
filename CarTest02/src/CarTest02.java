import java.util.Scanner;

public class CarTest02 {
	public static void main(String[] args) {
		// 문제) 자동차의 정보를 입력하여 인스턴스를 생성하고, 정보를 출력하시오.
		// Car g80 = new Car("제네시스 G80", 1890, 4990, 1480, 100);
		// Car ka4 = new Car("카니발 4세대", 1995, 5155, 1775, 200);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자동차의 제원을 입력하세요.");
		System.out.print("차 이름 입력: ");
		String name = sc.nextLine();
		System.out.print("차 너비 입력: ");
		int width = sc.nextInt();
		System.out.print("차 길이 입력: ");
		int length = sc.nextInt();
		System.out.print("차 높이 입력: ");
		int height = sc.nextInt();
		System.out.print("연료량 입력: ");
		double fuel = sc.nextDouble();
		System.out.println();
		
		Car myCar = new Car(name, width, length, height, fuel);
		myCar.putSpec();
		System.out.println();
		
		/*
		Car myCar = new Car("제네시스 G80", 1890, 4990, 1480, 200);
		myCar.putSpec();
		System.out.println();
		*/
		
		while (true) {
			// 정보 확인
			System.out.printf("현재 위치: (%f, %f), 남은 연료량: %f\n", myCar.getX(), myCar.getY(), myCar.getFuel());
			
			// 이동 여부
			System.out.print("이동하겠습니까? (Y/N): ");
			char yn = sc.next().charAt(0);
			
			if (yn == 'N' || yn == 'n') {
				break;
			}
			
			// 이동 거리 입력
			System.out.print("x방향 좌표: ");
			double dx = sc.nextDouble();
			System.out.print("y방향 좌표: ");
			double dy = sc.nextDouble();
			
			// 이동 가능 여부 - 연료량과 거리(x, y)의 비교
			if (!myCar.move(dx, dy)) {
				System.out.println("연료가 부족합니다!!!");
			}
			
		}
		System.out.println("자동차의 이동을 중지하였습니다.");
		
		sc.close();
	}
}
