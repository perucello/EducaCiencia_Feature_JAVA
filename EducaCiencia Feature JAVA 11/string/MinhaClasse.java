import java.util.function.Function;
import java.util.stream.Collectors;

public class MinhaClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "      ";
		String str2 = "";
		String str3 = "Java Tópicos Avançados ";

		//isBlank()
		System.out.println(str1.isBlank());
		System.out.println(str2.isBlank());
		System.out.println(str3.isBlank());
		
		/****************************************************************/
		
		String str4 = "Java\nTópicos\nAvançados";
		
		//lines()
		System.out.println(str4.lines().collect(Collectors.toList()));
		
		/****************************************************************/
		
		//repeat(n)
		System.out.println(str3.repeat(3));
				
		/****************************************************************/
	
		Function<String, String> concatena = (var s) -> s + ". ";
		
	}

}
