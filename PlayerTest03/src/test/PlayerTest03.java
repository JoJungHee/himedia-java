package test;

import player.PortablePlayer;
import player.Skinnable;


public class PlayerTest03 {
	public static void main(String[] args) {
		PortablePlayer p = new PortablePlayer();
		
		p.play();
//		p.changeSkin(1);
		p.changeSkin(Skinnable.LEOPARD);
		p.stop();
		
	}
}
