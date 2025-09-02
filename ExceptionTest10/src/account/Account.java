package account;

import java.text.DecimalFormat;

import exception.BalanceInsufficientException;
import exception.MinusDepositException;

public class Account {
	private String no;
	private String name;
	private long balance;
	DecimalFormat df = new DecimalFormat("#,###");
	
	public Account(String no, String name, long balance) {
		this.no = no;
		this.name = name;
		this.balance = balance;
	}
	
	// 입금 - 마이너스 금액의 입금 문제를 해결
	// 방법 1 - 논리적인 방법으로 처리
	/*
	public void deposit(long money) {
		if (money < 0) {
			System.err.println("마이너스 금액은 입금할 수 없습니다.");
			return;
		}
		balance += money;
	}
	*/
	
	
	// 방법2 - 예외 클래스를 사용하여 처리
	public void deposit(long money) throws MinusDepositException {
		if (money < 0) {
			throw new MinusDepositException("마이너스 금액 오류: " + df.format(money) + "원은 입금할 수 없습니다.");
		}
		balance += money;
	}
	
	
	// 출금 - 잔고보다 많은 금액을 출금할 수 있는 문제를 해결
	// 방법1 - 논리적인 방법으로 처리
	/*
	public void withdraw(long money) {
		if (money > balance) {
			System.err.println("은행 잔고보다 큰 금액을 출금할 수 없습니다.");
			return;
		}
		balance -= money;
	}
	*/
	
	// 방법2 - 예외 클래스를 사용하여 처리
	public void withdraw(long money) throws BalanceInsufficientException {
		if (money > balance) {
			throw new BalanceInsufficientException("잔고 부족: " + df.format((money-balance)) + "원이 부족합니다.");
		}
		balance -= money;
	}
	
	public String toString() {
		return String.format("[%s] %s | %s", no, name, df.format(balance));
	}
}
