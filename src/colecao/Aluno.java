package colecao;

public class Aluno implements Comparable<Aluno> {

	private String nome;
	private String sobrenome;
	
	
	public Aluno(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public int compareTo(Aluno o) {
		return this.sobrenome.compareTo(o.sobrenome); 
	}
	
	
	
}
