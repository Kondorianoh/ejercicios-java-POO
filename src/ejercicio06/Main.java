package ejercicio06;

public class Main {

	public static void main(String[] args) {

		Termometro term = new Termometro(25);
		
		double celcius = term.getCelcius();
		double farenheit = term.convertirAFarenheit();
		double kelvin = term.convertirAKelvin();
		
		System.out.println(celcius + " °C");
		System.out.println("Conversión a Farenheit: " + farenheit + " °F");
		System.out.println("Conversión a Kelvin: " + kelvin + " °K");
		System.out.println(celcius + " °C");

	}

}
