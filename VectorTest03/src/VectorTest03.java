import java.util.Vector;

public class VectorTest03 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		int[] a = {10, 20, 30, 40, 50};
		
		// 처음부터 데이터를 추가하는 방법
		// 1. add(값): 벡터의 맨 뒤에서 값을 추가
		System.out.println("- 순차적 데이터 추가 -");
		for (int i : a) {
			v.add(i);
		}
		System.out.println(v);
		
		// 2. remove(인덱스): 특정 인덱스의 값을 삭제
		System.out.println("- 데이터 1개 삭제 -");
		// 2번 인덱스의 값을 삭제
		v.remove(2);
		System.out.println(v);
		
		// 3. add(인덱스, 값): 특정 인덱스에 해당 값을 추가 -> 권장
		// 4. insertElementAt(값, 인덱스): 해당 값을 특정 인덱스에 추가
		// 중간에 데이터를 추가하는 방법
		System.out.println("- 비순차적 데이터 추가 -");
		// v.add(2, 60);
		v.insertElementAt(60, 2);
		System.out.println(v);
		
		
		// 4. set(변경할 인덱스, 변경할 값)
	    // 데이터를 변경
		// 40을 80으로 변경
		System.out.println("- 데이터 변경 -");
		v.set(3,  80);
		System.out.println(v);
		
		
		// 5. size(): 벡터의 크기
		System.out.println("백터의 크기: " + v.size());
		
		
		// 6. get(인덱스): 인덱스에 해당하는 값을 리턴 -> 권장
		// 7. elementAt(인덱스): 인덱스에 해당하는 값을 리턴
		System.out.println("- 인덱스에 해당하는 값을 출력 -");
		System.out.println(v.get(2));
		System.out.println(v.elementAt(2));
		
		
		// 8. firstElement(): 첫 번째 값을 리턴
		// 9. lastElement(): 마지막 값을 리턴
		System.out.println("- 첫 번째 값을 출력 -");
		System.out.println(v.get(0));
		System.out.println(v.firstElement());
		System.out.println("- 마지막 값을 출력 -");
		System.out.println(v.get(v.size()-1));
		System.out.println(v.lastElement());
		
		
		// 10. indexOf(값): 값에 대한 인덱스를 앞에서부터 구함
		// 11. lastIndexOf(값): 값에 대한 인덱스를 뒤에서부터 구함
		v.add(60);
		System.out.println("벡터의 크기: " + v.size());
		System.out.println(v);
		
		System.out.println("- 값에 대한 인덱스 출력 (앞에서부터 찾음) -");
		System.out.println(v.indexOf(60));  // 2
		
		System.out.println("- 값에 대한 인덱스 출력 (뒤에서부터 찾음) -");
		System.out.println(v.lastIndexOf(60));  // 5
		
		
		System.out.println("- 지정한 위치에서부터 찾는 경우 60의 인덱스를 출력 -");
		// 3번 인덱스부터 찾았을 때 나오는 가장 먼저 나오는 60에 대한 인덱스
		System.out.println(v.indexOf(60, 3));  // 5
		
		// 찾는 값이 없을 때는 -1을 리턴
		System.out.println(v.indexOf(90));  // -1: 찾는 값이 없음
		
		// 12. setSize(크기): 강제로 벡터의 크기를 변경
		v.setSize(4);
		System.out.println("벡터의 크기: " + v.size());
		System.out.println(v);
		
		
		// 13. clear(): 모든 벡터의 값을 삭제하고, 크기를 0으로 설정 -> 권장
		// 14. removeAllElements(): 모든 벡터의 값을 삭제하고, 크기를 0으로 설정
		// v.removeAllElements();
		 v.clear();
		System.out.println("벡터의 크기: " + v.size());
		System.out.println(v);
		
		
		
		
	}
}
