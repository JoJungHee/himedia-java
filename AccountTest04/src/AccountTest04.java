
public class AccountTest04 {
	public static void main(String[] args) {
		Account john = new Account("John", "123456", 1000);
		Account mary = new Account("Mary", "654321", 500);
		Account jane = new Account("Jane", "987654", 2000);
		

		// 출력
		System.out.println("◆ John의 계좌");
		john.showAccount();
		System.out.println();
		
		System.out.println("◆ Mary의 계좌");
		mary.showAccount();
		System.out.println();
		
		System.out.println("◆ Jane의 계좌");
		jane.showAccount();
		System.out.println();
		System.out.println("--------------");
		
		System.out.println(john.toString());
		System.out.println(mary.toString());
		System.out.println(jane.toString());
		System.out.println("--------------");
		
		// warning: 권장하지 않는 방법, 각 인스턴스에 속한 인스턴스 메서드라는 착각을 하게 만듦
//		System.out.println("생성된 계좌의 개수: " + john.getCount());
//		System.out.println("생성된 계좌의 개수: " + mary.getCount());
//		System.out.println("생성된 계좌의 개수: " + jane.getCount());
		
		// ★★★★★
		// 권장: static way(static으로 선언된 멤버를 사용하는 방법)
		// 클래스명.클래스메서드명
		System.out.println("생성된 계좌의 개수: " + Account.getCount());
		
		
		
	}
}
