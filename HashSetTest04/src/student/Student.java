package student;

public class Student {
	private String sno; // 학번
	private String name; // 이름
	
	public Student(String sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public void setSno(String sno) {
		this.sno = sno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSno() {
		return sno;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%s)", sno, name);
	}
	
	
	
	
	@Override
	public int hashCode() {
		return (sno+name).hashCode();
	}
	
	@Override
	// 모든 클래스 부모 object를 받아야 함
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			// 캐스팅한 값을 받아두고
			Student s = (Student) obj;
			return this.sno.equals(s.sno) && this.name.equals(s.name);
		}
		return false;
	}
}
