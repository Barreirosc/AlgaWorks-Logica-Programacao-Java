import java.util.Scanner;

public class PossibilidadeDeAposentadoria {

	static final int IDADE_MINIMA_PARA_APOSENTAR = 55;
	static final int TEMPO_MINIMO_PARA_APOSENTAR = 25;
	
	public static void main(String[] args) {
		Scanner aposentadoria = new Scanner(System.in);

		System.out.print("Digite a idade: ");
		int idadePessoa = aposentadoria.nextInt();
		
		System.out.print("Digite o tempo de contribuição: ");
		double periodoContribuicao = aposentadoria.nextDouble();
		
		boolean idadeMinimaParaAposentar = idadePessoa >= IDADE_MINIMA_PARA_APOSENTAR;
		boolean tempoDecontribuicao = periodoContribuicao >= TEMPO_MINIMO_PARA_APOSENTAR;
		
		boolean aptoAposentadoria = idadeMinimaParaAposentar && tempoDecontribuicao;
		
		if(aptoAposentadoria) {
			System.out.println("PARABÉNS! Você está apto para aposentar. ");
		}else {
			System.out.println("Você não se enquadra na regra!");
		}
		
				
		
		aposentadoria.close();
	}

}
