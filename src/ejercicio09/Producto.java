package ejercicio09;

public class Producto {
	
	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		
		this.nombre = nombre;
		
		if (precio < 0) {
			
			this.precio = 0;
			
		} else {
			
			this.precio = precio;
			
		}
		
	}
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public double getPrecio() {
		
		return this.precio;
		
	}

}
