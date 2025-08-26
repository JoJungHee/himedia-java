/*
< StringBuffer와 StringBuilder의 관계 >
1. 기능은 거의 똑같다.
2. StringBuffer에 Thread 기능을 추가하여 StringBuilder를 만듦
3. StringBuilder는 Thread 기능이 추가되어 성능의 저하가 발생하게 됨.
4. 문자열을 다룰 때 Thread 기능이 필요하다면 StringBuilder를 쓰지만,
   그렇지 않을 때는 StringBuffer를 사용하는 것이 성능을 향상시킬 수 있음.
   



*/
public class StringBuilderTest01 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		
		sb1.append("Hello Java World!");
		System.out.println(sb1);
		
		sb1.replace(6, 10, "Oracle");
		System.out.println(sb1);
		
		System.out.println(sb1.length());
		
		sb1.delete(18, 19);
		System.out.println(sb1);
	}
}
