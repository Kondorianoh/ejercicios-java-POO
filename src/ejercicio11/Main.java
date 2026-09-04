package ejercicio11;

public class Main {

	public static void main(String[] args) {
		
		Biblioteca biblioteca = new Biblioteca();
		Libro libro = new Libro("Clean Code", "111");
		Libro libro2 = new Libro("Effective Java", "222");
		
		biblioteca.agregarLibro(libro);
		biblioteca.agregarLibro(libro2);
		biblioteca.listarLibros();
		
		Libro libroBuscado = biblioteca.buscarPorIsbn("222");
		System.out.println("----------------------------------");
		
		// Si libroBuscado es distinto de null, obtiene el titulo y lo almacena en la variable 'mensaje'. Si no, almacena el mensaje a la derecha de ':'
		// Con un if-else normal sería así:
		// 
		// String mensaje;
		// if (libroBuscado != null) {
		//		mensaje = libroBuscado.getTitulo();
		// } else {
		//		mensaje = "ISBN Inexistente";
		// }
		String mensaje = libroBuscado != null ? libroBuscado.getTitulo() : "ISBN Inexistente.";
		
		System.out.println(mensaje);
		
		libroBuscado = biblioteca.buscarPorIsbn("043");
		System.out.println("----------------------------------");
		
		mensaje = libroBuscado != null ? libroBuscado.getTitulo() : "ISBN Inexistente.";
		
		System.out.println(mensaje);
		
	}

}
