
public class Array02 {
	public static void main(String[] args) {
		// 1. 배열 생성하고, 바로 초기화 -> 정식
		// int[] a = new int[] {10, 20, 30, 40, 50};
		
		// 2. 배열 참조변수 선언, 초기화를 분리
		//int[] a;
		//a = new int[] {10, 20, 30, 40, 50};
		
		// 3. 배열 생성하고, 바로 초기화 -> 간단한 방법
		// ★★★ 배열을 생성하고 바로 초기화할 경우에는 new int[]을 생략할 수 있음. 
		//int[] a = {10, 20, 30, 40, 50};
		
		// 3. 배열 생성하고, 바로 초기화 -> 간단한 방법 -> 분리
		// ★★★ 배열을 생성과 초기화를 분리할 경우에는 반드시 new int[]을 써야함. 
		int[] a;
		a = new int[] {10, 20, 30, 40, 50};
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
