package lt.bit.hw;

/**
 * LT Parašykite žmogaus kūno masės indekso skaičiuoklę.
 * EN Write a body mass index calculator.
 */

public class OP_007 {
    public static void main(String[] args) {
        double weight = 65.0;
        double height = 1.68;
        double bodyMassIndex = weight / (height * height);
        System.out.println("Body mass index: " + bodyMassIndex);
        System.out.format("%.2f%n", bodyMassIndex);
    }
}
