package ejercicio14;

public class Main {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente("Ana", "30.111.222");
		Paciente paciente2 = new Paciente("Funes", "12.101.232");
		Profesional pro1 = new Profesional("Dra. Pérez", "Clínica");
		Turno turno1 = new Turno(paciente1, pro1, "20/08/2026 a las 15:00");
		Turno turno2 = new Turno(paciente2, pro1, "04/09/2032 a las 17:35");
		
		turno1.mostrarDetalle();
		turno1.confirmar();
		System.out.println("----------------------------");
		turno1.mostrarDetalle();
		
		System.out.println("----------------------------");
		
		turno2.mostrarDetalle();
		turno2.cancelar();
		System.out.println("----------------------------");
		turno2.mostrarDetalle();
		turno2.confirmar();
		System.out.println("----------------------------");
		turno2.mostrarDetalle();
	
	}

}
