
// 문자열의 추가, 수정, 삭제에 특화된 클래스
public class StringBufferTest03 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("ABC");
		
		// 1. StringBuffer를 String형으로 변경
		
		
		// 2. append(): 문자열의 연결
		sb1.append("DEF");
		sb1.append(10);
		sb1.append(3.14);
		sb1.append(true);
		System.out.println(sb1);
		
		
		// 메서드 체이닝 (method chaining) -> String 클래스는 불가능
		sb1.append("XYZ").append(false).append(20).append(0.5);
		System.out.println(sb1);
		
		
		// 3. length(): 문자열의 크기
		// 4. capacity(): 초기용량
		StringBuffer sb2 = new StringBuffer();
		System.out.println("크기: " + sb2.length());		  // 0
		System.out.println("초기용량: " + sb2.capacity());  // 16
		
		sb2.append("Hello Java");
		System.out.println("크기: " + sb2.length());		  // 10
		System.out.println("초기용량: " + sb2.capacity());  // 16
		
		sb2.append("World Wide");
		System.out.println("크기: " + sb2.length());		  // 20
		System.out.println("초기용량: " + sb2.capacity());  // 34 -> 18이 늘어남
		
		sb2.append("Beautiful Korea Seoul");
		System.out.println("크기: " + sb2.length());		  // 41
		System.out.println("초기용량: " + sb2.capacity());  // 70 -> 36이 늘어남
		
		sb2.append("Beautiful Korea Seoul Sungnam Bravo!!!");
		System.out.println("크기: " + sb2.length());		  // 79
		System.out.println("초기용량: " + sb2.capacity());  // 142 -> 72이 늘어남
		
	}
}
