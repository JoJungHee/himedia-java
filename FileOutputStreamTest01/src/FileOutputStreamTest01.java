import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


// 파일 인풋 스트림을 통해서 읽고, 파일 아웃풋 스트림으로 파일을 쓰기
// - 파일 복사
public class FileOutputStreamTest01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// 파일 스트림 생성 (경로 설정)
			fis = new FileInputStream("E:/temp/test01.txt");
			fos = new FileOutputStream("E:/temp/test01_copy.txt");

			
			// 파일 읽기 -> 파일 쓰기 (파일 복사)
			int data = 0;
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			
			// 파일 스트림 닫기
			fis.close();
			fos.close();
			System.out.println("복사 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
