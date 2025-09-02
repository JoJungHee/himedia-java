import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
	public static void main(String[] args) {
		FileReader fr = null;
		
		try {
			// 파일 스트림 생성
			fr = new FileReader("E:/temp/test01.txt");
			
			// 파일 읽기 -> 콘솔로 출력
			int data = 0;
			while((data = fr.read()) != -1) {  // -1: EOS
				char c = (char) data;
				System.out.print(c);
			}
			
			// 파일 스트림 닫기
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
