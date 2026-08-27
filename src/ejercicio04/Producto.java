package ejercicio04;

public class Producto {
	
	private String codigo;
	private String nombre;
	private double precio;
	private int stock;
	
	public Producto(String codigo, String nombre, double precio, int stock) {
		
		this.nombre = nombre;
		this.codigo = codigo;
		
		if (precio > 0) {
			
			this.precio = precio;
			
		} else {
			
			this.precio = 0;
			
		}
		
		if (stock > 0) {
			
			this.stock = stock;
			
		} else {
			
			this.stock = stock;
			
		}
		
	}
	
	public boolean ingresarStock(int cantidadStock) {
		
		if (cantidadStock > 0) {
			
			this.stock += cantidadStock; // this.stock = this.stock + cantidadStock;
			
			System.out.println("Ingreso realizado.\n[Ingresaron " + cantidadStock + " unidades.]");
			
			return true;
			
		} else {
			
			System.out.println("No se pudo realizar el ingreso de stock.\nLa cantidad a ingresar debe ser positiva.");
			
			return false;
			
		}
		
	}
	
	public boolean vender(int cantidadVentas) {
		
		if (cantidadVentas > 0 && cantidadVentas <= this.stock) {
			
			this.stock -= cantidadVentas; // this.stock = this.stock - cantidadVentas;
			
			System.out.println("Venta realizada.\n[Se vendieron " + cantidadVentas + " unidades.]");
			
			return true;
			
		} else {
			
			System.out.println("No se pudo realizar la venta.\nLa cantidad a vender(" + cantidadVentas + ") excede el stock actual(" + this.stock + ").");
			
			return false;
			
		}
		
	}
	
	public void mostrarInformación() {
		
		System.out.println("Producto: " + this.nombre);
		System.out.println("Código: " + this.codigo);
		System.out.println("Precio: $" + this.precio);
		System.out.println("Stock: " + this.stock + " unidades.");
		
	}
	
}
