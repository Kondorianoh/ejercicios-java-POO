package ejercicio07;

public class Autor {

	private String nombre;
	private String nacionalidad;
	
	public Autor(String nombre, String nacionalidad) {
		
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		
	}
	
	// Con estos getters ('getNombre' y 'getNacionlidad') se puede acceder a los atributos de la
	// clase Autor desde la clase Libro. (La clase Libro tiene una referencia a Autor)
	public String getNombre() {
		return this.nombre;
	}
	
	public String getNacionalidad() {
		return this.nacionalidad;
	}
	
}
