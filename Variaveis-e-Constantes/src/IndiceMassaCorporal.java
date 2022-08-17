import java.util.Scanner;

public class IndiceMassaCorporal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CÁLCULO DO ÍNDICE DE MASSA CORPORAL");
		
		System.out.print("Digite seu peso (em Kg): ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite sua altura (em m): ");
		Double altura = scanner.nextDouble();	
		
		Double alturaAoQuadrado = altura * altura;
		
		Double imc = peso / alturaAoQuadrado;
				
		System.out.println("O seu IMC é " + imc);
		
		if(imc >= 18.5 & imc <= 24.9) {
			System.out.println("Normal");
		}else if(imc >= 25.0 & imc <=29.9) {
			System.out.println("Sobrepeso");
		}else if (imc >= 30.0 & imc < 40.0) {
			System.out.println("Obesidade");
		}else if (imc >= 40.0){
			System.out.println("Obesidade Grave, PROCURE UM MÉDICO");
		}
		
		scanner.close();
	}
}
