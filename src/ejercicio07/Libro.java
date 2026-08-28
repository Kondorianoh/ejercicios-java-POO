package ejercicio07;

public class Libro {

	private String titulo;
	private String isbn;
	private int paginas;
	
	// Acá lo que hace, en vez de copiar los datos del autor, es guardar una referencia (dirección de memoria) al objeto Autor.
	private Autor autor;
	
	public Libro(String titulo, String isbn, int paginas, Autor autor) {
		
		this.titulo = titulo;
		this.isbn = isbn;
		this.paginas = paginas;
		
		// Recibe por parámetro el objeto autor instanciado. Eso significa que desde acá se puede acceder a sus métodos
		// y a sus atributos (desde los getters creados en Autor).
		this.autor = autor;
		
	}
	
	public void mostrarFicha() {
		
		System.out.println("Libro: " + this.titulo);
		System.out.println("ISBN: " + this.isbn);
		System.out.println("Páginas: " + this.paginas);
		
		// Con la referencia guardada en 'this.autor' se puede llamar a los getters de ese objeto
		// para poder tener los atributos.
		System.out.println("Autor: " + this.autor.getNombre());
		System.out.println("Nacionalidad: " + this.autor.getNacionalidad());
		
	}
	
}
