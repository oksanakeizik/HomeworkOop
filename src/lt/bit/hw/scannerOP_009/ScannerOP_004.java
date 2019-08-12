package lt.bit.hw.scannerOP_009;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ScannerOP_004 {
    public static void main(String[] args) {
        int n = getInput();
        double piValue = calculatePi(n);
        printResult(piValue);
    }

    private static double calculatePi(double n) {
        double pi = 0;
        for (int i = 1; i < n; i++) {
            pi += Math.pow(-1, i + 1) / (2 * i - 1);
        }
        return 4 * pi;
    }

    private static int getInput() {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("How many calculations should be run for the approximation? ");
        try {
            n = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.print("(n) is too large. Setting (n) to be the largest possible (int) value.");
            n = Integer.MAX_VALUE;
        }
        input.close();
        return n;
    }

    private static double calculateError(double piValue) {
        return Math.abs(1 - piValue / Math.PI) * 100;
    }

    private static void printResult(double piValue) {
        DecimalFormat df = new DecimalFormat("#.##"); // TODO
        System.out.println("The value of pi is approximately " + piValue + ".");
        System.out.println("The calculated value is off by approximately " + df.format(calculateError(piValue)) + "%");
    }
}
