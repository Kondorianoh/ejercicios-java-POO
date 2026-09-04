package ejercicio11;

import java.util.ArrayList;

public class Biblioteca {
	
	// Esta clase tiene un ArrayList que almacena objetos de tipo Libro.
	private ArrayList<Libro> libros;

	public Biblioteca() {
		// Cuando se instancia 'Biblioteca biblioteca = new Biblioteca();' en el Main, también se instancia
		// un ArrayList vacío.
		this.libros = new ArrayList<>();
	}
	
	// Este método recibe por párametro un objeto de tipo Libro y lo agrega a la colección.
	public void agregarLibro(Libro libro) {
		// Agarra el ArrayList libros y le agrega el objeto libro con el método 'add()'.
		libros.add(libro);
		
	}
	
	// Este método recorre todos los elementos que hay en el ArrayList e imprime el título y el ISBN de cada uno.
	public void listarLibros() {
		// Esto es ub bucle 'for-each'.
		// Lo que hace es que cada elemento que hay adentro de this.libros lo almacena temporalmente en la variable libro
		// de tipo Libro en cada iteración.
		for (Libro libro : this.libros) {
			// Entoces podés acceder a la información cada libro individualmente.
			System.out.println(libro.getTitulo() + ", ISBN " + libro.getIsbn());
			
		}
		
	}
	
	// Este método recibe el isbn a buscar y devuelve un objeto de tipo Libro.
	public Libro buscarPorIsbn(String isbn) {
		// El 'for-each' recorre el ArrayList
		for (Libro libro : this.libros) {
			// Por cada iteración del bucle verifica si el isbn del libro es igual al isbn que recibió por parámetro.
			// El método 'equals()' sirve para comparar dos objetos y saber si son iguales.
			// Usé el 'equals()' en vez del '==' por que el operador '==' compara si dos variables apuntan al mismo espacio en la memoria (referencia),
			// mientras que el método 'equals()' compara si el contenido o valor de dos objetos son iguales.
			if (libro.getIsbn().equals(isbn)) {
				// Si es true, encontró el libro y lo devuelve.
				return libro;

			}

		}
		// Si es false, retorna null.
		return null;
		
	}

}
