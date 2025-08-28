import java.util.LinkedList;
import java.util.Queue;

public class QueueTest01 {
	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		// 데이터 추가
		q1.offer(10);
		q1.offer(20);
		q1.offer(30);
		System.out.println(q1);
		
		// 데이터를 꺼냄
		while (!q1.isEmpty()) {
			System.out.println(q1.poll());
		}
		System.out.println(q1);
		System.out.println("------");
		
		Queue<String> q2 = new LinkedList<String>();
		
		// 데이터 추가
		q2.offer("이익준");
		q2.offer("김준완");
		q2.offer("양석형");
		q2.offer("안정원");
		q2.offer("채송화");
		System.out.println(q2);
		
		// 데이터를 꺼냄
		while (!q2.isEmpty()) {
			System.out.println(q2.poll());
		}
		System.out.println(q2);
	}
}
