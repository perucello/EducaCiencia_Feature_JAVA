import java.util.List;

public class VarExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var listaDeFrutas = List.of("banana", "ma��", "abacaxi");
		
		//Enhanced For
		for(var fruta : listaDeFrutas) {
			System.out.println(fruta);
		}
		
		//�ndice la�o For
		for(var i=0; i < listaDeFrutas.size(); i++) {
			System.out.println(listaDeFrutas.get(i));
		}
		
		var e = new ArrayIndexOutOfBoundsException();

	}

}
