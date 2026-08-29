package ejercicio08;

public class Motor {

	private int cilindrada;
	private boolean encendido;
	
	public Motor(int cilindrada, boolean encendido) {
	
		this.cilindrada = cilindrada;
		this.encendido = encendido;
		
	}
	
	public int getCilindrada() {
		
		return this.cilindrada;
		
	}
	
	public void encender() {
		
		this.encendido = true;
		
	}
	
	public void apagar() {
		
		this.encendido = false;
		
	}
	
	public boolean estaEncendido() {

		return this.encendido;
		
	}
	
}
