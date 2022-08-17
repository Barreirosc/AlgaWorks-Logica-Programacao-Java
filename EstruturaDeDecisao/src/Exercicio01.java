import java.util.Scanner;

public class Exercicio01 {
	
	static final double  NOTA_MINIMA_PARA_CADA_MATERIA = 60;
	static final double NOTA_MINIMA_PARA_SER_APROVADO = 150;
	
	public static void main(String[] args) {
		Scanner notaConcurso = new Scanner(System.in);
	
	System.out.print("Nota de matemática: ");
	double notaMatematica = notaConcurso.nextDouble();
	
	System.out.print("Nota de português: ");
	double notaPortugues = notaConcurso.nextDouble();
	
	double somaDasNotas = notaMatematica + notaPortugues;
	
	boolean notaFinal = (notaMatematica >= NOTA_MINIMA_PARA_CADA_MATERIA) && (notaPortugues >= NOTA_MINIMA_PARA_CADA_MATERIA) && (somaDasNotas >= NOTA_MINIMA_PARA_SER_APROVADO);
	
	if(notaFinal) {
		System.out.println("PARABÉNS! CANDIDATO APROVADO. ");
	}else {
		System.out.println("CANDIDATO REPROVADO! ");
	}
	
	
	
	
	
	notaConcurso.close();
	}
}
