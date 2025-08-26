import java.util.Random;

// 난수: 어떤 정해진 규칙이 없이 임의로 생성한 수
// - random number, 임의의 수, 무작위수
public class MathTest03 {
	public static void main(String[] args) {
		// random(): 0 ~ 1 미만의 실수의 난수를 발생함.
		double x = Math.random();
		System.out.println(x);
		
		// 1. 0 ~ 9 사이의 난수
		// 0 ~ 0.999 -> 0 ~ 9.9999 -> 0 ~ 9
		int n1 = (int)(Math.random() * 10);
		System.out.println(n1);
		
		// 2. 1 ~ 10 사이의 난수
		// 0 ~ 0.9999 -> 0 ~ 9.9999 -> 0 ~ 9 -> 1 ~ 10
		int n2 = (int)(Math.random() * 10) + 1;
		System.out.println(n2);
		
		// 3. 가위, 바위, 보의 난수 (0 ~ 2) 
		int n3 = (int)(Math.random() * 3);
		System.out.println("0 ~ 2 사이의 난수: " + n3);
		
		// 4. 6면 주사위의 난수 (1 ~ 6) 
		int n4 = (int)(Math.random() * 6) + 1;
		System.out.println("1 ~ 6 사이의 난수: " + n4);
		
		// 5. 로또 복권의 난수 (1 ~ 45)
		int n5 = (int)(Math.random() * 45) + 1;
		System.out.println("1 ~ 45 사이의 난수: " + n5);
		
		// < 난수를 생성하는 2번 방법 >
		Random r = new Random();
		int n6 = r.nextInt(45) + 1; // 0 ~ 45 미만의 난수 -> 1 ~ 46 미만의 난수
		System.out.println("1 ~ 45 사이의 난수: " + n6);
	}
}
