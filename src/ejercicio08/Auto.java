package ejercicio08;

public class Auto {
	
	private String marca;
	private String modelo;
	private Motor motor;
	
	public Auto(String marca, String modelo, int cilindrada) {
		
		this.marca = marca;
		this.modelo = modelo;
		
		// Esto es una composición (un objeto dentro de otro).
		// En vez de recibir el motor ya instanciado, es el constructor el que instancia uno nuevo usando la cilindrada que recibe por parámetro.
		// Cada vez que se instancia un objeto Auto, el constructor le instancia y asigna su propio objeto Motor.
		this.motor = new Motor(cilindrada, false);
		
	}
	
	public String getMarca() {
		
		return this.marca;
		
	}
	
	public String getModelo() {
		
		return this.modelo;
		
	}
	
	// Todo lo que viene a continuación es delegación. Auto solo tiene que saber su modelo y marca, y lo demás
	// se lo encarga a Motor.
	
	// Por ejemplo, esta clase no guarda el atributo 'cilindrada', así que se lo pide al objeto Motor y es ese el que retorna el dato.
	public int getCilindrada() {
		
		return this.motor.getCilindrada();
		
	}
	
	// Y es lo mismo con los siguientes métodos. Auto no modifica los estados directamente, sino que los delega a Motor
	public void encender() {
		
		this.motor.encender();
		
	}
	
	public void apagar() {
		
		this.motor.apagar();
		
	}
	
	public void mostrarEstado() {
		
		if (motor.estaEncendido()) {
			
			System.out.println("Motor encendido.");
			
		} else {
			
			System.out.println("Motor apagado.");
			
		}
		
	}

}
