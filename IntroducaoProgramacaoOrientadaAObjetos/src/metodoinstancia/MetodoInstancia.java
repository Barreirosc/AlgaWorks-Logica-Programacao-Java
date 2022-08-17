package metodoinstancia;

public class MetodoInstancia {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();	
		cliente.primeiroNome = "João Paulo";
		cliente.ultimoNome = "Cunha";
		cliente.telefone = "6198151-5603";
		cliente.email = "joao.barreirosc@gmail.com";
		
		Cliente clienteDois = new Cliente();
		clienteDois.primeiroNome = "Gabriel";
		clienteDois.ultimoNome = "Barreiros";
		clienteDois.telefone = "6199999-9999";
		clienteDois.email = "gabriel@gmail.com";
		
		System.out.println("Nome do cliente: " + cliente.obterNomeCompleto() + " DDD: " + cliente.obterDDD());
		System.out.println("Nome do cliente: " + clienteDois.obterNomeCompleto() + " DDD: " + clienteDois.obterDDD());
		
	}

//	static String obterNomeCompletoCliente(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
//		
//		return nomeCompleto;
//	}
	
}
