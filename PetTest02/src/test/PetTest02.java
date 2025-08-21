package test;

import pet.Pet;
import pet.RobotPet;

public class PetTest02 {
	public static void main(String[] args) {
		// 객체 배열 1번 (인스턴스 배열)
		/*
		Pet[] pets = new Pet[4];
		pets[0] = new Pet("나비", "오이영");
		pets[1] = new RobotPet("마크", "표남경");
		pets[2] = new Pet("별이", "김사비");
		pets[3] = new RobotPet("제리", "엄재일");
		*/
		
		// 객체 배열 2번 (인스턴스 배열)
		Pet[] pets = new Pet[] {
			new Pet("나비", "오이영"),
			new RobotPet("마크", "표남경"),
			new Pet("별이", "김사비"),
			new RobotPet("제리", "엄재일")
		};
		
		
		// 출력방법 1번 - 기본 for문
		// 동적 바인딩
		/*
		for (int i = 0; i < pets.length; i++) {
			pets[i].introduce();
			
			// pets[i]가 RobotPet형이라면
			if (pets[i] instanceof RobotPet) {
				((RobotPet)pets[i]).work(1);;
			}
			System.out.println();
		}
		*/
		
		// 출력방법 2번 - for-in문 (확장 for문)
		for (Pet p : pets) {
			p.introduce();
			
			if (p instanceof RobotPet) {
				((RobotPet)p).work(2);
			}
			System.out.println();
		}
	}
}
