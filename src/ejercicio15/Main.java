package ejercicio15;

public class Main {

	public static void main(String[] args) {
		
		double total;
		Estacionamiento estacionamiento = new Estacionamiento();
		Vehiculo vehiculo1 = new Vehiculo("AA123BB", "Toyota Corolla");
		Vehiculo vehiculo2 = new Vehiculo("AA123BB", "Toyota Corolla");
		Vehiculo vehiculo3 = new Vehiculo("OUTATIME", "DeLorean");
		
		estacionamiento.registrarIngreso(vehiculo1);
		estacionamiento.registrarIngreso(vehiculo2);
		estacionamiento.registrarIngreso(vehiculo3);
		
		estacionamiento.mostrarDetalles();
		
		total = estacionamiento.registrarEgreso("AA123BB", 4);
		
		if (total != 1) {
			System.out.println("Total: " + total);
		}
		
		estacionamiento.mostrarDetalles();
		
	}

}
