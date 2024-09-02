
public class InferenciaExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Classe interna anônima
		SomaTudo<String> somaString = new SomaTudo<>() {
			
			@Override
			public String soma(String a, String b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};
		
		System.out.println(somaString.soma("Olá", " mundo!"));

	}

}
