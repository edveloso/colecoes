package colecao;

import interfaces.Imprimivel;

public class Advogado implements Imprimivel {

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
	
	
	
}
