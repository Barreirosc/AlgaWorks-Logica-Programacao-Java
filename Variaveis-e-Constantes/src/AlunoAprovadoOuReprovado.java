import java.util.Scanner;

public class AlunoAprovadoOuReprovado {
	
	static final int MEDIA_PARA_PASSAR_DE_AN0 = 70;
	
	public static void main(String[] args) {
		Scanner aluno = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno(a): ");
		Double notaAluno = aluno.nextDouble();
		
		Boolean alunoAprovado = notaAluno >= MEDIA_PARA_PASSAR_DE_AN0;
		
		if(alunoAprovado) {
			System.out.println("Aluno aprovado!");
		}else {
			System.out.println("Aluno reprovado!");
		}
		
		aluno.close();
	}	
}
