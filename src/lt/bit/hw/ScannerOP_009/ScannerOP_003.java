package lt.bit.hw.ScannerOP_009;

import java.util.Scanner;

public class ScannerOP_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of Rectangle (square): ");
        int length = scanner.nextInt();
        System.out.print("Enter the width of Rectangle (square): ");
        int width = scanner.nextInt();
        int perimeter = 2 * (length + width);
        int area = length * width;
        System.out.println("Perimeter of Rectangle (square) is: " + perimeter);
        System.out.println("Area of Rectangle (square) is: " + area);
    }
}
