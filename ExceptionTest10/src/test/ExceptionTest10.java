package test;

import account.Account;
import exception.BalanceInsufficientException;
import exception.MinusDepositException;

public class ExceptionTest10 {
	public static void main(String[] args) {
		Account acc = new Account("123456", "이익준", 1000000);
		
		System.out.println(acc);
		
		// 출금
		// 문제점: 잔고보다 많은 금액을 출금하여 마이너스 잔고가 될 수 있음
		try {
//			acc.withdraw(3000000);  // 예외 처리
			acc.withdraw(500000);
		} catch (BalanceInsufficientException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println(acc);
		
		
		// 입금
		// 문제점: 마이너스 금액을 입금할 수 있음
		try {
//			acc.deposit(-2000000);	// 예외 처리
			acc.deposit(300000);
		} catch (MinusDepositException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println(acc);
		
	}
}
