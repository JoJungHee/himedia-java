package pet;

// PetTest02
// 자식 클래스
public class RobotPet extends Pet {

	// 생성자
	public RobotPet(String name, String masterName) {
		// 상속 받은 인스턴스 변수의 초기화를 부모의 생성자에게 위임
		super(name, masterName);
	}
	
	// 오버라이딩
	@Override
	public void introduce() {
		System.out.println("◎ 저는 로봇입니다. 제 이름은 " + getName() + "입니다.");
		System.out.println("◎ 제 주인님의 이름은 " +  getMasterName() + "입니다.");
	}
	
	// 일을 하는 메서드
	public void work(int w) {
		switch (w) {
		case 0:
			System.out.println("청소를 합니다.");
			break;
		case 1:
			System.out.println("빨래를 합니다.");
			break;
		case 2:
			System.out.println("밥을 짓습니다.");
			break;
		}
	}
}
