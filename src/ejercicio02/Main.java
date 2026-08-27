package ejercicio02;

public class Main {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo(5, 3);
		
		// Cuando se llama a un método que devuelve un valor podés asignárselo a una variable del mismo tipo y usarla.
		double area = r1.calcularArea();
		double perimetro = r1.calcularPerimetro();
		
		System.out.println("Área: " + area + "; Perímetro: " + perimetro);
		
		Rectangulo r2 = new Rectangulo(12, 8);
		
		// O podés llamar al método directamente adentro del 'System.out.println'
		System.out.println("Área: " + r2.calcularArea() + "; Perímetro: " + r2.calcularPerimetro());
		
		
	}

}
