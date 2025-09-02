package member;

public class Member {
	private String no;   // 회원번호
	private String name; // 회원이름

	// 생성자
	public Member(String no, String name) {
		this.no = no;
		this.name = name;
	}
	
	// setter/getter
	public void setNo(String no) {
		this.no = no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
		
	// toString()
	public String toString() {
		return String.format("[%2s] %s", no, name);
	}
}
