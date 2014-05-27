package colecao;

public interface IExecutavel {
	
	//uma interface não pode haver variáveis 
	//de instancia. Somente constantes.
	//É dispensável escrever public static 
	//nas constantes. O compilador irá completar.
	int VALOR = 10;
	
	//uma interface somente tem métodos publicos e 
	//abstratos. Isto é sem implementação.
	//Por isso você pode omitir as palavras
	//reservadas public e abstract que eles 
	//continuarão sendo do mesmo jeito.
	public abstract void processar();

	
	
}
