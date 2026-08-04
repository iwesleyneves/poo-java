//Wesley Neves
public class ConversorTemperatura {

	public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
	
	public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
	
	public static void main(String[] args) {
		
		double tempFahrenheit = ConversorTemperatura.celsiusParaFahrenheit(25.0);
        System.out.println("25°C em Fahrenheit: " + tempFahrenheit); // Retorna 77.0

        double tempCelcius = ConversorTemperatura.fahrenheitParaCelsius(77.0);
        System.out.println("77°F em Celsius: " + tempCelcius);    // Retorna 25.0
	}
}
