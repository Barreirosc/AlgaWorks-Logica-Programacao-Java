
public class SalarioReajuste {

	public static void main(String[] args) {

		double salario = 1860.00;
		

		if (salario <= 280.00) {
			System.out.println("Salário atual: R$" + salario);
			System.out.println("Reajuste de 20%: R$" + salario * 0.20);
			System.out.println("Salário + Reajuste R$" + ((salario * 0.20) + salario));
		} else if (salario > 280.00 && salario <= 700.00) {
			System.out.println("Salário atual: R$" + salario);
			System.out.println("Reajuste de 15%: R$" + salario * 0.15);
			System.out.println("Salário + Reajuste R$" + ((salario * 0.15) + salario));
		}else if (salario > 700.00 && salario <= 1500.00) {
			System.out.println("Salário atual: R$" + salario);
			System.out.println("Reajuste de 10%: R$" + salario * 0.10);
			System.out.println("Salário + Reajuste R$" + ((salario * 0.10) + salario));
		} else if (salario > 1500.00) {
			System.out.println("Salário atual: R$" + salario);
			System.out.println("Reajuste de 5%: R$" + salario * 0.5);
			System.out.println("Salário + Reajuste: R$" + ((salario * 0.05) + salario));
		}
	}
}