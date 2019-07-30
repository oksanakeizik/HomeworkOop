package lt.bit.hw;

/*
 * LT Parašykite Fibonačio skaičių sekos skaičiavimo programą, kuri nenaudoja rekursijos.
 * EN Write a Fibonacci sequence calculator that does not use recursion.
 */

import java.util.Scanner;

public class OP_014 {
    public static void main(String[] args) {
        int count, num1 = 0, num2 = 1;
        System.out.println("How many numbers you want in the sequence?: ");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        scanner.close();
        System.out.println("Fibonacci Series of " + count + " numbers");
        int i = 1;
        while (i <= count) {
            System.out.println(num1 + " ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
}
