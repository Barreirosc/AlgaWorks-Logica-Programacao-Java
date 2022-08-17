import java.util.Scanner;

public class CalculoGastoFamiliar {
	
	
	public static void main(String[] args) {
		Scanner calculo = new Scanner(System.in);
		
		System.out.println("CALCULADORA DE GASTOS!");
		
	double gastoMensal = 0.0;
		
	System.out.print("Informe o valor da conta de luz: R$ ");
	gastoMensal += calculo.nextDouble();
	
	System.out.print("Informe o valor da conta de água: R$ ");
	gastoMensal += calculo.nextDouble();
	
	System.out.print("Informe o valor da conta de telefone: R$ ");
	gastoMensal += calculo.nextDouble();
	
	System.out.print("Informe o valor da mensalidade da escola: R$ ");
	gastoMensal += calculo.nextDouble();
	
	System.out.print("Informe o valor da fatura do cartão: R$ ");
	gastoMensal += calculo.nextDouble();
	
	System.out.print("Informe os gastos com supermercado: R$ ");
	gastoMensal += calculo.nextDouble();
	
	System.out.print("O valor gasto mensal foi de: R$ " + gastoMensal);
	
	calculo.close();
	}
	
	
}
