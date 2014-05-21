package colecao;
import java.util.*;


public class Formulario {

	public static void main(String[] args) {
		
		ArrayList<String> jogador = new ArrayList<String>();
		jogador.add("zico");
		jogador.add("didi");
		jogador.add("garrincha");
		jogador.add("didi");
		//indexof retorna a posicao do elemento
		System.out.println(jogador.indexOf("didi"));
		//size tamanho do vetor
		System.out.println(jogador.size());
		System.out.println("=================");
		
		//foreach 
		for (String elem : jogador) {
			System.out.print(elem + " ");
		}
		
		//remove a posicao 3 que é didi
		System.out.println("=================");
		//foreach 
		for (String elem : jogador) {
			System.out.print(elem + " ");
		}
			
		System.out.println();
		//contains verifica se existe um determinado elmento e retorna true ou false
		System.out.println(jogador.contains("zico"));
		System.out.println(jogador.contains("pelé"));
		
		jogador.add(0, "pelé");
		//foreach 
		for (String elem : jogador) {
			System.out.print(elem + " ");
		}
		
		
		TreeSet<String> lista = new TreeSet<String>();
		lista.add("pelé");
		lista.add("zico");
		lista.add("didi");
		lista.add("garrincha");
		lista.add("didi");
		System.out.println();
		for (String listSet : lista) {
			System.out.print(listSet + " ");
		}
		System.out.println("=====");
		Aluno aluno = new Aluno("Joao", "Da silva");
		TreeSet<Aluno> alunos = new TreeSet<Aluno>();
		alunos.add(aluno);
		aluno = new Aluno("Alberto", "Zimbrao");
		alunos.add(aluno);
		aluno = new Aluno("Tereza", "Batista");
		alunos.add(aluno);
		aluno = new Aluno("Pedro", "Paulo");
		alunos.add(aluno);
		System.out.println(" ===");
		
		
		for (Aluno alu : alunos) {
			System.out.println(alu.getNome() + " " + alu.getSobrenome());
		}
		
		
	}
	
}
