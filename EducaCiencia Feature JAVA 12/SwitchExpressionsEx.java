import java.util.Scanner;

public class SwitchExpressionsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite o dia da semana: ");
		
		Scanner input = new Scanner(System.in);
		
		String dia = input.nextLine();
		
		input.close();
		
		String resultado = "";		
		/*switch (dia) {
			case "segunda":
				resultado = "dia útil";
				break;
			case "terça":
				resultado = "dia útil";
				break;
			case "quarta":
				resultado = "dia útil";
				break;
			case "quinta":
				resultado = "dia útil";
				break;
			case "sexta":
				resultado = "dia útil";
				break;
			case "sábado":
				resultado = "final de semana";
				break;
			case "domingo":
				resultado = "final de semana";
				break;
			default:
				resultado = "dia inválido";
		}
		
		System.out.println(resultado);*/
		
		resultado = switch (dia) {
			case "segunda", "terça", "quarta", "quinta", "sexta" -> "dia útil";
			case "sábado", "domingo" -> "final de semana";
			default -> "dia inválido";
		
		};
		
		System.out.println(resultado);

	}

}
