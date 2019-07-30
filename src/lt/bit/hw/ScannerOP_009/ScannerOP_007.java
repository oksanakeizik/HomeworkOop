package lt.bit.hw.ScannerOP_009;

import java.util.Scanner;

public class ScannerOP_007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();
        double bodyMassIndex = weight / (height * height);
        System.out.print("Your body mass index is: ");
        System.out.format("%.2f%n", bodyMassIndex);
        System.out.print("Body Mass Index categories:\n Underweight: < 18.5\n Normal weight: 18.5 - 24.9\n " +
                "Overweight: 25 - 29.9\n Obesity: BMI of 30 or greater ");
    }
}
