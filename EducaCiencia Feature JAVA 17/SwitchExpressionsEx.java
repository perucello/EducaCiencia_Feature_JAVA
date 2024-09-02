
public class SwitchExpressionsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj = Integer.valueOf(11);

		String s = switch(obj) {
			case Integer i && i == 10 -> "Este eh um Integer igual a 10.";
			case Integer i -> "Este eh um Integer diferente de 10";
			case Double d -> "Este eh um Double.";
			case Boolean b -> "Este eh um Boolean";
			case null -> "Este eh um valor nulo.";
			default -> {
				System.out.println("Tipo nao definido.");
				yield "Este eh um Object";
			}
		};
		
		System.out.println(s);
	}

}
