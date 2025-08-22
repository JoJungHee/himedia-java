package player;

public class VideoPlayer implements Player {
	public static int count = 0;
	public int id;
	
	public VideoPlayer() {
		id = ++count;
	}

	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	
	@Override
	public void play() {
		System.out.println("■ 비디오 재생 시작 ...");
	}
	
	@Override
	public void stop() {
		System.out.println("■ 비디오 재생 중지 ...");
	}
	
	public void printInfo() {
		System.out.println("비디오 제작번호: " + id);
	}
}
