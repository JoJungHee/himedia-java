package member;

public class SpecialMember extends Member {
	private String privilege;
	
	public SpecialMember(String no, String name, String privilege) {
		super(no, name);
		this.privilege = privilege;
	}
	
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	
	public String getPrivilege() {
		return privilege;
	}
	
	public String toString() {
		return super.toString() + " : " + privilege;
	}
}
