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
		for (String elem : jogador) {
			System.out.print(elem + " ");
		}
		
		
		
		
		
				
		
		
	}
	
}
