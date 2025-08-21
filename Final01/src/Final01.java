
public class Final01 {
	public static void main(String[] args) {
		final int a; // 상수
		
		a = 20; // 최초로 넣은 값은 상수의 값으로 인정
		
		//a = 30; // 에러: 두번째 넣은 값은 값을 바꾸려는 의도로 보기 때문에 에러가 발생함
		
		// 상수명은 모든 문자를 대문자, 단어의 연결은 _(언더바)를 사용할 것을 권장
		final double MAX_SCORE = 100;
	}

}
