import java.util.Scanner;

public class CompraMaisFrete {
	
	public static void main(String[] args) {
		Scanner compra = new Scanner(System.in);
	
		System.out.print("Digite o valor do produto: R$ ");
		Double valorProduto = compra.nextDouble();
		
		Boolean precisaCobrarFrete = valorProduto < 100;
		
		Double valorFinal = valorProduto;
		
		if(precisaCobrarFrete) {
			valorFinal += 15.0;
			System.out.println("VOCÊ NÃO TEM FRETE GRÁTIS! O valor da compra é: R$" + valorFinal);
		}else {
			System.out.println("PARABÉNS VOCÊ GANHOU FRETE GRÁTIS! O valor da compra é: R$ " + valorProduto);
		}
			
		
		
		compra.close();
	}
	
}
