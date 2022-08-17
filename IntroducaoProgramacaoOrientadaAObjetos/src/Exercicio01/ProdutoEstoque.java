package Exercicio01;

public class ProdutoEstoque {
	
	static final int QUANTIDADE_MINIMA_PERMITIDA_EM_ESTOQUE = 10;
	
	String nomeProduto;
	
	int quantidadeProduto;
	
	Boolean necessarioReporEstoque () {
		if(quantidadeProduto < QUANTIDADE_MINIMA_PERMITIDA_EM_ESTOQUE) {
			return true;
		}
		return false;	
	
	}
}