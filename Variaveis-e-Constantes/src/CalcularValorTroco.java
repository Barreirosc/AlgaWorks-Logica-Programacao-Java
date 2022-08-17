import java.util.Scanner;

public class CalcularValorTroco {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Digite o valor do prodruto: R$");
			Double valorProduto = scanner.nextDouble();
			
			System.out.print("Digite o valor passado pelo cliente: R$");
			Double valorPassadoPeloCliente = scanner.nextDouble();
			
			Double resultado = valorPassadoPeloCliente - valorProduto;
			
			System.out.println("Valor de troco é R$" + resultado);
			
			scanner.close();
		}
}
