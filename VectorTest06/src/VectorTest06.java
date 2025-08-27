import java.util.Vector;

public class VectorTest06 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		// 21. capacity(): 벡터의 용량을 확인
		System.out.println("크기: " + v.size());
		System.out.println("용량: " + v.capacity());
		System.out.println("------");
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("크기: " + v.size());
		System.out.println("용량: " + v.capacity());  // 10
		System.out.println("------");
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("크기: " + v.size());
		System.out.println("용량: " + v.capacity());
		System.out.println("------");
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("크기: " + v.size());
		System.out.println("용량: " + v.capacity());  // 20 -> 용량이 2배로 늘어남
		System.out.println("------");
		
		
		// 22. trimToSize(): 벡터와 같은 크기로 용량을 맞춤
		v.trimToSize();
		System.out.println("크기: " + v.size());		 // 15 ->
		System.out.println("용량: " + v.capacity());  // 15 -> 용량이 2배로 늘어남
		System.out.println("------");
	}
}
