
public class If01 {
	public static void main(String[] args) {
		// 1. 자연수 중에서 양수인지를 판별하시오.
		// 양수 조건: 0보다 큰 수
		int n = 0;
		
		/*
		if(n > 0) {
			System.out.println(n + "은 양수입니다.");
		}
		*/
		
		// 2. 자연수 중에서 양수인지 음수인지를 판별하시오.
		// 양수 조건: 0보다 큰 수
		// 음수 조건: 0보다 작은 수
		/*
		if(n > 0) {
			System.out.println(n + "은 양수입니다.");
		} else {
			System.out.println(n + "은 음수입니다.");
		}
		*/
		
		if(n > 0) {
			System.out.println(n + "은 양수입니다.");
		} else if(n < 0) {
			System.out.println(n + "은 음수입니다.");
		} else { //} else if(n == 0) {
			System.out.println("0입니다.");
		}
		
	}

}
