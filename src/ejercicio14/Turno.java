package ejercicio14;

public class Turno {
	
	private Paciente paciente;
	private Profesional profesional;
	private String fechaHora;
	private String estado = "PENDIENTE";
	
	public Turno(Paciente paciente, Profesional profesional, String fechaHora) {
		this.paciente = paciente;
		this.profesional = profesional;
		this.fechaHora = fechaHora;
	}
	
	public void confirmar() {

		if (this.estado.equals("PENDIENTE")) {
			
			this.estado = "CONFIRMADO";
			
		}
	}
	
	public void cancelar() {
		this.estado = "CANCELADO";
	}
	
	public void mostrarDetalle() {
		System.out.println("FECHA Y HORA: " + this.fechaHora);
		System.out.println("ESPECIALIDAD: " + this.profesional.getEspecialidad());
		System.out.println("PROFESIONAL: " + this.profesional.getNombre());
		System.out.println("PACIENTE: " + this.paciente.getNombre());
		System.out.println("DNI: " + this.paciente.getDni());
		System.out.println("Turno " + this.estado);
	}
	
}
