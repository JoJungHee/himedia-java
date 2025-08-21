package test;

import member.Member;
import member.SpecialMember;

public class MemberTest02 {
	public static void main(String[] args) {
		// 인스턴스 배열 1번
		/*
		Member[] members = new Member[4];
		members[0] = new Member("오이영", "123456", 25);
		members[1] = new SpecialMember("표남경", "123457", 26, "10% 할인");
		members[2] = new Member("김사비", "123458", 27);
		members[3] = new SpecialMember("엄재일", "123459", 28, "1일 무료 사용권");
		*/
		
		
		// 인스턴스 배열 2번
		Member[] members = new Member[] {
			new Member("오이영", "123456", 25),
			new SpecialMember("표남경", "123457", 26, "10% 할인"),
			new Member("김사비", "123458", 27),
			new SpecialMember("엄재일", "123459", 28, "1일 무료 사용권")
		};
		
		
		// 출력 1번
		/*
		for (int i = 0; i < members.length; i++) {
			members[i].showInfo();
			if (members[i] instanceof SpecialMember) {
				((SpecialMember)members[i]).exercise();
			}
			System.out.println();
		}
		*/
		
		// 출력 2번
		for (Member m : members) {
			System.out.println(m.toString());
			if (m instanceof SpecialMember) {
				((SpecialMember) m).exercise();
			}
		}
	}
}
