package player;

public class PortablePlayer implements Player, Skinnable {

	@Override
	public void play() {
		System.out.println("◆ 포터블 플레이어 재생 ~~~");
	}
	
	@Override
	public void stop() {
		System.out.println("◆ 포터블 플레이어 중지 ~~~");
	}
	
	
	// 클래스 메서드 (public static 메서드)를 사용할 때는
	// 클래스명.메서드명, 인터페이스명.메서드명 -> Skinnable.RED -> RED
	// PortablePlayer 클래스는 Skinnable을 구현하고 있는 클래스이므로 인터페이스명을 생략할 수 있음
	@Override
	public void changeSkin(int skin) {
		System.out.print("스킨을 ");
		switch(skin) {
//		case Skinnable.RED:
		case RED:
			System.out.print("빨강");
			break;
//		case Skinnable.GREEN:
		case GREEN:
			System.out.print("초록");
			break;
//		case Skinnable.BLUE:
		case BLUE:
			System.out.print("파랑");
			break;
//		case Skinnable.BLACK:
		case BLACK:
			System.out.print("검정");
			break;
//		case Skinnable.LEOPARD:
		case LEOPARD:
			System.out.print("표범무늬");
			break;
		default:
			System.out.print("흰색");
		}
		System.out.println("로(으로) 변경하였습니다.");
	}
}
