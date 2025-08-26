
public class StringBufferTest04 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		
		// 4. append(): 문자열 추가 (맨 뒤에서 추가)
		sb1.append("Hello Java World!");
		System.out.println(sb1);
		
		// 5. charAt() - 인덱스에 해당하는 문자 확인
		System.out.println(sb1.charAt(6));
		System.out.println("첫 문자: " + sb1.charAt(0));
		System.out.println("마지막 문자: " + sb1.charAt(sb1.length() - 1));
		
		// 6. delete(시작 인덱스, 끝 인덱스): 문자열 삭제
		// - 시작 인덱스부터 끝 인덱스 전까지를 삭제
		// - Java를 삭제
		sb1.delete(6, 10);
		System.out.println(sb1);
		
		// 7. insert(인덱스, 문자열): 문자열 추가 (중간에서 추가)
		// - 해당 인덱스에 문자열을 추가
		sb1.insert(6, "Java");
		System.out.println(sb1);
		
		// 8. replace(): 문자열 변경
		// - Java를 Oracle로 변경
		sb1.replace(6, 10, "Oracle");
		System.out.println(sb1);
		
		// !를 ?로 변경
		System.out.println(sb1.length());
		sb1.replace(18, 19, "?");
		System.out.println(sb1);
		
		// 9. setCharAt(인덱스, 변경할 한 문자): 한 문자를 변경
		//- 인덱스에 해당하는 한 문자를 변경
		// ?를 @로 변경
		sb1.setCharAt(18, '@');
		System.out.println(sb1);
		
		
		// 10. reverse(): 문자열을 거꾸로 저장
		sb1.reverse();
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
		// 11. substring(시작 인덱스, 끝 인덱스): 문자열을 추출
		// - 시작 인덱스에서 끝 인덱스 전까지를 추출
		String s1 = sb1.substring(6, 12);
		System.out.println(s1);
		
		// 12. indexOf(): 문자열에 해당하는 인덱스를 구함
		System.out.println(sb1.indexOf("Oracle")); // 6
		System.out.println(sb1.indexOf("World"));  // 13
		
		// 13. lastIndexOf(): 문자열에 해당하는 인덱스를 뒤에서부터 찾아서 구함
		System.out.println(sb1.indexOf("l"));  	   // 2
		System.out.println(sb1.lastIndexOf("l"));  // 16
		
		// 14. 문자열의 길이를 변경
		sb1.setLength(12);
		System.out.println(sb1);
		System.out.println("길이: " + sb1.length());
		
		
		// 15. trimToSize(): 크기만큼 용량을 줄임
		System.out.println("용량: " + sb1.capacity());
		sb1.trimToSize();
		System.out.println("용량: " + sb1.capacity());
	}
}
