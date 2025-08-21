
public class Printf02 {
	public static void main(String[] args) {
		int x = 9, y = 15;
		
		// 서식문자: %o, %x, %X
		System.out.printf("%d, %d\n", x, y); // 10진수
		System.out.printf("%o, %o\n", x, y); // 8진수, octal
		System.out.printf("%x, %x\n", x, y); // 16진수, hexadecimal
		System.out.printf("%X, %X\n", x, y);
		System.out.println("-----");
		
		// 자바 클래스로 10진수를 2진수, 8진수, 16진수를 출력하는 방법
		int a = 15;
		System.out.println(Integer.toBinaryString(a)); // 1111, 2진수
		System.out.println(Integer.toOctalString(a));  // 17, 8진수
		System.out.println(Integer.toHexString(a));    // f, 16진수
		
		// 자바 클래스로 2진수, 8진수, 16진수를 10진수로 출력하는 방법
		System.out.println(Integer.parseInt("1111", 2)); // 2진수를 10진수로 출력
		System.out.println(Integer.parseInt("17", 8));   // 8진수를 10진수로 출력
		System.out.println(Integer.parseInt("f", 16));   // 16진수를 10진수로 출력
		
	}

}
