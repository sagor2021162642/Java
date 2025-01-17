import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileExample {

	public void print() throws Exception {

		File obj = new File("Text.txt");

		// File obj2 = new File ("D:\\Object Oriented Programming\\Text.txt");

		if (obj.createNewFile()) {
			System.out.println("File Is Created");
		} else {
			System.out.println("File already Exist");
		}

		FileWriter fw = new FileWriter(obj);
		fw.write("Hello World");

		fw.close();

		// read

		FileReader fr = new FileReader(obj);

		Scanner input = new Scanner(fr);

		/*
		 * while(input.hasNextLine()) {
		 * 
		 * String value = input.nextLine();
		 * 
		 * System.out.println(value); }
		 */

		while (input.hasNext()) {

			String value = input.next();

			System.out.println(value);

			fr.close();
		}

	}

}
