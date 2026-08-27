package ejercicio02;

public class Rectangulo {
	
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		
		// Validación --> este 'if' verifica si los parámetros base y altura son menores o iguales a cero.
		// El operador lógico '||' significa 'O'
		if (base <= 0 || altura <= 0) {
			
			// Si los valores son 0 o negativos imprime el mensaje de error.
			System.out.println("No se puede hacer los cálculos con número no positivos.");
			
		} else {
			
			// Si los valores son válidos los guarda en los atributos.
			this.base = base;
			this.altura = altura;
			
		}
	}
	
	// El 'double' después del 'public' indica que el método va a retornar un valor del tipo double(decimal).
	// Si le decís al método que tiene que retornar algo, entonces tenés que hacerlo con el 'return'.
	public double calcularArea() {
		return base * altura;
	}
	
	public double calcularPerimetro() {
		return 2 * (base + altura);
	}
}
