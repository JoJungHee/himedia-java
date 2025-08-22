package player;

public class DVDPlayer implements ExtendedPlayer {
	
	// Player
	@Override
	public void play() {
		System.out.println("● DVD 플레이어 재생 ~~~");
	}

	// Player
	@Override
	public void stop() {
		System.out.println("● DVD 플레이어 중지 ~~~");
	}
	
	// ExtendedPlayer
	@Override
	public void fast() {
		System.out.println("★ DVD 플레이어 빠르게 보기 ...");
	}

	// ExtendedPlayer
	@Override
	public void rewind() {
		System.out.println("★ DVD 플레이어 되감기 ...");
	}
}
