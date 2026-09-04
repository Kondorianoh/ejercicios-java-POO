package ejercicio12;

public class Main {

	public static void main(String[] args) {

		Producto teclado = new Producto("Teclado", 25000);
		Producto mouse = new Producto("Mouse", 15000);
		
		ItemCarrito itemTeclado = new ItemCarrito(teclado, 1);
		ItemCarrito itemMouse = new ItemCarrito(mouse, 2);
		
		CarritoCompras carrito = new CarritoCompras();
		
		carrito.agregarItem(itemTeclado);
		carrito.agregarItem(itemMouse);
		
		carrito.mostrarDetalle();

	}

}
