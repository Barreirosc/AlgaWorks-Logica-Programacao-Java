
public class TurnoEstudos {
	
	public static void main(String[] args) {
		
		String turno ="M";
		String matutino = "M";
		String vespertino = "V";
		String noturno = "N";
		
		if (turno == "M") {
			System.out.println("Bom dia!");
		}else if (turno == "V") {
			System.out.println("Boa Tarde!");
		}else if (turno == "N") {
			System.out.println("Boa Noite!");
		}else {
			System.out.println("Valor inválido!");
		}
	}
}
