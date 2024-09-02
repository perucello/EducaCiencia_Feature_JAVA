import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class LeArquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String caminho = "meutexto.txt";
		
		/*********************************************************************************/
		
		/*
		 * Leitura fluxos de caracteres (string).
		 * Maneira mais simples até então. 
		 * Indicado para poucas operações de leitura.
		 */
		
		try(FileReader myReader = new FileReader(caminho)) { 
			int i;
			
	        while((i=myReader.read())!=-1) //-1 = EOF   
	        	System.out.print((char)i);   
	        
	        System.out.println();
		} 
		catch (IOException e) {
		}
		
		/*********************************************************************************/
		
		/*
		 * Lê o texto em uma stream de entrada, usando mecanismo de buffer
		 * para leitura mais eficiente de caracteres.
		 */
		
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(caminho))) {
			String s;
			
			while ((s = bufferedReader.readLine()) != null) { //null = EOF
				System.out.println(s);
			}
		} 
		catch (IOException e) {
		}
		
		/*********************************************************************************/
		
		String s;
		try {
			s = Files.readString(new File(caminho).toPath(), StandardCharsets.ISO_8859_1);
			System.out.println(s);
		} 
		catch (IOException e) {
			System.out.println(e);
		}
		
		
	}

}
