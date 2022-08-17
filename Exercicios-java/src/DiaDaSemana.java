
public class DiaDaSemana {
	public static void main(String[] args) {
		
		int diaDaSemana = 4;
		int domingo = 1;
		int segundaFeira = 2;
		int tercaFeira = 3;
		int quartaFeira = 4;
		int quintaFeira = 5;
		int sextaFeira = 6;
		int sabado = 7;
		
		if(diaDaSemana == 1) {
			System.out.println("Domingo");
		} else if (diaDaSemana == 2) {
			System.out.println("Segunda-Feira");
		}else if (diaDaSemana == 3){
			System.out.println("Terça-Feira");
		}else if (diaDaSemana == 4) {
			System.out.println("Quarta-Feira");
		}else if (diaDaSemana == 5) {
			System.out.println("Quinta-Feira");
		}else if (diaDaSemana == 6) {
			System.out.println("Sábado");
		}else {
			System.out.println("Digite uma opção válida.");
		}
	}
}
