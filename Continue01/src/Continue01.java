
public class Continue01 {
	public static void main(String[] args) {
		// continue문
		
		for(int i=1; i<=10; i++) {
			if(i % 3 == 0) {
				continue; // break;
			}
			System.out.println(i);
			// -> 이동 지점
		}
		
	}

}
