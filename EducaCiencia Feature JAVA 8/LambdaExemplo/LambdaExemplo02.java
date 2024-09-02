import java.util.ArrayList;
import java.util.List;

class Produto {
	private String nome;
	private Double preco;
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
}

public class LambdaExemplo02 {

	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("TV 42'", 2000.00));
		lista.add(new Produto("Geladeira 470L'", 3200.00));
		lista.add(new Produto("Fogão 4 bocas", 900.00));
		lista.add(new Produto("Videogame", 1999.00));
		lista.add(new Produto("Microondas", 550.00));
		
		/*Paramêmetro: interface Consumer JDK 1.8
		 *
		 * Lambda expression com um argumento 
		 */
		lista.forEach( (p) -> System.out.println(p.getNome() + " = " + p.getPreco()) );
		
		System.out.println("*********************** Ordem crescente de preços **************************");
		
		/*Paramêmetro: interface Comparator JDK 1.2
		 * 
		 *Lambda expression com dois argumentos 
		 */
		lista.sort( (p1, p2) -> p1.getPreco().compareTo(p2.getPreco()) );
		
		lista.forEach( (p) -> System.out.println(p.getNome() + " = " + p.getPreco()) );
	}
	
}
