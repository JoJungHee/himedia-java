import java.util.Scanner;

public class DayTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] weekDay = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("당신의 생일을 입력하시오.");
		System.out.print("년 입력: ");
		int y = sc.nextInt();
		System.out.print("월 입력: ");
		int m = sc.nextInt(); 
		System.out.print("일 입력: ");
		int d = sc.nextInt();
		
		Day birthday = new Day(y, m, d);
		
		// 문제점) DayTest02에서 해결
		// xDay의 값을 변경했는데, 왜 birthday의 값이 변경되어 있는가?
		// - 문제점: birthday의 참조를 복사하므로, 결국 xDay는 birthday의 인스턴스를 참조하게 됨.
		// - 값을 복사한 것이 아니라 참조를 복사함
		Day xDay = birthday;
		xDay.set(2025, 8, 19);
		
		System.out.printf("birthday: %4d년 %02d월 %02d일(%s요일)\n", birthday.getYear(), birthday.getMonth(), birthday.getDate(), weekDay[birthday.dayOfWeek()]);
		System.out.printf("    xDay: %4d년 %02d월 %02d일(%s요일)\n", xDay.getYear(), xDay.getMonth(), xDay.getDate(), weekDay[xDay.dayOfWeek()]);
		sc.close();
	}
}
