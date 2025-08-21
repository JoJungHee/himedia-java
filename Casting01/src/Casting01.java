
public class Casting01 {
	public static void main(String[] args) {
		/*
		# 이항 수치 승격: 2개의 항이 서로 다른 타입일 때의 결과는 큰 타입의 결과로 맞춤.
		
		★★★★★
		캐스팅(Casting): 강제로 데이터타입을 변경하는 것
		
		1. tot가 int형일 때 문제점 -> avg의 결과가 95.0이 됨
		
		- 해결책 1번: tot를 double형으로 선언함.
		--> 문제점: 4Byte int형으로 충분한 tot를 8Byte double로 선언하여 메모리의 낭비가 발생함.
		
		- 해결책 2번: 3으로 나누지 않고, 3.0으로 나눔
		--> 문제점: 3일 때는 int형, 3.0일 때는 double으로 메모리의 낭비가 발생함. 대개는 3으로 나누지, 3.0으로 나눈다고 하지 않음.
		
		- 해결책 3번: 평균을 계산할 때, tot를 double 캐스팅하여 사용함.
		--> 장점: 메모리의 낭비가 발생하지 않고, 캐스팅을 했다는 명시적인 효과가 있음.
		
		*/
		
		int kor = 95, eng = 96, mat = 96, tot;
		double avg;
		
		tot = kor + eng + mat;
		avg = (double)tot / 3; // 캐스팅
		
		System.out.println("총점: " + tot);
		System.out.println("평균: " + avg);
		System.out.println("-----");
		System.out.printf("총점: %d\n평균: %.2f\n", tot, avg);
		
	}
}
