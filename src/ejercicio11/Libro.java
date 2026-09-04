package ejercicio11;

public class Libro {
	
	private String titulo;
	private String isbn;
	
	public Libro(String titulo, String isbn) {
		
		this.titulo = titulo;
		this.isbn = isbn;
		
	}

	public String getTitulo() {
		return this.titulo;
	}

	public String getIsbn() {
		return this.isbn;
	}

}
