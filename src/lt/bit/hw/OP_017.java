package lt.bit.hw;

/** LT Parašykite programą, kuri išveda į ekraną daugybos lentelę iki 10.
 * EN Write a program that outputs a multiplication table of up to 10 on the screen.
 */

public class OP_017 {
    public static void main(String[] args) {
        int start = 0;
        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= 10; k++) {
                start = i * k;
                System.out.print(start + " ");
            }
            System.out.println();
        }
    }
}