
public class DoWhile01 {
	public static void main(String[] args) {
		
		// 문제1) 1부터 10까지 1씩 증가하는 값을 출력하시오.
		/*
		int i = 1; // 초기값
		do {
			System.out.println(i);
			i++; // 증감값
		} while(i <= 10); // 조건식
		*/
		
		// 문제2) 10부터 1까지 1씩 감소하는 값을 출력하시오.
		/*
		int i = 10;
		do {
			System.out.println(i);
			i--;
		} while(i >= 1);
		*/
		
		// 문제3) 100부터 300까지 6씩 증가하는 값을 출력하시오.
		/*
		int i = 100;
		do {
			System.out.println(i);
			i += 6;			
		} while(i <= 300);
		*/
		
		// 문제4) 500부터 200까지 7씩 감소하는 값을 출력하시오.
		int i = 500;
		do {
			System.out.println(i);
			i -= 7;
		} while(i >= 200);
		
	}

}
