package test;

import member.AdditionalMember;
import member.Member;
import member.SpecialMember;

/*
문제)
1. 캐스팅에서 발생하는 예외와 원인을 확인하고, 예외를 처리하시오.
2. 데이터 출력에서 발생하는 예외와 원인을 확인하고, 예외를 처리하시오.

*/
public class ExceptionTest09 {
	public static void main(String[] args) {
		SpecialMember sm = new SpecialMember("123456", "이익준", "10% 할인 쿠폰");
		AdditionalMember am = new AdditionalMember("124567", "김준완", 10000);
		Member m = new Member("123458", "안정원");
		SpecialMember sm2 = null;
		
		// 1. 캐스팅
		//sm2 = (SpecialMember) am; // 예외가 아니라 에러 -> 자식끼리는 캐스팅할 수 없음
		
		// java.lang.ClassCastException: class member.Member cannot be cast to class member.SpecialMember (member.Member and member.SpecialMember
		// 원인: 부모를 자식으로 캐스팅하면 부모에게 없는 기능을 자식이 사용하게 되므로 예외가 발생함
		// - 다운 캐스팅을 할 때 발생하면 예외
		try {
			sm2 = (SpecialMember) m;	
		} catch(ClassCastException e) {
			System.err.println("부모를 자식으로 다운 캐스팅하여 사용할 수 없습니다.");
		}
		
		
		// 2. 데이터 출력
		// java.lang.NullPointerException
		// 원인: null을 사용하여 toString() 메서드를 사용하려고 하기 때문
		try {
			System.out.println(sm2.toString());
		} catch(NullPointerException e) {
			System.err.println("null을 사용하여 메서드에 접근할 수 없습니다.");
		}
		
	}

}
