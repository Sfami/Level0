

public class Task0_7 {

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(32.00  ) + " fahrenheit");
        System.out.println(fahrenheitToCelsius(32.00) + " celsius");
    }
    public static double celsiusToFahrenheit(double celsiusTemperature){
        double fahrenheitTemperature = 9.0/5.0 * (celsiusTemperature) + 32.0;
        return fahrenheitTemperature;
    }
    public static double fahrenheitToCelsius(double fahrenheitTemperature){
        double celsiusTemperature = 5.0/9.0 * (fahrenheitTemperature - 32.0);
        return celsiusTemperature;
    }
    
}
