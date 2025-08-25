
public class StringTest05 {
	public static void main(String[] args) {
		// 문자열을 만드는 방법 4
		char[] c = new char[] {'H', 'e', 'l', 'l', 'o'};
		String s = new String(c);
		
		System.out.println(c);
		System.out.println(s);
		System.out.println("-----");
		
		
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println("-----");
		
		// intern(): 내용이 같은 인스턴스가 각각 존재할 때, 하나의 인스턴스를 참조하도록 만들어 주는 메서드
		s1 = s1.intern();
		s2 = s2.intern();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println("-----");
	}
}
