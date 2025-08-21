
public class Operator02 {
	public static void main(String[] args) {
		// 5. 비트 연산자: &(비트 AND), |(비트 OR), ^(Exclusive OR, 배타적 OR, XOR), ~(비트  NOT)
		// - 2진수로 계산하는 연산자
		// - &: 두 개의 비트가 모두 1일 때 결과가 1이 됨.
		// - |: 두 개의 비트 중에서 1개만 1이어도 결과가 1이 됨.
		// - ^: 두 개의 비트 중에서 1개만 1일 때 결과가 1이 됨.
		// - ~: 1은 0, 0은 1로 바꿔 줌. 단항 연산자
		System.out.println(47 & 73);
		System.out.println(47 | 73);
		System.out.println(47 ^ 73);
		
		// 6. 쉬프트 연산자: <<(left shift) , >>(right shift)
		// - 2진수로 계산하는 연산자
		// <<: 2진수의 비트를 왼쪽으로 이동함, 2진수의 곱셈
		// >>: 2진수의 비트를 오른쪽으로 이동함, 2진수의 나눗셈
		int a = 4, b = 64;
		System.out.println(a << 3);
		System.out.println(b >> 4);
		
		// 7. 조건 선택 연산자: ? :의 쌍으로 사용함
		// 조건식 ? 참 : 거짓 -> 조건식이 참일 때 ? 뒤의 참값을 갖고, 거짓일 때 : 뒤의 거짓값을 가짐.
		// - if문의 대용으로 간결하게 쓰고자 할 때 사용함.
		int x = 10, y = 5, z;
		z = x < y ? x : y;
		System.out.println(z);
		System.out.println("-----");
		
		// 8. 대입 연산자: = (오른쪽에 있는 값을 왼쪽으로 넣음)
		// 9. 복합대입 연산자: +=, -=, *=, /=, %= ...
		// - 할당 연산자 
		// - 연산이 끝나면 대입하는 2가지의 역할을 수행함.
		// 문제1) a의 값을 1증가하여 a에 대입하시오.
		a = 10;
		//++a;
		//a++;
		//a = a + 1;
		a += 1;
		System.out.println(a);
		// 문제2) x의 값을 5증가하여 x에 대입하시오.
		x = 10;
		//x = x + 5;
		x += 5;
		System.out.println(x);
		
		
	}

}
