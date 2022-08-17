package Exercicio01;

public class produtoLoja {
	public static void main(String[] args) {
		ProdutoEstoque produto = new ProdutoEstoque();
		
		produto.nomeProduto = "Notebook Gamer";
		
		produto.quantidadeProduto = 10;
		
		System.out.println("É necessário repor o estoque do produto " + produto.nomeProduto + "? " + produto.necessarioReporEstoque());
		
	}
}
