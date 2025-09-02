package test;

import member.Member;

/*
문제)
1. 데이터를 저장할 때 발생하는 예외를 확인하고, 예외를 처리하시오.
2. 데이터를 출력할 때 발생하는 예외를 확인하고, 예외를 처리하시오.
3. 예외의 발생유무와 상관없이 members에 저장된 정확한 회원수를 출력하시오.
*/
public class ExceptionTest08 {
	public static void main(String[] args) {
		Member[] members = new Member[6];
		String[] nos = {"123456", "123457", "123458", "123459", "123460"};
		String[] names = {"이익준", "김준완", "채송화", "양석형", "안정원"};
		
		// 1. 인스턴스 배열에 데이터 저장
		// java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		// - 원인: 인스턴스 배열의 5번에 해당하는 각 데이터 5번이 없기 때문에 예외가 발생
		try {
			for(int i=0; i<members.length; i++) {
				members[i] = new Member(nos[i], names[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("배열의 인덱스를 벗어났습니다.");
		}
		
		// 2. 인스턴스 배열의 데이터 출력
		// java.lang.NullPointerException
		// - 원인: 배열은 6개인데, 실제 데이터는 5개이므로, 5번에 대한 toString() 메서드를 호출하지 못함으로 발생하는 예외
		// - null인 데이터에 대해서 toString() 메서드를 호출할 수 없기 때문
		int cnt = 0;
		try {
			for(Member m : members) {
				System.out.println(m.toString());
				++cnt;
			}
		} catch(NullPointerException e) {
			System.err.println("널에 대해서 메서드에 접근할 수 없습니다.");
		} finally {
			System.out.println("회원수: " + cnt);
		}
		
	}

}
