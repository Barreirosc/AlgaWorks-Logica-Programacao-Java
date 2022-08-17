
public class EstruturaIf {

	public static void main(String[] args) {
		double emprestimo = 4000.0;
		double movimentacaoMedia = 2000.0;
		
		boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
		boolean contaTemTempoSuficienteDeAbertura = true;
		boolean temNomeLimpo = true;
		
		boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor && contaTemTempoSuficienteDeAbertura && temNomeLimpo;
		
		if(liberarEmprestimo) {
			System.out.println("Sim! Pode liberar empréstimo. ");
		}else {
			System.out.println("Não pode liberar o empréstimo. ");
		}

	}

}
