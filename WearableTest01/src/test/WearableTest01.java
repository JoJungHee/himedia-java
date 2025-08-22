package test;

import wearable.Color;
import wearable.Wearable;
import wearable.WearableComputer;
import wearable.WearableRobot;

public class WearableTest01 {
	public static void main(String[] args) {
		// 문제) 다형성을 구현하여, WearableRobot 2개의 WearableComputer 2개를 생성하여, 기능 출력하시오
		// - WearableRobot은 자신의 기능을 출력할 수 있도록 하시오.
		
		// 인스턴스 배열 1번
		/*
		Wearable[] wears = new Wearable[4];
		wears[0] = new WearableRobot(Color.RED);
		wears[1] = new WearableRobot(Color.GREEN);
		wears[2] = new WearableComputer("일체형 PC");
		wears[3] = new WearableComputer("미니 PC");
		*/
		
		// 인스턴스 배열 2번
		Wearable[] wears = new Wearable[] {
			new WearableRobot(Color.RED),
			new WearableRobot(Color.GREEN),
			new WearableComputer("일체형 PC"),
			new WearableComputer("미니 PC"),
		};
		
		// 출력 1번
		/*
		for (int i = 0; i < wears.length; i++) {
			wears[i].putOn();
			wears[i].putOff();
			if (wears[i] instanceof WearableRobot) {
				if (i == 0) {
					((WearableRobot) wears[i]).changeColor(Color.BLUE);
				} else {
					((WearableRobot) wears[i]).changeColor(Color.RED);
				}
				wears[i].putOn();
				wears[i].putOff();
			}
			System.out.println();
		}
		*/
		
		// 출력 2번
		for (Wearable w : wears) {
			w.putOn();
			w.putOff();
			
			if (w instanceof WearableRobot) {
				((WearableRobot) w).changeColor(5);
				w.putOn();
//				w.putOff();
			}
			System.out.println();
		}
	}
}
