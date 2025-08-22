package test;

import player.CDPlayer;
import player.Player;
import player.VideoPlayer;

public class PlayerTest01 {
	public static void main(String[] args) {
		// 인터페이스는 인스턴스를 생성할 수 없음
//		Player p = new Player();
		
		// CD 플레이어 2개, Video 플레이어 3개를 생성하고, 출력하시오
		// 각 플레이어만의 기능도 함께 출력하시오.
		
		// 인스턴스 배열 1번
		/*
		Player[] players = new Player[5];
		players[0] = new CDPlayer();
		players[1] = new VideoPlayer();
		players[2] = new CDPlayer();
		players[3] = new VideoPlayer();
		players[4] = new VideoPlayer();
		*/
		
		// 인스턴스 배열 2번
		Player[] players = new Player[] {
			new CDPlayer(),
			new VideoPlayer(),
			new CDPlayer(),
			new VideoPlayer(),
			new VideoPlayer()
		};
		
		
		// 출력 1번
		/*
		for (int i = 0; i < players.length; i++) {
			players[i].play();
			if (players[i] instanceof CDPlayer) {
				((CDPlayer) players[i]).clean();
			}
			if (players[i] instanceof VideoPlayer) {
				((VideoPlayer) players[i]).printInfo();
			}
			players[i].stop();
			System.out.println();
		}
		*/
		
		// 출력 2번
		for (Player p : players) {
			p.play();
			if (p instanceof VideoPlayer) {
				((VideoPlayer) p).printInfo();
			}
			if (p instanceof CDPlayer) {
				((CDPlayer) p).clean();
			}
			p.stop();
			System.out.println();
		}
	}
}
