package ejercicio01;

public class Main {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Carmen Sandiego", 42);
		Persona p2 = new Persona("Tinky Winky", 75);
		
		p1.presentarse();
		p2.presentarse();
		
		p1.cumplirAnios();
		p1.presentarse();

	}

}
