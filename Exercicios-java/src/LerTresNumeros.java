
public class LerTresNumeros {
	public static void main(String[] args) {

		int numUm = 7;
		int numDois = 8;
		int numTres = 25;
		
		if(numUm > numDois && numUm > numTres) {
			System.out.println("A opção Um é a maior: " + numUm); 
		}else if (numDois > numUm && numDois > numTres) {
			System.out.println("A opção Dois é a maior: " + numDois);
		}else
			System.out.println("A opção Três é a maior: " + numTres);
	}
}