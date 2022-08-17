import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print(
				"Digite [1 -> DOMINGO]; [2 -> SEGUNDA-FEIRA]; [3 -> TERÇA-FEIRA]; [4 -> QUARTA-FEIRA]; [5 -> QUINTA-FEIRA]; [6 -> SEXTA-FEIRA]; [7 -> SÁBADO]: ");
		int diaDaSemana = scanner.nextInt();

		String dia;
		
		switch (diaDaSemana) {
		case 1: dia = "DOMINGO";
			break;		
		case 2: dia = "SEGUNDA-FEIRA";
			break;		
		case 3: dia = "TERÇA-FEIRA";
			break;		
		case 4: dia = "QUARTA-FEIRA";
			break;		
		case 5: dia = "QUINTA-FEIRA";
			break;		
		case 6: dia = "SEXTA-FEIRA";
			break;		
		case 7: dia = "SÁBADO";
			break;
		default: dia = "INVÁLIDO!";
			
		}
			System.out.println("O dia escolhido é: " + dia);
		
		scanner.close();
	}
}
