
public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto = "Olá Mundo!\nEste é o módulo Java 12.";
		
		String textoInvertido = texto.transform(s -> new StringBuilder(s).reverse().toString());
		
		System.out.println(textoInvertido);
	}

}
