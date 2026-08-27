package ejercicio03;

public class CuentaBancaria {
	
	private String titular;
	private double saldo;
	
	public CuentaBancaria(String titular, double saldo) {
		
		this.titular = titular;
		
		if (saldo < 0) {
			
			this.saldo = 0;
			
		} else {
			
			this.saldo = saldo;
			
		}
		
	}
	
	// Este método devuelve un valor de tipo booleano (true o false) y, además, recibe por parámetro 
	// un valor de tipo 'double' (en este caso, el monto).
	public boolean depositar(double monto) {
		
		if (monto > 0) {
			
			// Si el monto es positivo lo suma al saldo actual y devuelve true (el depósito se hizo bien).
			this.saldo += monto; // Esto es lo mismo que 'this.saldo = this.saldo + monto'
			
			return true;
			
		} else {
			
			// Si el monto no es positivo devuelve false (no se hizo el depósito).
			return false;
			
		}
		
	}
	
	public boolean extraer(double monto) {
		
		// Si el monto a extraer es mayor a 0 y es menor o igual al saldo actual, le resta el monto al saldo y devuelve true.
		// El '&&' significa 'Y'.
		if (monto > 0 && monto <= this.saldo) {
			
			this.saldo -= monto; // Esto es lo mismo que 'this.saldo = this.saldo - monto'
			
			return true;
			
		} else {
			
			// Si el monto no es positivo o supera el saldo actual devuelve false (no se hizo la extracción).
			return false;
			
		}
		
	}
	
	// Esto supongo que es lo mismo que 'getSaldo()'. Pero como el profe lo pidió de esa forma en el trabajo, lo dejé así.
	// Devuelve el sado actual.
	public double consultarSaldo() {
		
		return this.saldo;
		
	}
	
	// Devuelve el nombre del titular.
	public String getTitular() {
		
		return this.titular;
		
	}
	
}
