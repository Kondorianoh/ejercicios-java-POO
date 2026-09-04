package ejercicio12;

public class ItemCarrito {
	
	private Producto producto;
	private int cantidad;
	
	public ItemCarrito(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad < 1 ? 1 : cantidad;
	}
	
	public double calcularSubtotal() {
		return this.producto.getPrecio() * this.cantidad;
	}
	
	public void mostrar() {
		System.out.println(this.producto.getNombre() + ": $" + this.producto.getPrecio() + " x " + this.cantidad + " = " + calcularSubtotal());
	}

}
