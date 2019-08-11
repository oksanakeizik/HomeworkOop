package lt.bit.hw;

import java.util.Random;

/**
 * LT Parašykite programą, kuri randa didžiausią String tipo masyvo elementą.
 * https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
 * EN Write the program that finds the largest element of the String type array.
 */

public class OP_022 {
    public static void main(String[] args) {
        int a[] = new int[10];
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(9 - 0) + 0;
            System.out.println(a[i]);
        }

        int max = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = max;


            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > max) {
                    max = a[j];
                }
            }
        }
        System.out.println("Largest element: " + max);
    }
}