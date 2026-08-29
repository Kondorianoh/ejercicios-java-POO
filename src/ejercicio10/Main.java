package ejercicio10;

public class Main {

	public static void main(String[] args) {

		Empleado emp1 = new Empleado("Martín", "E10", 800000, 6);
		
		System.out.println(emp1.getNombre() + "; " + emp1.getLegajo() + "; sueldo básico $" + emp1.getSueldoBasico() + "; " + emp1.getHorasExtra() + " horas extra.");
		System.out.println("Sueldo total: $" + emp1.calcularSueldoTotal());
		
		System.out.println("-------------------------------------");
		
		Empleado emp2 = new Empleado("Aragorn", "E87", 9780350, -6);
		
		System.out.println(emp2.getNombre() + "; " + emp2.getLegajo() + "; sueldo básico $" + emp2.getSueldoBasico() + "; " + emp2.getHorasExtra() + " horas extra.");
		System.out.println("Sueldo total: $" + emp2.calcularSueldoTotal());

	}

}
