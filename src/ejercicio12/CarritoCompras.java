package ejercicio12;

import java.util.ArrayList;

public class CarritoCompras {
	
	private ArrayList<ItemCarrito> items;
	
	public CarritoCompras() {
		this.items = new ArrayList<>();
	}
	
	public void agregarItem(ItemCarrito item) {
		
		this.items.add(item);
		
	}
	
	public double calcularTotal() {
		
		double total = 0;
		
		for (ItemCarrito item : items) {
			
			total += item.calcularSubtotal(); // total = total + item.calcularSubtotal();
			
		}
		
		return total;
		
	}
	
	public void mostrarDetalle() {
		
		// Recorre todos los productos
		for (ItemCarrito item : items) {
			
			item.mostrar(); // Cada producto muestra su propia información desde el método de ItemCarrito.
			
		}
		
		// Después de mostrar todos los productos calcula y muestra el total.
		System.out.println("Total: " + calcularTotal());
		
	}
	
}
