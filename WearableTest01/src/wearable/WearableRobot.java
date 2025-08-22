package wearable;

public class WearableRobot implements Wearable, Color {

	private int color;
	
	public WearableRobot(int color) {
		this.color = color;
	}
	
	@Override
	public void putOn() {
		System.out.println(toString() + " 장착!!!");
	}
	
	@Override
	public void putOff() {
		System.out.println(toString() + " 해제~~~");
	}
	
	@Override
	public void changeColor(int color) {
		this.color = color;
	}
	
	public String toString() {
		switch (color) {
		case Color.RED:
			return "빨강 로봇";
		case Color.GREEN:
			return "초록 로봇";
		case Color.BLUE:
			return "파랑 로봇";
		default:
			return "블랙 로봇";
		}
	}
}
