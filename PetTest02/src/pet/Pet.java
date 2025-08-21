package pet;

// PetTest02
// 부모 클래스
public class Pet {
	private String name;       // 애완동물 이름
	private String masterName; // 주인 이름
	
	// 생성자
	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public String getMasterName() {
		return masterName;
	}
	
	// 자기소개
	public void introduce() {
		System.out.println("◆ 내 이름은 " + name + "입니다.");
		System.out.println("◆ 주인님의 이름은 " + masterName + "입니다.");
	}
}
