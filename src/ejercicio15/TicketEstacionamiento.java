package ejercicio15;

public class TicketEstacionamiento {
	
	private Vehiculo vehiculo;
	private int horas;
	
	public TicketEstacionamiento(Vehiculo vehiculo, int horas) {
		this.vehiculo = vehiculo;
		// Uso el setter para establecer la cantidad de horas. En el setter está la validación.
		setHoras(horas);
	}

	public Vehiculo getVehiculo() {
		return this.vehiculo;
	}

	public int getHoras() {
		return this.horas;
	}

	public void setHoras(int horas) {
		
		if (horas > 0) {
			
			this.horas = horas;
			
		}
		
	}

}
