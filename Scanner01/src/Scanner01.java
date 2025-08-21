import java.util.Scanner;

public class Scanner01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력: ");
		int x = sc.nextInt();
		
		System.out.print("실수값 입력: ");
		double y = sc.nextDouble();
		
		System.out.print("문자열 입력: ");
		String s = sc.next();
		
		System.out.println("x = " + x);		
		System.out.println("y = " + y);
		System.out.println("s = " + s);
		
		sc.close();
	}

}
