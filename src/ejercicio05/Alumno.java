package ejercicio05;

public class Alumno {
	
	private String nombre;
	private String legajo;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public Alumno(String nombre, String legajo, double nota1, double nota2, double nota3) {
		
		this.nombre = nombre;
		this.legajo = legajo;
		// En vez de validar acá con un 'if' para cada una de las 3 notas creé método 'validarNota()' que se encarga de eso.
		// Si el valor de la nota es válida, la asigna al atributo. Si no es válida, le asigna el valor 0 al atributo.
		this.nota1 = validarNota(nota1);
		this.nota2 = validarNota(nota2);
		this.nota3 = validarNota(nota3);
		
	}
	
	public double calcularPromedio() {
		
		// Almacené el promedio en una variable para devolverla, pero se puede devolver la cuenta directamente.
		double promedio = (this.nota1 + this.nota2 + this.nota3) / 3;
		
		return promedio;
	}
	
	public boolean estaAprobado() {
		
		// Toma el valor que devuelve el metodo 'calcularPromedio' y verifica si es mayor o igual a 6.
		// Si es mayor o igual a 6 devuelce true. Si no devuelve false.
		if (calcularPromedio() >= 6) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	// Cree este método para evitar repetir código (usaba 3 'if' para las 3 notas) en el constructor.
	// Recibe la nota por parámetro, verifica si está entre 0 y 10 incluidos y devuelve esa nota si es así. Si no devuelve 0.
	public double validarNota(double nota) {
		
		if (nota >= 0 && nota <= 10) {
			
			return nota;
			
		} else {
			
			return 0;
			
		}
	}
	
	public void mostrarDatos() {
		
		System.out.println("Alumno/a: " + this.nombre);
		System.out.println("Legajo: " + this.legajo);
		System.out.println("Notas: " + this.nota1 + ", " + this.nota2 + " y " + this.nota3);
		
		if (estaAprobado()) {
			
			// Si el valor devuelto por el método 'estáAprobado()' es 'true', imprime este mensaje.
			System.out.println(this.nombre + " aprobó con promedio de " + calcularPromedio());
			
		} else {
			
			// Si es 'false' imprime este.
			System.out.println(this.nombre + " desaprobó con promedio de " + calcularPromedio());
			
		}
		
	}
	
}
