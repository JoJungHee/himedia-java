
/*
문제) 회원 클래스를 만들어 활용하시오.
1. 멤버변수는 이름(name), 회원번호(no), 나이(age)를 가진다.
2. 모든 매개변수를 초기화하는 생성자를 추가하시오.
3. 멤버변수는 private으로 선언하고, public으로 선언한 setter/getter 메서드를 추가하시오.
4. 멤버의 정보를 출력하는 메서드를 추가하시오. showMember()
5. 생성자와 메서드에서는 this를 활용하시오.
6. Member 클래스에 대한 인스턴스를 3명 만들어 출력하시오. (main 메서드)


*/
class Member {
	// 멤버 변수
	private String name;
	private String no;
	private int age;
	
	// 생성자
	public Member(String name, String no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	// 기본생성자
//	public Member() {};
	
	// setter
	public void setName(String name) {
		this.name = name;
	};
	
	public void setNo(String no) {
		this.no = no;
	};
	
	public void setAge(int age) {
		this.age = age;
	};
	
	// getter
	public String getName() {
		return name;
	};
	
	public String getNo() {
		return no;
	};
	
	public int getAge() {
		return age;
	};
	
	// 기타 메서드
	public void showMember() {
		System.out.printf("회원명: %s, 회원번호: %s, 나이: %d\n", name, no, age);
	};
}

public class MemberTest01 {
	public static void main(String[] args) {
		// 기본생성자 인스턴스
//		Member m1 = new Member();
//		Member m2 = new Member();
//		Member m3 = new Member();
		
//		m1.setName("John");
//		m1.setNo("123123");
//		m1.setAge(35);
		
		// 인스턴스
		Member m1 = new Member("오이영", "123456", 25);
		Member m2 = new Member("표남경", "123457", 26);
		Member m3 = new Member("엄재일", "123458", 27);
		
		m1.showMember();
		m2.showMember();
		m3.showMember();
	}
}
