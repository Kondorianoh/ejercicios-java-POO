package ejercicio04;

public class Main {

	public static void main(String[] args) {

		Producto teclado = new Producto("P01", "Teclado", 25000, 10);
		
		teclado.mostrarInformación();
		System.out.println("-----------------------------------");
		teclado.vender(2);
		System.out.println("-----------------------------------");
		teclado.mostrarInformación();
		System.out.println("-----------------------------------");
		teclado.ingresarStock(5);
		System.out.println("-----------------------------------");
		teclado.mostrarInformación();
		System.out.println("-----------------------------------");
		teclado.vender(97);
		System.out.println("-----------------------------------");
		teclado.mostrarInformación();

	}

}
