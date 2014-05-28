package colecao;
import interfaces.Juiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;


public class Formulario {

	public static void main(String[] args) {
		
		ArrayList<String> jogador = new ArrayList<String>();

		ArrayList<Juiz> juizes = new ArrayList<Juiz>();
		Juiz juiz = new Juiz();
		juiz.setNome("severino");
		juizes.add(juiz);
		
		/**
		 *  Para criar uma variável, nova, preciso colocar o nome de
		 *  uma variável precedida de seu tipo.
		 *   ContaCorrente conta;
		 *   
		 *  Não posso chamar um método para um ponteiro, variável, ainda 
		 *  não instanciada. Dá erro de ponteiro nulo.
		 *   XXconta.getSaldo();
		 *  
		 *  Para criar um objeto na memória preciso chamar a palavra reservada
		 *  new sucedida pelo construtor da classe. Depois atribuo à variável.
		 *  conta = new ContaCorrente();
		 *   
		 */
		juiz = new Juiz();
		juiz.setNome("tião");
		juizes.add(juiz);
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um jogador");
		String nomeJogador = scan.nextLine();
		jogador.add(nomeJogador); 
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
		
		List<Advogado> advogados = new ArrayList<Advogado>();
		advogados = new LinkedList<Advogado>();
		advogados = new Vector<Advogado>();
		Set<Advogado> advs =  new TreeSet<Advogado>();
		
		Collection<Advogado> col = new ArrayList<Advogado>();
		col =  new LinkedList<Advogado>();
		col = new TreeSet<Advogado>();
		
		
		
		
		
		
		
	}
	
}










