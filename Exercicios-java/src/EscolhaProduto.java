
public class EscolhaProduto {
	 
	public static void main(String[] args) {
		
		double playStation = 5.340;
		double xboxOneS = 3.549;
		double pcGamer = 5.539;
		
		if(playStation < xboxOneS && playStation < pcGamer) {
			System.out.println("Playstation é o mais barato R$" + playStation);
		}else if (xboxOneS < playStation && xboxOneS < pcGamer) {
			System.out.println("O  Xbox One S é o mais barato  R$" + xboxOneS );
		}else {
			System.out.println("O PC Gamer é o mais barato R$" + pcGamer);
		}
	}
}
