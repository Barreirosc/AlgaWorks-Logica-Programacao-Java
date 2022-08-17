import java.util.Scanner;

public class ValorProdutoQuantidade {
	
	public static void main(String[] args) {
		Scanner produto = new Scanner(System.in);
		
		System.out.print("Digire o valor do produto: R$");
		double valorProduto = produto.nextDouble();
		
		System.out.print("Digite a quantidade de produtos que dejesa comprar: ");
		int quantidadeProduto = produto.nextInt();
		
		double subTotal = valorProduto * quantidadeProduto;
		boolean maiorIgualADez = quantidadeProduto >= 10;
		
		double percentualDeDesconto = 0.0;
		
		if(maiorIgualADez) {
			percentualDeDesconto = 10.0;
		}		
		double desconto = (subTotal * percentualDeDesconto) / 100;
		double valorTotalComDesconto = subTotal - desconto;
		
		System.out.println("O valor total de sua compra e de: R$" + valorTotalComDesconto);
		
		produto.close();
	}
}
