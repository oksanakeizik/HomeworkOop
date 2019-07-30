package lt.bit.hw;

/**
 * LT Parašykite programą, kuri kompiuterio ekrane atspausdina konstantą
 * π = 3,14 ... . Konstantą parodykite 5 skaitmenų po kablelio tikslumu.
 * EN Write a program that prints a constant
 * π = 3.14 ... on the computer screen. Display the constant to 5
 * decimal places.
 */

public class OP_004 {
    public static void main(String[] args) {
        System.out.format("%.5f%n", Math.PI);
    }
}
