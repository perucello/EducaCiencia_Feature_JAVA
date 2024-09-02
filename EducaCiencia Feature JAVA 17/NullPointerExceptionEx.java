import java.util.HashMap;

class Aluno {
	
	private String matricula;
	private String nome;
	
	public Aluno(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}


public class NullPointerExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Aluno> listaChamada = new HashMap<>();
		
		listaChamada.put("Maria", new Aluno("123987", "Maria"));
		listaChamada.put("Carlos", null);
		listaChamada.put("Pedro", new Aluno("543000", "Pedro"));
		
		listaChamada.get("Carlos").getMatricula();

	}

}
