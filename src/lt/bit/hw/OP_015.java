package lt.bit.hw;

/**
 * LT Parašykite programą, kuri skaičiuoja funkcijos y = 3x reikšmes, kai x keičiasi nuo 0 iki 10.
 * EN Write a program that calculates the values ​​of the function y = 3x when x changes from 0 to 10.
 */

public class OP_015 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 10);
        int y = 3 * x;
        System.out.println("Random: x = " + x);
        System.out.println("Function y = 3x: y = " + y);
    }
}

