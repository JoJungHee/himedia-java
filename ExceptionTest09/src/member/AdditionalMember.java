package member;

public class AdditionalMember extends Member {
	private int bonus;
	
	public AdditionalMember(String no, String name, int bonus) {
		super(no, name);
		this.bonus = bonus;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	public String toString() {
		return super.toString() + " : " + bonus;
	}
}
