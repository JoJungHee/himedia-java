package test;

import animal.Animal;
import animal.Dog;
import animal.Cat;

public class AnimalTest01 {
	public static void main(String[] args) {
		// 에러: 추상 클래스는 인스턴스를 만들수 없다.
//		Animal a = new Animal("동물");
		
		// 문제) 다형성을 구현하여, 강아지 2마리와 고양이 2마리를 생성하고 출력하시오.
		// 인스턴스 배열 1번
		/*
		Animal[] animals = new Animal[4];
		animals[0] = new Dog("해피", "푸들"); 
		animals[1] = new Cat("나비", 5); 
		animals[2] = new Dog("마크", "리트리버"); 
		animals[3] = new Cat("별이", 3); 
		*/
		
		// 인스턴스 배열 2번
		Animal[] animals = new Animal[] {
			new Dog("해피", "푸들"),
			new Cat("나비", 5),
			new Dog("마크", "리트리버"),
			new Cat("별이", 3)
		};
		
		
		
		// 출력 1번
		/*
		for (int i = 0; i < animals.length; i++) {
			animals[i].introduce();
			System.out.println();
		}
		*/
		
		// 출력 2번
		for (Animal a : animals) {
			a.introduce();
			System.out.println();
		}
	}
}
