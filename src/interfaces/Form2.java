package interfaces;

import colecao.Advogado;

public class Form2 {

	
	public static void main(String[] args) {
		
		//Só posso criar um objeto para uma variável 
		//do mesmo tipo ou de seu supertipo
		 Juiz juiz = new Juiz();
		 juiz.setNome("tião");
		 Impressora print = new Impressora();
		 print.imprime(juiz);
		 
		 Advogado ad = new Advogado();
		 ad.setNome("jose");
		 print.imprime(ad);
		 
		 Promotor pr = new Promotor();
		 pr.setNome("prom");
		 print.imprime(pr);
		 
		 
		 Medico medico = new Medico();
		 print.imprime(medico);
		
		 
		 
		 
		
		
		
		
		
		
	}
	
	
}
