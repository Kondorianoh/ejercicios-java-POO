package ejercicio15;

import java.util.ArrayList;

public class Estacionamiento {
	
	private ArrayList<TicketEstacionamiento> tickets;
	private static final double TARIFA_HORA = 2500;
	
	public Estacionamiento() {
		this.tickets = new ArrayList<>();
	}
	
	
	public boolean registrarIngreso(Vehiculo vehiculo) {
		// Este bucle recorre la colección y comprueba si la patente ya está ingresada.
		// Rechaza el ingreso si ya existe la patente.
		for (TicketEstacionamiento ticket : tickets) {
			// El 'equalsIgnoreCase()' compara los 'String' sin importarle las mayúsculas y minúsculas.
			if (vehiculo.getPatente().equalsIgnoreCase(ticket.getVehiculo().getPatente())) {
				
				System.out.println(vehiculo.getPatente() + " Ingreso Rechazado.\n");
				return false;
				
			}
		}
		// Si la patente no está ingresada, entonces se puede agregar el vehiculo a la colección.
		// Esto instancia un nuevo 'ticket' con el vehículo y con las horas em 0.
		TicketEstacionamiento ticket = new TicketEstacionamiento(vehiculo, 0);
		// Y por último lo agrego a la colección.
		tickets.add(ticket);
		System.out.println(vehiculo.getPatente() + " Ingreso Aceptado.\n");
		
		return true;
		
	}
	
	public double registrarEgreso(String patente, int horas) {
		
		// Verifica que las horas no sean menores que 0. Si lo son, interrumpe el método con el return (devuelve 1);
		if (horas < 0) {
			
			System.out.println("Las horas tienen que ser mayores que 0.\n");
			
			return 1;
			
		}
		
		// Esta variable es para guardar el ticket del vehículo a egresar.
		// Como todavía no existe la inicio en 'null'.
		TicketEstacionamiento vehiculoEgresado = null;
		
		for (TicketEstacionamiento ticket : tickets) {
			
			if (ticket.getVehiculo().getPatente().equalsIgnoreCase(patente)) {
				// Si encuentra la patente el la colección, guarda el ticket en la variable y el bucle se interrumpe con el 'break'.
				vehiculoEgresado = ticket;
				break;
				
			}
			
		}
		
		// Si no lo encuentra interrumpe el método con el return (devuelve 1).
		if (vehiculoEgresado == null) {
			
			System.out.println("Patente no encontrada.");
			
			return 1;
			
		}
		
		System.out.println("SALIDA:");
		System.out.println(patente + "; Horas: " + horas);
		// Si fue encontrado, esto le asigna las horas
		vehiculoEgresado.setHoras(horas);
		// Y el 'remove()' recibe el objeto a eliminar como argumento y lo elimina de la colección.
		tickets.remove(vehiculoEgresado);
		
		return horas * TARIFA_HORA;
		
	}
	
	public void mostrarDetalles() {
		
		System.out.println("------------- VEHÍCULOS INGRESADOS -------------\n");
		for (TicketEstacionamiento ticket: tickets) {
			
			System.out.println(ticket.getVehiculo().getModelo() + " " + ticket.getVehiculo().getPatente() + "\n");
			
		}
		
		System.out.println("------------------------------------------------\n");
	}

}
