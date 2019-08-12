package lt.bit.hw.squareAreaOP_023;

import java.util.Scanner;

public class Square implements FiguresParameters {
    Scanner user_input = new Scanner(System.in);
    double length = readDataLength();
    double width = readDataWidth();


    public double readDataLength() {
        System.out.print("Width:   ");
        return user_input.nextDouble();
    }

    public double readDataWidth() {
        System.out.print("Length:   ");
        return user_input.nextDouble();
    }

    @Override
    public double countArea() {
        return length * width;
    }

    public void printSquareArea() {
        System.out.println("Square Area = " + countArea());
    }
}
