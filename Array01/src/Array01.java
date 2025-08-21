
public class Array01 {
	public static void main(String[] args) {
		// 1번 방법
		//int[] a;        // 배열의 참조변수
		//a = new int[5]; // 실체 -> 인스턴스(instance)
		
		// 2번 방법
		// 인덱스: 0 ~ 4
		int[] a = new int[5];
		
		System.out.println(a[0]);
		
		a[1] = 10;
		a[3] = 30;
		
		System.out.println(a[1]);
		System.out.println(a[3]);
		System.out.println("-----");
		
		System.out.println("배열의 개수: " + a.length);
		//a.length = 10; final int형이므로 값을 변경할 수 없음
		
		// 반복문 사용
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
