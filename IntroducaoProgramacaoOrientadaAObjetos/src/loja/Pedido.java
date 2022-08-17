package loja;

public class Pedido {
	
	int codigo;
	double subTotal;
	double desconto;
	double total;
	
	double getTotal() {
		return subTotal - desconto;
	}
	
	void setTotal(double total) {
		// Não é mais necessário.
	}
	
	int getCodigo() {
		return codigo;
	}
	
	void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	double getSubtotal() {
		return subTotal;
	}
	
	void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	
	double getDesconto() {
		return desconto;
	}
	void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	
	
}
