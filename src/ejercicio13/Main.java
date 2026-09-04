package ejercicio13;

public class Main {

	public static void main(String[] args) {

		Curso curso = new Curso("POO1", "Programación Orientada a Objetos", 2);
		
		Alumno alumno1 = new Alumno("Ana", "A1");
		Alumno alumno2 = new Alumno("Luis", "A2");
		Alumno alumno3 = new Alumno("DeVito", "A3");
		
		System.out.println(curso.getCodigo() + "; " + curso.getNombre() + "; Cupo máximo " + curso.getCupoMaximo());

		curso.inscribir(alumno1);
		curso.inscribir(alumno1);
		
		curso.inscribir(alumno2);
		
		curso.inscribir(alumno3);
		
	}

}
