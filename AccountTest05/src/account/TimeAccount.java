package account;

// 자식 클래스 - 정기 예금 클래스
// - 멤버변수: timeBalance(정기예금)
public class TimeAccount extends Account {
	private int timeBalance;
	
	public TimeAccount(String name, String no, int balance, int timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}
	
	// setter
	public void setTimeBalance(int timeBalance) {
		this.timeBalance = timeBalance;
	}
	
	// getter
	public int getTimeBalance() {
		return timeBalance;
	}
	
	// 정기 예금 해약 메서드
	public void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}
	
	// 출력 메서드 1번
	@Override
	public void showAccount() {
		super.showAccount();
		System.out.println("  정기예금: " + timeBalance);		
	}
	
	// 출력 메서드 2번
	@Override
	public String toString() {
		return super.toString() + ", 정기예금: " + timeBalance;
	}
}
