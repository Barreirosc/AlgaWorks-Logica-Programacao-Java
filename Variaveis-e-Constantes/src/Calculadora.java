import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner calculadora = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		Double primeiroNumero = calculadora.nextDouble();
		
		System.out.print("Digite qual operação aritmética irá usar: [1 -> Soma]; [2 -> Subtração]; [3 -> Multiplicação]; [4 -> Divisão]; [5 -> Módulo]: ");
		Integer operacaoASerUsada = calculadora.nextInt();
		
		System.out.print("Digite o segundo número: ");
		Double segundoNumero = calculadora.nextDouble();
				
		
		//COMO EU RESOLVI
		
		Double resultado = null;
		
		if(operacaoASerUsada.equals(1)) {
			 resultado = primeiroNumero + segundoNumero;
			 System.out.println("O resultado da soma é: " + resultado);
		}else if(operacaoASerUsada.equals(2)) {
			 resultado = primeiroNumero - segundoNumero;
			 System.out.println("O resultado da subtração é: " + resultado);
		}else if (operacaoASerUsada.equals(3)) {
			 resultado = primeiroNumero * segundoNumero;	
			 System.out.println("O resultado da multiplicação é: " + resultado);
		}else if(operacaoASerUsada.equals(4)) {
			 resultado = primeiroNumero / segundoNumero;
			 System.out.println("O resultado da divisão é: " + resultado);
		}else if (operacaoASerUsada.equals(5)) {
			 resultado = primeiroNumero % segundoNumero;
			 System.out.println("O resultado do módulo é: " + resultado);
		}else {
			System.out.println("Digite uma opção válida!");
		}
		
		//Resolução professor
		
//		Double resultado = null;
//		
//		if(operacaoASerUsada.equals(1)) {
//			resultado = primeiroNumero + segundoNumero;
//		}else if(operacaoASerUsada.equals(2)) {
//			resultado = primeiroNumero - segundoNumero;
//		}else if(operacaoASerUsada.equals(3)) {
//			resultado = primeiroNumero * segundoNumero;
//		}else if(operacaoASerUsada.equals(4)) {
//			resultado = primeiroNumero / segundoNumero;
//		}else if(operacaoASerUsada.equals(5)) {
//			resultado = primeiroNumero % segundoNumero;
//		}
//		
//		System.out.println("Resultado: " + resultado);
		
		calculadora.close();
	}
	
	
}




