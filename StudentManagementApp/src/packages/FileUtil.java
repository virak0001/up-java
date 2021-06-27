package packages;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileUtil {
	static FileOutputStream fileOutputStream;
	static ObjectOutputStream objOutputStream;
	//Write File
	public static void openOutputObject(String filename) throws IOException {
		fileOutputStream=new FileOutputStream(filename);
		objOutputStream=new ObjectOutputStream(fileOutputStream);
	}
	public static void writeObject(ArrayList<Student> students) throws IOException {
	
		objOutputStream.writeObject(students);
		
	}
	public static void closeOutputObject() throws IOException {

		fileOutputStream.close();
		objOutputStream.close();
	}
	
	//Read File
	public static void openInputObject(String filename) {
		
	}
	public static void readObject(Student student) {
		
	}
	public static void closeInputObject() {
		
	}
	
}
