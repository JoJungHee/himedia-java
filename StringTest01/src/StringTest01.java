
public class StringTest01 {
	public static void main(String[] args) {
		// 문자열을 만드는 방법 1
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "ABC"; // 새로 만들어진 실체를 참조하는 것이 아니라, s1의 인스턴스를 참조하게 됨
		String s4 = "DEF";
		
		// ★★★
		// JVM(Java Virtual Machine, 자바 가상 머신)
		// - Garbage Collector가 Garbage Collection을 수행.
		// - 버려지는 메모리(참조가 되지 않는 메모리)를 회수하여 다시 사용할 수 있도록 함
		
		s4 = s1; // s1이 참조하는 곳을 s4가 참조하도록 함
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("-------");
		
		// 참조를 확인하는 방법
		// ★★★
		// 해시코드(hash code) - 각 인스턴스가 가지는 고유한 아이디 
		// 1. 값에 대한 비교
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println("-------");
		
		// 2. 참조에 대한 비교
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
	}
}
