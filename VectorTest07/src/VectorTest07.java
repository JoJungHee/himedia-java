import java.util.Vector;

/*
문제) 
- 기본 응용
1. 벡터 names를 생성하여 배열 str의 내용을 저장하고 확인하시오
2. 벡터 names에서 앤더슨 다음에 와이스를 추가히고, 확인하시오.
3. 벡터 names에서 후라도를 삭제하고, 확인하시오
4. 벡터 names에서 네일을 고영표로 변경하시오.
5. 벡터의 내용을 2가지의 for문으로 출력하시오

- 고급 응용
1번 ~ 5번 문제를 대량의 데이터가 있는 것으로 가정하고, 문제를 해결하시오.
- 해당 데이터의 인덱스를 파악할 수 없다.

 */
public class VectorTest07 {
	public static void main(String[] args) {
		String[] str = {"폰세", "앤더슨", "네일", "후라도", "임찬규"};
		
		System.out.println("♠ 기본 응용");
		
		// 1. 벡터 생성 및 데이터 추가
		Vector<String> names = new Vector<String>();
		
		
		for (String s : str) {
			names.add(s);
		}
		System.out.println(names);
		
		// 2. 앤더슨 다음에 와이스를 추가
		names.add(2, "와이스");
		System.out.println(names);
		
		
		// 3. 후라도를 삭제
		// 문자열일 때는 인덱스로 삭제, 값을 통해 삭제하는 것이 모두 가능
		// names.remove("후라도");
		names.remove("후라도");
		System.out.println(names);
		
		
		// 4. 네일을 고영표로 변경
		names.set(3, "고영표");
		System.out.println(names);
		
		// 5-1. 기본 for문
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println();
		
		// 5-2. for-in문
		for (String s : names) {
			System.out.println(s);
		}
		System.out.println("---------");
		
		
		System.out.println("♠ 고급 응용");
		
		// 1. 벡터 생성 및 데이터 추가
		Vector<String> names2 = new Vector<String>();
		
		
		for (String s : str) {
			names2.add(s);
		}
		System.out.println(names2);
		
		// 2. 앤더슨 다음에 와이스를 추가
		names2.add(names2.indexOf("앤더슨") + 1, "와이스");
		System.out.println(names2);
		
		// 3. 후라도를 삭제
		// names2.remove("후라도");
		names2.remove(names2.indexOf("후라도"));
		System.out.println(names2);
		
		// 4. 네일을 고영표로 변경
		names2.set(names2.indexOf("네일"), "고영표");
		System.out.println(names2);
		
		// 5-1. 기본 for문
		for (int i = 0; i < names2.size(); i++) {
			System.out.println(names2.get(i));
		}
		System.out.println();
		
		// 5-2. for-in문
		for (String s : names2) {
			System.out.println(s);
		}
		
		
		
		
		/*
		Vector<String> v = new Vector<String>();
		
		for (String n : str) {
			v.add(n);
		}
		System.out.println(v);
		
		v.add(2, "와이스");
		System.out.println(v);
		
		v.remove(4);
		System.out.println(v);
		
		v.set(3, "고영표");
		System.out.println(v);
		
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println();
		
		for (Object a : v) {
			System.out.println(a);
		}
		
		System.out.println("-------");
		
		
		
		String[] str2 = {"폰세", "앤더슨", "네일", "후라도", "임찬규"};
		
		Vector<String> v2 = new Vector<String>();
		
		System.out.println(v2);
		for (String n : str) {
			v2.add(n);
		}
		System.out.println(v2);
		
		v2.add(v2.indexOf("앤더슨")+1, "와이스");
		System.out.println(v2);
		
		v2.remove(v2.indexOf("후라도"));
		System.out.println(v2);
		
		v2.set(v2.indexOf("네일"), "고영표");
		System.out.println(v2);
		*/
		
		
	}
}
