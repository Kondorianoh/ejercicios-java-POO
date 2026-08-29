package ejercicio10;

public class Empleado {
	
	private String nombre;
	private String legajo;
	private double sueldoBasico;
	private int horasExtra;
	
	// El 'static' significa que el atributo pertenece a la clase y no a una instancia específica. Eso hace que no se duplique
	// por cada objeto instanciado (por lo que leí, sirve para ahorrar memoria).
	// El 'final' es para declarar una constante. Garantiza que el valor que se le asigna no se pueda modificar.
	private static final double VALOR_HORA_EXTRA = 5000;
	
	// Como la constante pertenece a la clase y ya tiene un valor asignado no hay que ponerla en el constructor. Sino pisarías el valor.
	public Empleado(String nombre, String legajo, double sueldoBasico, int horasExtra) {
		
		this.nombre = nombre;
		this.legajo = legajo;
		
		// 'sueldoBasico < 0 ? 0 : sueldoBasico;' es un operador ternario. Es una forma corta de escribir el 'if-else' en una sola línea.
		// Antes del '?' va la condición que da true o false. El '?' separa la condición de los posibles resultados.
		// Los dos puntos ':' separan el caso true del false (es como el 'else'). Si la condición es true, devuelve lo que está a la izquierda de ':'.
		// Si la condición es false, devuelve lo que está a la derecha.
		// En este caso verifica si 'sueldoBasico' es menor que 0. Si es true, le asigna 0 al atributo. Si es false, le asigna el valor de 'sueldoBasico'.
		this.sueldoBasico = sueldoBasico < 0 ? 0 : sueldoBasico;
		
		// Arriba pueden usar el 'if-else' normal en vez del ternario, como hago acá abajo. Hacen exactamente lo mismo, pero uno es más cortito.
		if (horasExtra < 0) {
			
			this.horasExtra = 0;
			
		} else {
			
			this.horasExtra = horasExtra;
			
		}
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getLegajo() {
		return this.legajo;
	}
	
	public double getSueldoBasico() {
		return this.sueldoBasico;
	}
	
	public int getHorasExtra() {
		return this.horasExtra;
	}
	
	public double calcularSueldoTotal() {
		
		// Como VALOR_HORA_EXTRA está declarado como 'static' no hay que usar el 'this'. Hay que llamarlo desde la misma clase Empleado.
		return this.sueldoBasico + (this.horasExtra * Empleado.VALOR_HORA_EXTRA);
		
	}

}
