package colecao;
import java.util.*;


public class Formulario {

	public static void main(String[] args) {
		
		ArrayList<String> jogador = new ArrayList<String>();
		jogador.add("zico");
		jogador.add("didi");
		jogador.add("garrincha");
		jogador.remove(2);
		
		Vector<Integer> megasena = new Vector<Integer>();
		megasena.add(25);
		megasena.add(42);
		megasena.add(60);
		megasena.add(7);
		megasena.add(59);
		megasena.add(3);
		
		for (Integer numero : megasena) {
			System.out.print(" megasena: " + numero + " ");
		}
		
		
				
		
		
	}
	
}
