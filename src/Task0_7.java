

public class Task0_7 {

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(32) + " fahrenheit");
        System.out.println(fahrenheitToCelsius(32) + " celsius");
    }
    public static double celsiusToFahrenheit(double celsiusTemperature){
        double fahrenheitTemperature = 9/5 * (celsiusTemperature) + 32;
        return fahrenheitTemperature;
    }
    public static double fahrenheitToCelsius(double fahrenheitTemperature){
        double celsiusTemperature = 5/9 * (fahrenheitTemperature - 32);
        return celsiusTemperature;
    }
}
