package member;

public class Member {
	private String no;
	private String name;
	private int age;
	
	public Member(String no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	public String getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return String.format("%s(%s, %d)", no, name, age);
	}
}
