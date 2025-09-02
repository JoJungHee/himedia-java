import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 파일로부터 데이터를 읽는 클래스
// 경로: 다른 프로그래밍 언어:\ 역슬래시 , JAVA: / 슬래시
// 문제점: 한글이 깨지는 문제가 발생

public class FileInputStreamTest01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			// 파일 스트림 생성 (경로 설정)
			fis = new FileInputStream("E:/temp/test01.txt");
			
			// 파일 스트림을 사용하여 파일 읽기 -> 콘솔로 출력
			int data = 0;
			while ((data = fis.read()) != -1) {  // -1: EOF(End Of File)
				char c = (char) data;
				System.out.print(c);
			}
			
			// 파일 스트림 닫기
			fis.close();
			
			// 경로 예외
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
			// 읽출력 예외
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
