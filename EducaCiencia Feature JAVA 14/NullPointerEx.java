class Aluno {

	private String nome = null;
	
	public Aluno() {
		
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String n){
		this.nome = n;
	}
}

public class NullPointerEx {

	public static void main(String[] args) {

		Aluno a = new Aluno();
		
		a.getNome().substring(0, 1);

	}

}