package ejercicio14;

public class Paciente {
	
	private String nombre;
	private String dni;
	
	public Paciente(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDni() {
		return this.dni;
	}

}
