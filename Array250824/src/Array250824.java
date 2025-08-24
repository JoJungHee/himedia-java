import java.util.Scanner;

public class Array250824 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하시오.: ");
		int cnt = sc.nextInt();
		
		Student[] students = new Student[cnt];
		
		for (int i = 0; i < cnt; i++) {
			
			System.out.print("이름을 입력하시오: ");
			String name = sc.next();
			
			System.out.print("국어 점수 입력: ");
			int kor = sc.nextInt();
			
			System.out.print("영어 점수 입력: ");
			int eng = sc.nextInt();
			
			System.out.print("수학 점수 입력: ");
			int mat = sc.nextInt();
			students[i] = new Student(name, kor, eng, mat);
		}
		
		for (int i = 0; i < students.length; i++) {
			
//			students[i].showInfo();
//			System.out.println();
		}
		
		
		
		
		sc.close();
	}
}
