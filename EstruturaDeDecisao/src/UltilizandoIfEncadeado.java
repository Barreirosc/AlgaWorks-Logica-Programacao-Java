import java.util.Scanner;

public class UltilizandoIfEncadeado {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe seu peso: ");
		double peso = scanner.nextDouble();
				
		boolean pesoLeve = (peso <= 60) && (peso > 0);
		boolean pesoMedio = (peso > 60) && (peso <=90);
		boolean pesoPesado = peso > 90;
		
		if(pesoLeve) {
			System.out.println("Lutador(a) é peso leve. ");
		}else if (pesoMedio) {
			System.out.println("Lutador(a) é peso médio. ");
		}else if (pesoPesado) {
			System.out.println("Lutador(a) é peso pesado. ");
		}else {
			System.out.println("O lutador(a) não se encaixa em nenhuma categoria. ");
		}
		
		
		scanner.close();

	}

}
