
public class VarArgs01 {
	
	static int addValue(int... a) {
		int tot = 0;
		for (int i : a) {
			tot += i;
		}
		return tot;
	}
	
	
	public static void main(String[] args) {
		System.out.println(addValue(10));
		System.out.println(addValue(10, 20));
		System.out.println(addValue(10, 20, 30));
		System.out.println(addValue(10, 20, 30, 40));
//		System.out.println(addValue(10, 20, 3.5, 40));  // 에러: 정수형의 가변 매개변수
	}
}
