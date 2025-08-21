package member;

public class SpecialMember extends Member{
	// 멤버변수
	private String privilege;
	
	
	// 생성자
	public SpecialMember(String name, String no, int age, String privilege) {
		super(name, no, age);
		this.privilege = privilege;
	}
	
	// setter
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	
	// getter
	public String getPrivilege() {
		return privilege;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("◎ 특별혜택: " + privilege);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 특별혜택: " + privilege;
	}
	
	public void exercise() {
		System.out.println("◇ " + getName() + " 회원님은 1달에 1번씩 짐(Gym)을 마음껏 사용할 수 있습니다.");
	}
}
