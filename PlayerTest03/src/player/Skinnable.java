package player;

public interface Skinnable {
//	1. 인터페이스 안에는 public static final 상수만 존재한다. 
//	public static final int RED = 1;
//	static final int RED = 1;
//	final int RED = 1;
	int RED = 1;
	int GREEN = 2;
	int BLUE = 3;
	int BLACK = 4;
	int LEOPARD = 5;
	
//	2. 인터페이스 안에는 public으로 선언한 추상 메서드만 존재한다.
//	public abstract void changeSkin(int skin);
	void changeSkin(int skin);
}
