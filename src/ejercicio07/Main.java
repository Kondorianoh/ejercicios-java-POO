package ejercicio07;

public class Main {

	public static void main(String[] args) {
		
		// Instancio el autor de forma independiente.
		Autor autor = new Autor("Julio Cortázar", "Argentina");
		
		// Y acá le paso la referencia del autor a la instancia de Libro.
		Libro libro = new Libro("Rayuela", "978-0001", 600, autor);
		
		libro.mostrarFicha();

	}

}
