package member;

public class Member {
	private String name;
	private int age;
	
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	// toString()
	public String toString() {
		return String.format("%s(%d)", name, age);
	}
	
	
	// ★★★★★
	// 1. HashSet에서 클래스의 객체를 저장하여 사용하기 위해서는 
	// -  Object hashCode(), equals() 메서드를 반드시 오버라이딩 해야한다.
	// 2. 오버라이딩하지 않으면 사용은 가능하지만, 중복 데이터를 허용하게되므로 잘못된 방법으로 사용하는 것이 된다.
	
	@Override
	public int hashCode() {
		return (name + age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member m = (Member) obj;
			return this.name.equals(m.name) && this.age == m.age; 
		}
		return false;
	}
}


