package encapsulamento;

public class encapsulamento {
	public static void main(String[] args) {
//		Cliente cliente = new Cliente();
//		
//		cliente.nome = "Gabriel";
//		cliente.telefone = "61999999999";
//		
//		System.out.println("Nome do cliente: " + cliente.nome);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Gabriel Barreiros");
		cliente.setTelefone("61999999999");
		
		System.out.println("Nome Cliente: " + cliente.getNome());
		System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
		System.out.println("Primeiro último: " + cliente.getUltimoNome());
		
	}
}
