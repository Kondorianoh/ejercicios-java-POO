package ejercicio08;

public class Main {

	public static void main(String[] args) {
		
		Auto auto = new Auto("Toyota", "Corola", 1800);
		
		System.out.println(auto.getMarca() + " " + auto.getModelo() + " con motor de " + auto.getCilindrada() + " cm³.");
		
		auto.mostrarEstado();
		auto.encender();
		auto.mostrarEstado();
		auto.apagar();
		
	}

}
