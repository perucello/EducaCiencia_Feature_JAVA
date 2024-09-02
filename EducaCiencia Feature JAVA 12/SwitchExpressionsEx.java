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
				resultado = "dia �til";
				break;
			case "ter�a":
				resultado = "dia �til";
				break;
			case "quarta":
				resultado = "dia �til";
				break;
			case "quinta":
				resultado = "dia �til";
				break;
			case "sexta":
				resultado = "dia �til";
				break;
			case "s�bado":
				resultado = "final de semana";
				break;
			case "domingo":
				resultado = "final de semana";
				break;
			default:
				resultado = "dia inv�lido";
		}
		
		System.out.println(resultado);*/
		
		resultado = switch (dia) {
			case "segunda", "ter�a", "quarta", "quinta", "sexta" -> "dia �til";
			case "s�bado", "domingo" -> "final de semana";
			default -> "dia inv�lido";
		
		};
		
		System.out.println(resultado);

	}

}
