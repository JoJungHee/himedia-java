package test;

public class Student {
	private int sno;		// 학생 번호
	private String name;	// 학생 이름
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public int getSno() {
		return sno;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return String.format("%d(%s)", sno, name);
	}
	
	// 객체의 모든 멤버가 같을 때는 중복을 허용해서는 안됨
	// - hashCode(), equals() 메서드를 오버라이딩 해야 함
	
	@Override
	public int hashCode() {
		return (sno+name).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		
		return this.sno == s.sno && this.name.equals(s.name);
	}
}
