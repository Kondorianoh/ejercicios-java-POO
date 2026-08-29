package ejercicio09;

public class Main {

	public static void main(String[] args) {

		Producto mouse = new Producto("Mouse", 15000);
		Pedido pedido1 = new Pedido(mouse, 3);
		
		pedido1.mostrarResumen();
		
		System.out.println("-----------------------------");
		
		Pedido pedido2 = new Pedido(mouse, 0);
		
		pedido2.mostrarResumen();

	}

}
