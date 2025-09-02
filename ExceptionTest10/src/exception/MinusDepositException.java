package exception;

// 마이너스 입금 예외 클래스
public class MinusDepositException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public MinusDepositException(String msg) {
		super(msg);
	}
}
