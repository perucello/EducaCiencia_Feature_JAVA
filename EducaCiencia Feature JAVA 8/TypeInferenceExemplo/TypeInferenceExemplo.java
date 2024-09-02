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

class ImprimeProdutos {
	
	public static void imprime(List<Produto> lista) {
		if(!lista.isEmpty()) {
			lista.forEach(p -> System.out.println(p.getNome()));
		}
		else {
			System.out.println("Lista vazia");
		}
	}
}

public class TypeInferenceExemplo {

	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("TV 42'", 2000.00));
		lista.add(new Produto("Geladeira 470L'", 3200.00));
		lista.add(new Produto("Fogão 4 bocas", 900.00));
		lista.add(new Produto("Videogame", 1999.00));
		lista.add(new Produto("Microondas", 550.00));
		
		//Inferência de tipo na chamada ao método especializado imprime da classe ImprimeProdutos
		ImprimeProdutos.imprime(new ArrayList<>());
		
	}

}
