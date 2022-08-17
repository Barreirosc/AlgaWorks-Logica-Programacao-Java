import java.util.Scanner;

public class CalcularQuadradoDeUmNumero {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calculando o quadrado de um número");
		
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		
		int numeroAoQuadrado = numero * numero;
		
		System.out.println("O resultado de " + numero + " ao quadrado é " + numeroAoQuadrado);
		
		scanner.close();
	}
}
