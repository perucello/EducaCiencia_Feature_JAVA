import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Produto {
	
	private Integer codigo;
	private String nome;
	private Double preco;
	
	public Produto() {
		this.codigo = 0;
		this.nome = "";
		this.preco = 0.0;
	}

	public Produto(Integer codigo, String nome, Double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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

public class Exemplo01 {

	public static void main(String[] args) {
		
		List<Produto> listaProdutos = new ArrayList<Produto>(); 
		
		listaProdutos.add(new Produto(1000, "Geladeira 470L", 2999.00));
		listaProdutos.add(new Produto(2000, "TV UHD 50''", 3500.00));
		listaProdutos.add(new Produto(1001, "TV UHD 65''", 5000.00));
		listaProdutos.add(new Produto(3000, "Microondas 20L", 399.00));
		listaProdutos.add(new Produto(1001, "Geladeira 120L", 900.00));
		listaProdutos.add(new Produto(4000, "Computador i5 2.9Ghz 4GB 1TB HD", 2429.00));
		listaProdutos.add(new Produto(1002, "Geladeira 500L", 3100.00));
		
		
		listaProdutos.stream()
		//.takeWhile(p -> p.getNome().contains("Geladeira"))
		.dropWhile(p -> p.getNome().contains("Geladeira")) //oposto do .takeWhile
		
		.map(p -> p.getNome())
		
		.forEach(System.out::println);
	}

}
