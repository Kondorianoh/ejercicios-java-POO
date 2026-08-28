package ejercicio06;

public class Termometro {

	private double celcius;
	
	public Termometro(double celcius) {
		
		this.celcius = celcius;
		
	}
	
	public double getCelcius() {
		
		return this.celcius;
		
	}
	
	public double convertirAFarenheit() {
		
		return (this.celcius * 9 / 5) + 32;
		
	}
	
	public double convertirAKelvin() {
		
		return this.celcius + 273.15;
	
	}
	
}
