package animal;

// 자식 클래스
public class Dog extends Animal {
	private String type; // 견종
	
	public Dog(String name, String type) {
		super(name);
		this.type = type;
	}
	
	// setter
	public void setType(String type) {
		this.type = type;
	}
	
	// getter
	public String getType() {
		return type;
	}

	@Override
	public void bark() {
		System.out.println("멍멍~~~");
	};
	
	@Override
	public String toString() {
		return "제 이름은 " + getName() + "이고, 견종은 " + type + "입니다.";
	}
}
