package ejercicio09;

public class Pedido {
	
	private Producto producto;
	private int cantidad;
	
	public Pedido(Producto producto, int cantidad) {
		
		this.producto = producto;
		
		if (cantidad < 1) {
			
			this.cantidad = 1;
			
		} else {
			
			this.cantidad = cantidad;
			
		}
		
	}
	
	public double calcularTotal() {
		// Llama al getter de producto para acceder al atributo 'precio' y poder multiplicarlo por la cantidad (colaboración).
		// Retorna el resultado.
		return this.producto.getPrecio() * this.cantidad;
		
	}
	
	public void mostrarResumen() {
		
		System.out.println("Producto: " + this.producto.getNombre() + "  |  Precio unitario: " + this.producto.getPrecio());
		System.out.println("Cantidad: " + this.cantidad);
		System.out.println("Total: " + this.calcularTotal());
		
	}

}
