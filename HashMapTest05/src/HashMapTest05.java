import java.util.HashMap;
import java.util.Scanner;

/*
문제)
1. 키는 한글 단어, 값은 키에 대한 영어 단어를 저장하는 HashMap인 map을 생성하시오.
2. 맵에 동물 단어 10개를 저장하시오.
3. 키보드로 동물 단어를 한글로 입력하여, 영어로 알려주는 사전 프로그램을 작성하시오
4. 그만할 때까지 계속 반복되도록 프로그래밍 하시오


*/

public class HashMapTest05 {
	public static void main(String[] args) {
		// 1. 
//		HashMap<String, String> animals = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> dict= new HashMap<String, String>();
		
		// 2. 데이터 추가
		String[] korWord = {"고양이", "개", "새", "개구리", "곰", "코끼리", "원숭이", "토끼", "호랑이", "사자"};
		String[] engWord = {"Cat", "Dog", "Bird", "Frog", "Bear", "Elephant", "Monkey", "Rabbit", "Tiger", "Lion"};
		
		for (int i = 0; i < korWord.length; i++) {
			dict.put(korWord[i], engWord[i]);
		}
		System.out.println(dict);
		
		System.out.println("한글 동물 단어를 입력하면 영어로 알려주는 프로그랩입니다.");
		String yn = "";
		do {
			System.out.print("한글 동물 단어를 입력하세요: ");
			String kor = sc.next();
			String eng = dict.get(kor);
			if (eng != null) {
				System.out.printf("%s의 영어 단어는 %s입니다.\n", kor, eng);
			} else {
				System.out.printf("%s에 해당하는 영어 단어는 사전에 없습니다.\n", kor);
			}
			
			
			System.out.print("계속해서 다른 단어를 찾아 볼까요? (Y/N) ");
			yn = sc.next(); 
		} while (yn.charAt(0) == 'Y' || yn.charAt(0) == 'y');
		System.out.println(" 영어 동물 단어 맞추기 프로그램을 종료하였습니다.");
		
		
//		animals.put("고양이", "Cat");
//		animals.put("개", "Dog");
//		animals.put("새", "Bird");
//		animals.put("개구리", "Frog");
//		animals.put("곰", "Bear");
//		animals.put("코끼리", "Elephant");
//		animals.put("원숭이", "Monkey");
//		animals.put("토끼", "Rabbit");
//		animals.put("호랑이", "Tiger");
//		animals.put("사자", "Lion");
//		System.out.println(animals);
//		
//		
//		Scanner sc = new Scanner(System.in); 
//        String search;
//
//        do {
//            System.out.print("동물 이름 입력 (종료: x 또는 X): ");
//            search = sc.next();
//
//            if (search.equals("x") || search.equals("X")) {
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            }
//
//            String name = animals.get(search);
//
//            if (name != null) {
//                System.out.println(name);
//            } else {
//                System.out.println("해당하는 동물을 찾을 수 없습니다.");
//            }
//
//        } while (true);

        sc.close();
	}
}
