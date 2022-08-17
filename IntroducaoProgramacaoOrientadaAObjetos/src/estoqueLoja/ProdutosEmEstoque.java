package estoqueLoja;

public class ProdutosEmEstoque {	
	
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Iphone 13 Pro Max";
		produto.quantidadeEmEstoque = 9;
		
		System.out.println("É necessário repor o estoque do produto " + produto.nome + "? " + necessarioReporEstoque(produto));
	}
	
	static boolean necessarioReporEstoque(Produto produto) {
		if(produto.quantidadeEmEstoque < Produto.QUANTIDADE_MINIMA_PERMITIDA_EM_ESTOQUE) {
			return true;
		}
		return false;	
	}
	
}
