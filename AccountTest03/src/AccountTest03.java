/*
< 은행 계좌 클래스 >
1. 멤버변수
- name(계좌명의), no(계좌번호), balance(예금잔고)

2. 멤버메서드
- setter 메서드: 멤버변수명 앞에 set을 붙여서 만듦, 멤버변수의 값을 설정할 목적으로 사용
- getter 메서드: 멤버변수명 앞에 get을 붙여서 만듦, 멤버변수의 값을 리턴할 목적으로 사용
- 입금 메서드: deposit() 
- 출금 메서드: withdraw()
# accessor setter/getter를 합께 부를 때

- 해결1: 앞서 있었던, 문제점1번을 멤버변수를 private, public으로 선언한 setter/getter 메서드를 생성하여 해결함 
- 해결1: public으로 선언한 deposit(), withdraw() 메서드를 생성하여 해결함
- 해결2: 매개변수를 갖는 생성자를 추가하여 확실한 초기화에 대한 보장이 되도록 해결함

- 문제점1: 아무나 변수를 통해서 입금, 출금이 가능하도록 되어 있다.
- 문제점2: 확실한 초기화에 대한 보장이 되고 않는다.

★★★★★
< 접근 제한자(한정자) >
- modifier
- 멤버변수 앞에 써서 멤버변수에 대한 접근을 제한하는 것
- 변수, 메서드, 클래스, 패키지 앞에도 사용이 가능함.
1. public - 어디에서나 사용이 가능함
2. protected - 상속을 받은 클래스에서는 사용이 가능함.
3. default - 같은 패키지 내의 클래스에서만 사용이 가능함. 특별한 키워드를 사용하지 않는 경우를 말함
4. private - 같은 클래스 내에서만 사용이 가능함


# 클래스에서 활용
- 멤버변수는 외부에서 사용하지 못하도록 private으로 설정하고, 클래스 내부에 public으로 선언된 메서드를 생성하여 외부에서 사용함


 */

class Account {
	// 멤버변수
	private String name;
	private String no;
	private int balance;
	
	// ★★★★★ * 1000000000000000000000000000000000000
	// 생성자(Constructor)
	// 생성자의 특징
	// 1. 클래스 이름과 같다.
	// 2. 리턴 타입이 없다.
	
	// 생성자의 역할
	// 1. 생성자는 인스턴스를 만들 때 호출하므로, 확실한 초기화에 대한 보장을 해준다.
	// 2. 생성자는 인스턴스를 만들 때만 호출이 가능함
	
	// 기본 생성자 (Default Constructor)
	// 1. 매개변수 없는 생성자
	// 2. 클래스를 만들면 무조건 생성됨
	// 3. 다른 생성자를 만들면 기본 생성자는 사라짐 (생성자를 오버로딩하면 기본생성자는 사라짐)
	// - 기본생성자가 필요하면 만들어 넣어줌
	public Account() {};
	
	
	
	// 생성자 오버로딩
	public Account(String name, String no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	
	// setter 메서드 - 멤버변수의 값을 설정하는 메서드
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// getter 메서드 - 멤버변수의 값을 리턴하는 메서드
	public String getName() {
		return name;
	}
	
	public String getNo() {
		return no;
	}
	
	public int getBalance() {
		return balance;
	}
	
	// 입금 메서드
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금 메서드
	public void withdraw(int money) {
		balance -= money;
	}
}


public class AccountTest03 {
	public static void main(String[] args) {
		// john과 mary의 계좌를 생성 -> 인스턴스(instance, 실체, 객체) 생성
		
		// 1. 기본 생성자를 사용하여 인스턴스를 생성
//		Account john = new Account();
//		Account mary = new Account();
		
		// 2. 매개변수를 가진 생성자를 활용하여 인스턴스를 생성
		Account john = new Account("John", "123456", 1000);
		Account mary = new Account("Mary", "654321", 500);
		
		
		// john의 인스턴스를 초기화
//		john.setName("John");
//		john.setNo("123456");
//		john.setBalance(1000);
		
		
		// mary의 인스턴스를 초기화
//		mary.setName("Mary");
//		mary.setNo("65432");
//		mary.setBalance(500);
		
		// 생성자는 인스턴스를 만들 때만 호출이 가능
//		john.Account("John", "123456", 1000); // 에러
		
		
		
		// 출금, 입금 메서드
		john.withdraw(200);
		mary.deposit(100);
		
		
		System.out.println("◆ John의 계좌");
		System.out.println("  계좌명의: " + john.getName());
		System.out.println("  계좌번호: " + john.getNo());
		System.out.println("  예금잔고: " + john.getBalance());
		System.out.println();
		
		System.out.println("◆ Mary의 계좌");
		System.out.println("  계좌명의: " + mary.getName());
		System.out.println("  계좌번호: " + mary.getNo());
		System.out.println("  예금잔고: " + mary.getBalance());
	}
}
