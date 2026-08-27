package ejercicio03;

public class Main {

	public static void main(String[] args) {


		CuentaBancaria c1 = new CuentaBancaria("Ana", 10000);
		
		System.out.println("Titular: " + c1.getTitular() + "; Saldo inicial: " + c1.consultarSaldo());
		
		// Como el método depositar() ya devuelve un true o false no hace falta hacer la comparación 'c1.depositar(2500) == true'
		if (c1.depositar(2500)) {
			
			// '\n' es un salto de línea.
			System.out.println("Monto depositado.\nSaldo actual: " + c1.consultarSaldo());
			
		} else {
			
			System.out.println("El monto a depositar debe ser mayor que 0.");
			
		}
		
		if (c1.extraer(20000)) {
			
			System.out.println("Monto extraído.\nSaldo actual: " + c1.consultarSaldo());
			
		} else {
			
			// Como el monto a extraer es mayor al saldo actual, el método extraer() va a devolver false
			// y se va a ejecutar este println.
			System.out.println("No se pudo realizar la operación.");
			
		}
		
		// Acá, por ejemplo, hago la comparación para que vean que es lo mismo
		if (c1.extraer(3000) == true) {
			
			System.out.println("Monto extraído.\nSaldo actual: " + c1.consultarSaldo());
			
		} else {
			
			System.out.println("No se pudo realizar la operación.");
			
		}
		
		// Repito mucho código con los 'if' así que seguro es mejor hacer una función o un método.
		// Si se les ocurre una mejor manera de hacerlo avísenme.

	}

}
