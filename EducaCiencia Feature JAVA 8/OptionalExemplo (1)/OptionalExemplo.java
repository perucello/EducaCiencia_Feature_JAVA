import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Curso {
	private String nome;
	
	private List<Aluno> listaAlunos;
	
	public Curso(String nome) {
		this.nome = nome;
		this.listaAlunos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}
}

class Aluno {
	private Optional<Matricula> matricula;
	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
		//Inicializa Optional como um container vazio
		this.matricula = Optional.empty();
	}
	
	public Optional<Matricula> getMatricula() {
		return matricula;
	}
	
	public void setMatricula(Matricula matricula) {
		this.matricula = Optional.of(matricula);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}	
}

class Matricula {
	private String numero;
	
	public Matricula(String numero){
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}

public class OptionalExemplo {
	
	public static void main(String[] args) {
		
		Curso cursoAdm = new Curso("Administração");
		
		Aluno jose = new Aluno("José");
		jose.setMatricula(new Matricula("11100"));
		//Adiciona aluno ao curso
		cursoAdm.getListaAlunos().add(jose);
		
		Aluno maria = new Aluno("Maria");
		maria.setMatricula(new Matricula("12010"));
		//Adiciona aluno ao curso
		cursoAdm.getListaAlunos().add(maria);
		
		//SEM MATRÍCULA !!!
		Aluno ana = new Aluno("Ana");
		//Adiciona aluno ao curso
		cursoAdm.getListaAlunos().add(ana);
		
		Aluno paulo = new Aluno("Paulo");
		paulo.setMatricula(new Matricula("14010"));
		//Adiciona aluno ao curso
		cursoAdm.getListaAlunos().add(paulo);
		
		//Exibe o nome do aluno e o número de sua matrícula no curso
		cursoAdm.getListaAlunos().stream()
		
		.filter( a -> a.getMatricula().isPresent() )
		
		.forEach( a -> System.out.println(a.getNome() + " - " + a.getMatricula().get().getNumero() ));
		
	}
	
}
