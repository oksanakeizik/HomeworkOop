package lt.bit.hw.scannerOP_009;

import java.util.Scanner;

public class ScannerOP_006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit (ºF): ");
        double temperatureF = scanner.nextDouble();
        double convertFtoC = (temperatureF - 32) / 1.8;
        System.out.println("Temperature Fahrenheit to Celsius (ºF to ºC) is: ");
        System.out.format("%.2f%n", convertFtoC);
    }
}
