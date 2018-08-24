import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter fileWr= new FileWriter("abc.txt", true);
			fileWr.write("City, Pune");
			fileWr.close();
			
			System.out.println("file created and data executed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
