package member;


public class Member implements Comparable<Member>{
	private String sno;
	private String name;
	private int age;
	
	public Member(String sno, String name, int age) {
		this.sno = sno;
		this.name = name;
		this.age = age;
	}
	
	public String getSno() {
		return sno;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setSno(String sno) {
		this.sno = sno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public int compareTo(Member m) {
		if (this.sno.compareTo(m.sno) > 0) return 1;
		else if (this.sno.compareTo(m.sno) < 0) return -1;
		else return 0;
	}
	
	@Override
	public String toString() {
		return String.format("%s,%s(%d)", sno, name, age); 
	}
}
