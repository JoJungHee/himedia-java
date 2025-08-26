
/*
< Wrapper 클래스 >
- 실제로 존재하는 클래스가 아님
- 기본형에 대한 클래스형을 만들고, 이에 대한 틍칭으로 얘기할 때 사용
- Byte, Short, Integer, Long, Float, Double, Character, Boolean의 8개 클래스의 통칭
- 실제로 많이 사용되는 클래스: Integer, Long, Double
- java.lang 패키지에 존재
- 목적1: 자바는 객체의 세상이고, 객체의 세상에서 기본형을 객체형으로 바꾸어서 사용하기 위함.
- 목적2: 문자열을 기본형으로 바꾸어서 사용하기 위함.

*/
public class WrapperTest01 {
	public static void main(String[] args) {
		// [ 1번 ]
		// 1. 기본형을 객체형으로 바꾸는 방법 - 박싱
		int i = 10;  // 기본형
		Integer ii = new Integer(i);  // 객체형(클래스형, 참조형)으로 생성하는 것 -> 박싱(Boxing)
		
		// 2. 객체형에서 기본형의 값을 꺼내는 방법 - 박싱
		int i2 = ii.intValue();		  // 객체형 안의 기본형을 꺼내는 것 -> 언박싱(UnBoxing)
		i2 += 20;
		
		System.out.println(i2);
		System.out.println("--------");
		
		
		// [ 2번 ]
		// 오토박싱과 오토언박싱 -> 9버전에서 추가
		// 1. 기본형을 객체형으로 바꾸는 방법
		int j = 30;  // 기본형
		Integer jj = j;  // 객체형, 오토박싱(Auto-Boxing)
		
		// 2. 객체형에서 기본형에 값을 꺼내는 방법
		int j2 = jj + 40;  // 오토언박싱(Auto-UnBoxing)
		System.out.println(j2);
		
		
		
		
		
	}
}
