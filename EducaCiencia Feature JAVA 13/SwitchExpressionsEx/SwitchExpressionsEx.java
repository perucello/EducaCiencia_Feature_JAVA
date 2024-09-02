import java.util.Scanner;

public class SwitchExpressionsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite o dia da semana: ");
		
		Scanner input = new Scanner(System.in);
		
		String dia = input.nextLine();
		
		input.close();
		
		String resultado =switch (dia) {
			case "segunda":
				yield "dia útil";
			case "terça":
				yield "dia útil";
			case "quarta":
				yield "dia útil";
			case "quinta":
				yield "dia útil";
			case "sexta":
				yield "dia útil";
			case "sábado":
				yield "final de semana";
			case "domingo":
				yield "final de semana";
			default:
				yield "dia inválido";
		};
		
		System.out.println(resultado);

	}

}
