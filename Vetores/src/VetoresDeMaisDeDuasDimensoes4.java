
public class VetoresDeMaisDeDuasDimensoes4 {
	public static void main(String[] args) {
		Double[] faturamentoJaneiro = new Double[] {1500.0, 2000.0, 1700.0};
		Double[] faturamentoFevereiro = new Double[] {1800.0, 2500.0, 1600.0};
		
		Double [][] faturamentoAnual = new Double[][] { faturamentoJaneiro, faturamentoFevereiro };
		
		Double [][][] faturamentoQuinquenal = new Double[][][] { faturamentoAnual };
		
		Double [][][][] faturamentoDaDecada = new Double[][][][] { faturamentoQuinquenal };
		
//		for(int i = 0; i < faturamentoAnual.length; i++) {
//			System.out.println("Mês: " + (i + 1));
//			
//			double[] mes = faturamentoAnual[i];
//			
//			for(int y = 0; y < mes.length; y++) {
//				double dia = mes[y];
//				System.out.println("Dia " + (y + 1) + ": " + dia);
//				
//			}
//		}
		
	}
}
