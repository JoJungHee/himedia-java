import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("E:/temp/test01.txt");
			fw = new FileWriter("E:/temp/test01_copy02.txt");
			
			int data = 0;
			while((data = fr.read()) != -1) {
				char c = (char) data;
				System.out.println("c: " + c);
				fw.write(data);
			}
			System.out.println("복사 완료");
			
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
