package lt.bit.hw;

/**
 * LT. Parašykite Farenheito į Celsijaus (ºF į ºC) konversijų skaičiuoklę.
 * Skaičiavimo tikslumas turi būti du skaičiai po kalblelio.
 * EN. Write a conversion calculator for Fahrenheit to Celsius (ºF to ºC).
 * The accuracy of the calculation shall be two decimal places.
 */

public class OP_006 {
    public static void main(String[] args) {
        double temperatureF = 100;
        double convertFtoC = (temperatureF - 32) / 1.8;
        System.out.format("%.2f%n", convertFtoC);
    }
}