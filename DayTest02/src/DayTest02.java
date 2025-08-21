import java.util.Scanner;

public class DayTest02 {
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
		
		// 해결책)
		// - 문제점: xDay의 인스턴스를 만들고 복사생성자를 통해서 birthday의 값을 복사하였음
		// - 따라서, 복사한 값을 변경하고, 원래의 birthday의 값은 그대로 유지됨
		Day xDay = new Day(birthday);
		xDay.set(2025, 8, 19);
		
		System.out.printf("birthday: %4d년 %02d월 %02d일(%s요일)\n", birthday.getYear(), birthday.getMonth(), birthday.getDate(), weekDay[birthday.dayOfWeek()]);
		System.out.printf("    xDay: %4d년 %02d월 %02d일(%s요일)\n", xDay.getYear(), xDay.getMonth(), xDay.getDate(), weekDay[xDay.dayOfWeek()]);
		sc.close();
	}
}
