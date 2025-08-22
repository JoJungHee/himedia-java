package test;

import player.DVDPlayer;

public class PlayerTest02 {
	public static void main(String[] args) {
		DVDPlayer dvd = new DVDPlayer();
		
		dvd.play();
		dvd.fast();
		dvd.rewind();
		dvd.stop();
	}
}
