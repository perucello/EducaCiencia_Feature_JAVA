import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MismatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f1 = new File ("texto1.txt");
		
		File f2 = new File ("texto2.txt");
		
		
		try {
			long resultado = Files.mismatch(f1.toPath(), f2.toPath());
			
			System.out.println(resultado);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
