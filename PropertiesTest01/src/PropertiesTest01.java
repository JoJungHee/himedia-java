import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest01 {
	public static void main(String[] args) {
		// Properties
		// - 키와 값을 모두 문자열로 저장하는 특별한 맵.
		// - <K, V>를 생략하고 사용함. 
		
		// 1. Properties 생성 - 키: 이름, 값: 직업
		Properties prop = new Properties();
		
		// 2. 데이터 추가
		prop.setProperty("김동백", "사장");
		prop.setProperty("황용식", "경찰");
		prop.setProperty("노규태", "안경사");
		prop.setProperty("제시카", "모델");
		prop.setProperty("강종렬", "야구선수");
		System.out.println(prop);
		System.out.println("크기: " + prop.size());
		
		// 3-1. 중복 데이터 - 키의 중복 -> 중복을 허용하지 않음
		// - 키에 대한 값을 수정하는 방법
		prop.setProperty("제시카", "소방관");
		System.out.println(prop);
		System.out.println("크기: " + prop.size());
		
		// 3-2. 중복 데이터 - 값의 중복
		prop.setProperty("장겨울", "경찰");
		System.out.println(prop);
		System.out.println("크기: " + prop.size());
		
		// 4. 데이터 수정
		prop.setProperty("노규태", "의사");
		System.out.println(prop);
		System.out.println("크기: " + prop.size());
		
		// 5-1. 데이터 삭제 - 키를 통해서 삭제
		prop.remove("김동백");
		System.out.println(prop);
		System.out.println("크기: " + prop.size());
		
		// 5-2. 데이터 삭제 - 키와 값을 통해서 삭제
		prop.remove("황용식", "경찰");
		System.out.println(prop);
		System.out.println("크기: " + prop.size());
		System.out.println("-----");
		
		// 6-1. 확인 1
		System.out.println(prop);
		
		// 6-2. 확인 2
		prop.list(System.out);
		System.out.println("-----");
		
		// 7-1. 출력 1
		// Enumeration -> Iterator의 이전 버전
		Enumeration e = prop.propertyNames();
		while(e.hasMoreElements()) {
			String name = (String)e.nextElement(); // 키
			String job = prop.getProperty(name);   // 값
			System.out.println(name + " : " + job);
		}
		System.out.println("-----");
		
		// 7-2. 출력 2
		prop.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println("-----");
		
	}

}
