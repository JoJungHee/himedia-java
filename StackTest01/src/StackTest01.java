import java.util.Stack;

public class StackTest01 {
	public static void main(String[] args) {
		Stack<Integer> st1 = new Stack<Integer>();
		
		// 데이터를 저장
		st1.push(10);
		st1.push(20);
		st1.push(30);
		System.out.println(st1);
		
		
		// 데이터를 꺼냄
		while (!st1.isEmpty()) {
			System.out.println(st1.pop());  // 꺼내고 나면 삭제
		}
		System.out.println(st1);
		System.out.println("------");
		
		Stack<String> st2 = new Stack<String>();
		
		// 데이터를 저장
		st2.push("이익준");
		st2.push("김준완");
		st2.push("양석형");
		st2.push("안정원");
		st2.push("채송화");
		
		System.out.println(st2);
		
		// 데이터를 꺼냄
		while (!st2.isEmpty()) {
			System.out.println(st2.pop());
		}
		
		System.out.println(st2);
	}
}
