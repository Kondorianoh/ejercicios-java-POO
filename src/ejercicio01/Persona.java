package ejercicio01;

public class Persona {
	
	// Encapsulamiento ---> Acá se usa 'private' para proteger los atributos y que solo esta clase pueda
	// modificarlos directamente.
	private String nombre;
	private int edad;
	
	// Constructor: Es el método que inicia el objeto. Le da valores iniciales a los atributos cuando se 
	// instancia con el 'new'.
	public Persona(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	// El 'void' después del 'public' quiere decir que el método no va a retornar nada.
	public void presentarse() {
		System.out.println("Mi nombre es " + this.nombre + " y tengo " + this.edad + " años.");
	}
	
	public void cumplirAnios() {
		// El '++' incrementa en 1 el valor del atributo edad.
		// 'this.edad ++;' es exactamente lo mismo que 'this.edad = this.edad + 1;'
		this.edad ++;
	}
	
}
