// 1. 단일형 import
//import java.util.Random;
//import java.util.Scanner;

// 2. 주문형 import
// *: 사용중인 모든 클래스를 import함
import java.util.*;

public class ImportTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("오늘의 운세를 알아봅니다.");
		System.out.print("행운의 수 입력(0~9): ");
		int n = sc.nextInt();
		
		int rn = r.nextInt(10);  // 0 ~ 9 사이의 정수 난수
		
		if (n == rn) {
			System.out.println("오늘은 당신에게 행운이 있는 날입니다.");
		} else {
			System.out.println("오늘은 당신에게 평범한 날입니다.");
		}
		
		System.out.printf("당신의 수: %d, 행운의 수: %d\n", n, rn);
		sc.close();
	}
}
