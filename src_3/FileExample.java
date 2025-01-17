import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileExample {

	public void fCreate() throws Exception {
		File obj = new File("StudentInfc,.txt");
		// File obj2=new File("G:\\SPRING21LABS\\Labl6Sec19\\Test.txt");

		if (obj.createNewFile()) {
			System.out.println("File is created");
		} else {
			System.out.println("File already Exist");

		}
	}

	public void fWrite() throws Exception {
		FileWriter fw = new FileWriter("G:\\SPRING21LABS\\Labl6Sec19\\StudentInfo.txt");
		fw.write("Sakib " + "10 " + "4.2\n");
		fw.write("Tamim " + ":2 " + "3.2\n");
	}

	public void fRead3() {
		
		
	}
	
	

}