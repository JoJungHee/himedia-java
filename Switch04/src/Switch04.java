import java.util.Scanner;

public class Switch04 {
	public static void main(String[] args) {
		// 문제) 한글로 요일을 입력하였을 때, 영어로 출력하시오.
		// switch ~ case문으로 작성하시오.
		// Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
		// switch ~ case문의 조건에 문자열을 사용하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한글 요일을 입력하세요. 영어 요일을 알려드립니다.: ");
		String kWeekday = sc.next();
		String eWeekday = "";
		
		switch(kWeekday) {
		case "일":
			eWeekday = "Sunday";
			break;
		case "월":
			eWeekday = "Monday";
			break;
		case "화":
			eWeekday = "Tuesday";
			break;
		case "수":
			eWeekday = "Wednesday";
			break;
		case "목":
			eWeekday = "Thursday";
			break;
		case "금":
			eWeekday = "Friday";
			break;
		case "토":
			eWeekday = "Saturday";
			break;
		default:
			eWeekday = "없는 요일";
			break;
		}
		
		System.out.println(kWeekday + "요일은 영어로 " + eWeekday + "입니다.");
		
		sc.close();
	}

}
