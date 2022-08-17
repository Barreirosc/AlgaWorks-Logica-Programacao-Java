
public class MediaNotas {

		public static void main(String[] args) {
			
			int nota1 = 10;
			int nota2 = 7;
			int nota3 = 9;
			int nota4 = 4;
			int media = (nota1 + nota2 + nota3 + nota4) / 4;
			
			if(media >= 6) {
				System.out.println("Você está aprovado!");
			}else {
				System.out.println("Reprovado!");
			}
			
			System.out.println("Sua média é " + media);
		}
}
