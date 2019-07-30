package lt.bit.hw;

/**
 * LT Parašykite programą, kuri apskaičiuoja stačiakampio (kvadrato)
 * perimetrą ir plotą. Šonų reikšmes a ir b turi būti realūs skaičiai.
 * EN Write a program that calculates the perimeter and area of a rectangle (square).
 * The values ​​of sides a and b must be real numbers.
 */

public class OP_003 {
    public static void main(String[] args) {
        int length = 7;
        int width = 3;
        int perimeter = 2 * (length + width);
        int area = length * width;
        System.out.println("Perimeter of rectangle (square) is: " + perimeter);
        System.out.println("Area of rectangle (square) is: " + area);
    }
}
