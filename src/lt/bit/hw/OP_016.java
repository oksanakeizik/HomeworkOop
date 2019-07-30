package lt.bit.hw;

/**
 * LT Parašykite programą, kuri skaičiuoja visų lyginių skaičių sumą diapazone nuo 0 iki 1000.
 * Turi būti panaudoti for, while ir do ... while ciklai.
 * EN Write a program that calculates the sum of all even numbers in the range 0 to 1000.
 * The for, while and do ... while cycles must be used.
 */

public class OP_016 {
    public static void main(String[] args) {
        int start = 0;
        int end = 1000;
        sumFor(start, end);
        sumWhile(start, end);
        sumDoWhile(start, end);
    }

    private static void sumFor(int start, int end) {
        int sumEvenFor = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sumEvenFor += i;
            }
        }
        System.out.println("Sum of all even numbers the For cycle: " + sumEvenFor);
    }

    private static void sumWhile(int start, int end) {
        int sumEvenWhile = 0;
        while (start <= end) {
            start++;
            if (start % 2 == 0) {
                sumEvenWhile += start;
            }
        }
        System.out.println("Sum of all even numbers the While cycle: " + sumEvenWhile);
    }

    private static void sumDoWhile(int start, int end) {
        int sumEvenDoWhile = 0;
        do {
            start++;
            if (start % 2 == 0) {
                sumEvenDoWhile += start;
            }
        } while (start <= end);
        System.out.println("Sum of all even numbers the Do..While cycle: " + sumEvenDoWhile);
    }
}
