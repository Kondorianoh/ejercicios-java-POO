package ejercicio15;

public class Vehiculo {
	
	private String patente;
	private String modelo;
	
	public Vehiculo(String patente, String modelo) {
		this.patente = patente;
		this.modelo = modelo;
	}
	
	public String getPatente() {
		return this.patente;
	}
	
	public String getModelo() {
		return this.modelo;
	}

}
