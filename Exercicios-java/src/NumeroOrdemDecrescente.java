
public class NumeroOrdemDecrescente {
	public static void main(String[] args) {

		int numUm = 11; 
		int numDois = 5; 
		int numTres = 3; 

		if( ( numUm > numDois && numUm > numTres ) && ( numDois > numTres ) ) { 
		    System.out.println(numUm);
		    System.out.println(numDois);
		    System.out.println(numTres);
		}
		else if( ( numUm > numDois && numUm > numTres ) && ( numTres > numDois ) ) { 
		    System.out.println(numUm);
		    System.out.println(numTres);
		    System.out.println(numDois);
		}
		else if( ( numDois > numUm && numDois > numTres ) && ( numUm > numTres ) ) {
		    System.out.println(numDois);
		    System.out.println(numUm);
		    System.out.println(numTres);
		}
		else if( ( numDois > numUm && numDois > numTres ) && ( numTres > numUm ) ) { 
		    System.out.println(numDois);
		    System.out.println(numTres);
		    System.out.println(numUm);
		}
		else if( ( numTres > numUm && numTres > numDois ) && ( numUm > numDois ) ) { 
		    System.out.println(numTres);
		    System.out.println(numUm);
		    System.out.println(numDois);
		}
		else if( ( numTres > numUm && numTres > numDois ) && ( numDois > numUm  ) ) {
		    System.out.println(numTres);
		    System.out.println(numDois);
		    System.out.println(numUm);
		}
	}
}