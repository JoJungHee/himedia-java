package array250824;
//import java.util.Scanner;

public class Array250824 {
	public static void main(String[] args) {
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("학생수를 입력하시오.: ");
//		int cnt = sc.nextInt();
		
//		Student[] students = new Student[cnt];
//		
//		for (int i = 0; i < cnt; i++) {
//			
//			System.out.print("이름을 입력하시오: ");
//			String name = sc.next();
//			
//			System.out.print("국어 점수 입력: ");
//			int kor = sc.nextInt();
//			
//			System.out.print("영어 점수 입력: ");
//			int eng = sc.nextInt();
//			
//			System.out.print("수학 점수 입력: ");
//			int mat = sc.nextInt();
//			students[i] = new Student(name, kor, eng, mat);
//		}

		Student[] students = new Student[] {
				new Student("오이영", 90, 80, 25),
				new Student("표남경", 60, 50, 60),
				new Student("엄재일", 70, 80, 70),
				new Student("김사비", 50, 55, 47),
				new Student("장겨울", 90, 89, 96),
		};
		
		int[] rank = new int[students.length];
		for (int i = 0; i < students.length; i++) {
			students[i].showInfo();
			
			rank[i] = 1;
			for (int j = 0; j < students.length; j++) {
				if (students[i].calcAvg() < students[j].calcAvg()) {
					++rank[i];
				}
			}
			System.out.printf(" | 석차: %2d", rank[i]);
			System.out.println();
		}
//		sc.close();
	}
}
