package member;


public class Member implements Comparable<Member>{
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
	
	
	@Override
	public int compareTo(Member m) {
		if (this.no.compareTo(m.no) > 0) return 1;
		else if (this.no.compareTo(m.no) < 0) return -1;
		else return 0;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%s, %d)", no, name, age);
	}
}
