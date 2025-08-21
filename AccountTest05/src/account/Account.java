package account;

// AccountTest05
// 부모 클래스 - 일반 예금 클래스
// - 멤버변수: name(계좌명의), no(계좌번호), balance(예금잔고)
public class Account {
	private String name;
	private String no;
	private int balance;
	
	// 기본 생성자
	public Account() {
		
	}
	
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
	
	// 출력 메서드 1번
	public void showAccount() {
		System.out.println("  계좌명의: " + name);
		System.out.println("  계좌번호: " + no);
		System.out.println("  예금잔고: " + balance);
	}
	
	// 출력 메서드 2번 - toString()
	public String toString() {
		return String.format("계좌명의: %s, 계좌번호: %s, 예금잔고: %4d", name, no, balance);
	}
}
