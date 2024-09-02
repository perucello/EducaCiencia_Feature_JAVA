import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			TryCatchExemplo.leArquivoBlocoTryComRecurso("file.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//Antes do Java 7 - "modo tradicional"
	public static void leArquivoComBlocoTryCatchFinally(String path) throws IOException {
		String linha = "";
		
		BufferedReader br = new BufferedReader(new FileReader(path));
		
		try { 
			while((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
		}
		catch(IOException e) { 
			throw e; 
		}
		finally { 
	        if (br != null) {
	        	br.close(); 
	        }
	    }
	}
	
	//A partir do Java 9
	public static void leArquivoBlocoTryComRecurso(String path) throws IOException {
		String linha = "";
		
		BufferedReader br = new BufferedReader(new FileReader(path));
		
		try(br) { 

			while((linha = br.readLine()) != null) { 
				System.out.println(linha);
			}
		}
	}

}
