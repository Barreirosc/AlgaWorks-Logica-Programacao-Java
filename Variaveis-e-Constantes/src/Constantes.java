import java.util.Scanner;

public class Constantes {

	static final int IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Idade: ");
		int idade = scanner.nextInt();
		
		//final int idadeMinimaParaTirarCarteira = 18;

		Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;

		if (podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar a carteira.");
		} else {
			System.out.println("Não! Ele(a) não pode tirar a carteira");
		}
			
		scanner.close();
	}

}
