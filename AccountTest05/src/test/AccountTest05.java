package test;

import account.Account;
import account.TimeAccount;

public class AccountTest05 {
	public static void main(String[] args) {
		Account a1 = new Account("김연아", "123456", 5000);
		TimeAccount t1 = new TimeAccount("박찬호", "654321", 3000, 100);
		
		// 다형성 구현의 근거
		// - 부모를 통해서 자식들을 한꺼번에 처리할 수 있음 
		Account x;
		x = a1;
		x = t1; // 성공: 부모는 자식을 참조할 수 있음
		
		
		TimeAccount y;
//		y = a1; // 실패: 자식은 부모를 참조할 수 없음
		y = t1;
		
		System.out.println(a1.toString());
		System.out.println(t1.toString());
		System.out.println();
		
		t1.cancel();
		
//		a1.showAccount();
		t1.showAccount();
		System.out.println(t1.toString());
	}
}
