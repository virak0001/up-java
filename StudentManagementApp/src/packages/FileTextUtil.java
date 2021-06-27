package packages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileTextUtil {
	private static PrintWriter outputPW;
	public static void openOutputWriter(String filename) throws FileNotFoundException {
		outputPW=new PrintWriter(filename);
	}
	public static void writeMessage(String message) {
		outputPW.println(message);
		outputPW.flush();
	}
	public static void closeOutputWriter() {
		outputPW.close();
	}
	
	public static Scanner openScanner(String filename) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(filename));
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		return scanner;
	}
}
