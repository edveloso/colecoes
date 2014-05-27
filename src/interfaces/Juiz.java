package interfaces;

public class Juiz implements IExecutavel, Imprimivel {

	int VALOR = 10;
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public void dados(){
		System.out.println(nome);
	}
	
	public void processar(){
		System.out.println("executou"); 
	}
	
	
	
}
