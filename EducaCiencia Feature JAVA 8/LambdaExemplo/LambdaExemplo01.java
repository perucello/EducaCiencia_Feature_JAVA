
interface Figura {
	
	void desenha();
}

//Classe concreta implementa a interface Figura
class Circunferencia implements Figura {

	@Override
	public void desenha() {
		System.out.println("\nClasse Circunferencia: desenha circunferência.");
	}
}


public class LambdaExemplo01 {

	public static void main(String[] args) {
		
		//Implementação sem lambda expression - utilizando classe concreta
		Circunferencia cir = new Circunferencia();
		cir.desenha();
		
		/*************************************************************/
		
		//Implementação sem lambda expression - utilizando classe anônima
		Figura fig = new Figura() {
			
			@Override
			public void desenha() {
				System.out.println("\nInterface Figura: desenha circunferência.");
			}
		};
		fig.desenha();
		
		/*************************************************************/
		
		//Lambda expression sem argumentos
		Figura fig2 = () -> System.out.println("\nLambda Expression: desenha circunferência.");
		fig2.desenha();
		
		/*************************************************************/
				
		//Lambda expression sem argumentos e com múltiplos métodos
		Figura fig3 = () -> {
			System.out.println("\nLambda Expression - múltiplos métodos:");
			System.out.println("desenha circunferência.");
		};
		fig3.desenha();
	}

}
