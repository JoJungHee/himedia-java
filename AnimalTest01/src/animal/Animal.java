package animal;

// 추상 클래스
// 부모 클래스 - 자식 Dog, Cat
public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	// 추상 메서드
	public abstract void bark();
	
	// 추상 메서드
	@Override
	public abstract String toString();
	
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	// 자기소개 메서드
	public void introduce() {
		System.out.println(toString());
		bark();
	}
}
