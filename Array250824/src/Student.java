
public class Student {
	String name;
	int kor;
	int eng;
	int mat;
//	int tot;
//	double avg;
//	char grd;
//	int rank;
	
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	
	
	// 메서드
	public void showInfo(){
		System.out.printf("이름: %4s | 국어: %3d | 영어 %3d | 수학: %3d | 총점: %3d | 평균: %.2f | 등급: %1s", name, kor, eng, mat, calcTot(), calcAvg(), calcGrd());
	}
	
	public String toString() {
		return "";
	}
	
	// tot
	public int calcTot() {
		return kor + eng + mat;
	}
	// avg
	public double calcAvg() {
		return calcTot() / 3;
	}
	// grd
	public char calcGrd() {
		switch ((int)(calcAvg() / 10)) {
		case 10:
		case 9:
			return 'A';
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';
		default:
			return 'F';
		}
	}
	// rank
}
