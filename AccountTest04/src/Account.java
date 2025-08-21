// AccountTest04
public class Account {
	// 클래스 변수, static field
	// - 클래스에 딱 1개만 만들어지고, 모든 인스턴스에서 공유하는 변수
	private static int count = 0;
	
	// 인스턴스 변수, non-static field
	// - 인스턴스를 만들 때마다 생성되는 변수
	private String name;
	private String no;
	private int balance;
	private int id; // 일련번호: 인스턴스를 만들 때마다 1부터 자동으로 1씩 증가하는 값을 가지도록 함
	
	// 기본 생성자
	public Account() {
		
	}
	
	// 생성자 오버로딩
	public Account(String name, String no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.id = ++count;
	}

	// 클래스 메서드, static method(정적 메서드)
	// - 클래스에 딱 1개만 생성되고, 모든 인스턴스에서 공유하는 메서드
	public static int getCount() {
		return count;
	}
	
	
	// 인스턴스 메서드, non-static method(비정적 메서드)
	// - 인스턴스를 만들 때마다 생성되는 메서드
	
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
		System.out.println("  일렬번호: " + id);
		System.out.println("  계좌명의: " + name);
		System.out.println("  계좌번호: " + no);
		System.out.println("  예금잔고: " + balance);
	}
	
	// 출력 메서드 2번 - toString()
	public String toString() {
		return String.format("[%3d] 계좌명의: %s, 계좌번호: %s, 예금잔고: %4d", id, name, no, balance);
	}
}
