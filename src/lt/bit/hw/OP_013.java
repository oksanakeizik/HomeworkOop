package lt.bit.hw;

/**
 * LT Parašykite faktorialo skaičiavimo programą, kuri nenaudoja rekursijos.
 * EN Write a factorial calculation program that does not use recursion.
 */

public class OP_013 {
    public static void main(String[] args) {
        int number = 8;
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
