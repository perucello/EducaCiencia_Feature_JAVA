import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Anotação customizada e que pode ser repetida no código
@Repeatable(Voltagens.class) 
@interface Voltagem{
	String tensao();
}

//Container da anotação Voltagem
@Retention(RetentionPolicy.RUNTIME)  
@interface Voltagens{
	Voltagem[] value();
}

//Repetindo a anotção
@Voltagem(tensao = "110")
@Voltagem(tensao = "220")
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


public class AnnotationsExemplo {

	public static void main(String[] args) {
		//Obter os tipos de anotações
		Voltagem[] volts = Produto.class.getAnnotationsByType(Voltagem.class);  
		
        for (Voltagem v : volts) {    // Iterating values  
            System.out.println(v.tensao());  
        }  
	}

}
