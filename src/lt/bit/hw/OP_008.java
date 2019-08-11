package lt.bit.hw;

import java.util.Scanner;

/**
 * LT Parašykite paprasto skaičiuotuvo programą. Skaičiuotuvas turi mokėti atlikti aritmetines,
 * logines ir bitines operacijas.
 * EN Write a simple calculator program. The calculator must be capable of performing arithmetic,
 * boolean and bitwise operations.
 */

public class OP_008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Please enter the first number a: ");
        a = input.nextInt();
        System.out.println("Please enter the second number b: ");
        b = input.nextInt();

        System.out.println("Please choose one possible options:\n" +
                " Arithmetic:  + , - , / , * , % " + "\n" +
                " Boolean:  == , > , < , != , >= , <= " + "\n" +
                " Bitwise:  | , & , ^");
        String c = input.next();

        double addition = a + b;
        double subtracts = a - b;
        double division = a / b;
        double multiplication = a * b;
        double modulus = a % b;

        switch (c) {
            case ("+"):
                System.out.println("a + b = " + addition);
                break;
            case ("-"):
                System.out.println("a - b = " + subtracts);
                break;
            case ("/"):
                System.out.println("a / b = " + division);
                break;
            case ("*"):
                System.out.println("a * b = " + multiplication);
                break;
            case ("%"):
                System.out.println("a % b =  " + modulus);
                break;
            case ("=="):
                System.out.println("a == b is " + (a == b));
                break;
            case (">"):
                System.out.println("a > b is " + (a > b));
                break;
            case ("<"):
                System.out.println("a < b is " + (a < b));
                break;
            case ("!="):
                System.out.println("a != b is " + (a != b));
                break;
            case (">="):
                System.out.println("b >= a is " + (b >= a));
                break;
            case ("<="):
                System.out.println("b <= a is " + (b <= a));
                break;
            case ("&"):
                System.out.println("Bitwise AND: a & b = " + (a & b));
                break;
            case ("|"):
                System.out.println("Bitwise OR: a | b = " + (a | b));
                break;
            case ("^"):
                System.out.println("Bitwise XOR: a ^ b = " + (a ^ b));
                break;
        }
    }
}


