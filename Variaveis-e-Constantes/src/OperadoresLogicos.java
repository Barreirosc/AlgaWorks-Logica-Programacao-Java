
public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean carrinhoMaiorQueCem = true;
		boolean periodoDePromocao = true;
		boolean jaFezCompraNaLoja = false;
		boolean pagamentoAVista = true;
		
//		boolean aplicarDesconto = carrinhoMaiorQueCem && periodoDePromocao;
//		
//		if(aplicarDesconto) {
//			System.out.println("Sim! Aplique o desconto. ");
//		}else {
//			System.out.println("Não! Você não possui desconto. ");
//		}

		//boolean aplicarDesconto = carrinhoMaiorQueCem || periodoDePromocao;
		
		//boolean aplicarDesconto = periodoDePromocao && carrinhoMaiorQueCem && jaFezCompraNaLoja;
		
		//boolean aplicarDesconto = periodoDePromocao || carrinhoMaiorQueCem || jaFezCompraNaLoja;
		
		boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQueCem || jaFezCompraNaLoja) && pagamentoAVista;
		
		if(aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto. ");
		}else {
			System.out.println("Não! Você não possui desconto. ");
		}
	}

}
