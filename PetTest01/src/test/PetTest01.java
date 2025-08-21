package test;

import pet.Pet;
import pet.RobotPet;

public class PetTest01 {
	public static void main(String[] args) {
		Pet happy = new Pet("해피", "오이영");
		happy.introduce();
		System.out.println();
		
		// 동적 바인딩 (dynamic binding)
		// - 자신의 인스턴스에 맞는 메서드를 호출하는 것
		RobotPet r2d2 = new RobotPet("알투디투", "표남경");
		r2d2.introduce();
		System.out.println();
		
		r2d2.work(0);
	}
}
