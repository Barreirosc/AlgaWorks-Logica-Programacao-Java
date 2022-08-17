package loja;

public class Exercicio02 {
	public static void main(String[] args) {
		Pedido pedido = new Pedido();

		pedido.codigo = 1;
		pedido.subTotal = 100.0;
		pedido.desconto = 5.0;

		System.out.println("Código: " + pedido.getCodigo() + ", Subtotal: " + pedido.getSubtotal() + ", Desconto: "
				+ pedido.getDesconto() + ", Total: " + pedido.getTotal());

	}
}
