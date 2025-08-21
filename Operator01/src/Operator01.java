
public class Operator01 {
	public static void main(String[] args) {
		// 1. 산술 연산자: +, -, *, /(몫), %(나머지)
		System.out.println(3 + 5);
		System.out.println(10 - 3);
		System.out.println(3 * 5);
		System.out.println(10 / 3); // 3, 몫
		System.out.println(10 % 3); // 1, 나머지
		System.out.println("-----");
		
		// 2. 증감 연산자: ++(증가), --(감소)
		// ++: 자신의 값을 1증가하는 연산자
		// --: 자신의 값을 1감소하는 연산자
		// 연산의 위치에 따라: 전위(++a, --a), 후위(a++, a--)
		// 전위: 자신의 값을 먼저 1증가 또는 1감소하고 대입(참조)함.
		// 후위: 먼저 대입(참조)하고 난 다음 자신의 값을 1증가 또는 1감소함.
		int a = 10, b;
		//b = ++a; //a = 11, b = 11
		//b = a++; // a = 11, b = 10
		//b = --a; // a = 9, b = 9
		b = a--; // a = 9, b = 10
		System.out.println("a = " + a + ", b = " + b);
		
		// 3. 비교(관계) 연산자: >, >=, <, <=, ==, !=, instanceof(객체 비교)
		// - 비교 연산의 결과는 항상 논리형이 됨. (true, false)
		int c = 10, d = 20;
		System.out.println(c > d);
		System.out.println(c < d);
		System.out.println(c == d);
		System.out.println(c != d);
		System.out.println("-----");
		
		// 4. 논리 연산자: &&(논리 AND, 논리곱), ||(논리 OR, 논리합), !(논리 NOT, 논리부정) 
		// - 논리 연산의 결과는 항상 논리형이 됨. (true, false)
		int x = 10, y = 20, z1 = 30, z2 = 40;
		System.out.println(x < y && z1 < z2);
		System.out.println(x < y && z1 > z2);
		System.out.println(x > y && z1 > z2);
		System.out.println(x < y || z1 < z2);
		System.out.println(x < y || z1 > z2);
		System.out.println(x > y || z1 > z2);
		System.out.println(x > y);
		System.out.println(!(x > y));
		
		
	}

}
