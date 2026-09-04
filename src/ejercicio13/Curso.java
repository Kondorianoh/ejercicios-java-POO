package ejercicio13;

import java.util.ArrayList;

public class Curso {
	
	private String codigo;
	private String nombre;
	private int cupoMaximo;
	private ArrayList<Alumno> alumnos;
	
	public Curso(String codigo, String nombre, int cupoMaximo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.cupoMaximo = cupoMaximo < 1 ? 1 : cupoMaximo;
		this.alumnos = new ArrayList<>();
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getCupoMaximo() {
		return this.cupoMaximo;
	}
	
	public boolean inscribir(Alumno alumno) {
		// Verifica si hay cupo disponible. Si es menor o igual a cero devuelve 'false'
		if (lugaresDisponibles() <= 0) {
			
			System.out.println(alumno.getNombre() + "; Legajo " + alumno.getLegajo() + " Inscripción Rechazada (Cupo completo).");
			
			return false;
			
		}
		// El '!' niega el valor de verdad (si es 'true' lo vuelve 'false' y viceversa).
		// Si el alumno no está inscripto lo agrega a la lista y devuelve 'true'.
		if (!estaInscripto(alumno)) {
			
			this.alumnos.add(alumno);
			
			System.out.println(alumno.getNombre() + "; Legajo " + alumno.getLegajo() + " Inscripción Aceptada.");
			
			return true;
			
		} else {
			
			System.out.println(alumno.getNombre() + "; LEgajo " + alumno.getLegajo() +" Inscripción Rechazada (Ya está inscripto).");
			
			return false;
			
		}
		
	}
	
	public int lugaresDisponibles() {
		return this.cupoMaximo - this.alumnos.size();
	}
	
	public boolean estaInscripto(Alumno alumno) {
		// Recorre el ArrayList en busca del alumno comparando los legajos. Si existe (está inscripto) devuelve true.
		for (Alumno alu : alumnos) {
			
			if (alu.getLegajo().equals(alumno.getLegajo())) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}

}
