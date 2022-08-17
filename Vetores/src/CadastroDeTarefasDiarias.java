import java.util.Scanner;

public class CadastroDeTarefasDiarias {
	
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		
		String[] tarefas = new String[5];
		
		for(int i = 0; i < tarefas.length; i++) {
			System.out.print("Tarefa " + i + ": ");
			tarefas[i] = scanner.nextLine();
		}
		
		System.out.println("Suas Tarefas são: ");
		for(int i= 0; i < tarefas.length; i++) {
			System.out.println("[" + i + "] " + tarefas[i]);
		}
		
			
		
		//JEITO QUE CONSEGUI RESOLVER.
//		
//		System.out.println("ADICIONE SUAS TAREFAS DIÁRIAS MAIS IMPORTANTES");
//		System.out.println("===============================================");
//		
//		String[] tarefas = new String[5];
//		
//		System.out.print("Digite sua primeira tarefa diária: ");
//		tarefas[0] = scanner.nextLine();
//		
//		System.out.print("Digite sua segunda tarefa diária: ");
//		tarefas[1] = scanner.nextLine();
//		
//		System.out.print("Digite sua terceira tarefa diária: ");
//		tarefas[2] = scanner.nextLine();
//		
//		System.out.print("Digite sua quarta tarefa diária: ");
//		tarefas[3] = scanner.nextLine();
//		
//		System.out.print("Digite sua quinta tarefa diária: ");
//		tarefas[4] = scanner.nextLine();
//		
//		System.out.println("===========================================");
//		
//		for(int i = 0; i < tarefas.length; i++) {
//			System.out.println("[" + i + "] " + tarefas[i]);
//		}
		
		
		
		scanner.close();
	}
}
