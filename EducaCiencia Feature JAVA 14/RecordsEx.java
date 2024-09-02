
interface Figura2D {
	
}

record Retangulo(double largura, double altura) implements Figura2D{
	

	public static void imprimeNome() {
		System.out.println("Olá ! Eu sou um retângulo.");
	}
}


public class RecordsEx {

	public static void main(String[] args) {

		Retangulo r1 = new Retangulo(300.0, 200.0);
		
		System.out.println(r1.largura());
		
		System.out.println(r1.altura());
		
		Retangulo.imprimeNome();
				
	}

}
