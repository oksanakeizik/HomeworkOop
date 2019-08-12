package lt.bit.hw;

/**
 * LT Parašykite programą, kuri išveda į ekraną daugybos lentelę iki 10.
 * EN Write a program that outputs a multiplication table of up to 10 on the screen.
 */

public class OP_017 {
    public static void main(String[] args) {
        int i, j;
        System.out.printf(" * |");
        for (i = 1; i < 10; i++)
            System.out.printf("%2d ", i);
        System.out.printf("\n---|------------");
        System.out.printf("----------------\n");
        for (i = 1; i < 10; i++) {
            System.out.printf("%2d |", i);
            for (j = 1; j < 10; j++)
                System.out.printf("%2d ", i * j);
            System.out.printf("\n");
        }
    }
}