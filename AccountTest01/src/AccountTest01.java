/*
 현재 예제 - 클래스의 개념을 도입하지 않음
 
 < 은행 계좌 클래스 >
 - 계좌명의, 계좌번호, 예금잔고
 
 문제점1: 계좌에 대한 정보를 변수명과 주석을 통해서 알 수 있다.
 문제점2: 한 사람의 계좌라면 하나로 묶어서 처리해야 하나, 그렇지 않다.
 문제점3: 아무나 변수를 통해서 입금, 출금이 가능하도록 되어 있다.
 
*/
public class AccountTest01 {
	public static void main(String[] args) {
		// John의 계좌
		String johnAccountName = "John";
		String johnAccountNo = "123456";
		int johnAccountBalance = 1000;
		
		// mary의 계좌
		String maryAccountName = "Mary";
		String maryAccountNo = "654321";
		int maryAccountBalance = 500;
		
		
		// 출금, 입금
		johnAccountBalance -= 200;
		maryAccountBalance += 100;
		
		// 출력
		System.out.println("* John의 계좌");
		System.out.println("  계좌명의: " + johnAccountName);
		System.out.println("  계좌번호: " + johnAccountNo);
		System.out.println("  예금잔고: " + johnAccountBalance);
		System.out.println();
		
		System.out.println("* Mary의 계좌");
		System.out.println("  계좌명의: " + maryAccountName);
		System.out.println("  계좌번호: " + maryAccountNo);
		System.out.println("  예금잔고: " + maryAccountBalance);
	}
}
