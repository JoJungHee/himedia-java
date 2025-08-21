
/*
< 은행 계좌 클래스 >
- 계좌명의(name), 계좌번호(no), 예금잔고(balance)

해결: 앞서 있었던 문제점1번과 문제점2번을 클래스를 정의하고 인스턴스를 생성하여 사용함으로써 해결함
문제점1: 아무나 변수를 통해서 입금, 출금이 가능하도록 되어 있다.
문제점2: 확실한 초기화에 대한 보장이 되고 않는다.


*/

// 클래스 정의
class Account {
	// 멤버 변수
	String name;
	String no;
	int balance;
}

public class AccountTest02 {
	
	
	public static void main(String[] args) {
		// john과 mary의 계좌를 생성 -> 인스턴스(instance, 실체, 객체) 생성
		Account john = new Account();
		Account mary = new Account();
		
		// john의 인스턴스를 초기화
//		john.name = "John";
//		john.no = "123456";
//		john.balance = 1000;
		
		
		// mary의 인스턴스를 초기화
//		mary.name = "Mary";
//		mary.no = "65432";
//		mary.balance = 500;
		
		
		// 출금, 입금
//		john.balance -= 200;
//		mary.balance += 100;
		
		
		System.out.println("◆ John의 계좌");
		System.out.println("  계좌명의: " + john.name);
		System.out.println("  계좌번호: " + john.no);
		System.out.println("  예금잔고: " + john.balance);
		System.out.println();
		
		System.out.println("◆ Mary의 계좌");
		System.out.println("  계좌명의: " + mary.name);
		System.out.println("  계좌번호: " + mary.no);
		System.out.println("  예금잔고: " + mary.balance);
	}
}
