package lt.bit.hw;

import java.util.Arrays;

/**
 * LT Parašykite programą, kuri sumuoja dviejų atsitiktinai sugeneruotų masyvų skaičius.
 * Sumavimo rezultatas turi būti surašytas į trečią masyvą. Masyvai turi būti int tipo.
 * EN Write a program that sums the numbers of two randomly generated arrays.
 * The result of summation must be written to the third array. Arrays must be of the int type.
 */

public class OP_019 {
    public static void main(String[] args) {
        int[] ArrayOne = new int[10];
        for (int i = 0; i < ArrayOne.length; i++) {
            ArrayOne[i] = (int) (Math.random() * 100);
        }
        int[] ArrayTwo = new int[10];
        for (int i = 0; i < ArrayTwo.length; i++) {
            ArrayTwo[i] = (int) (Math.random() * 100);
        }
        int[] ArraySum = new int[7];
        for (int i = 0; i < ArraySum.length; i++) {
            ArraySum[i] = ArrayOne[i] + ArrayTwo[i];
        }
        System.out.println(Arrays.toString(ArrayOne));
        System.out.println(Arrays.toString(ArrayTwo));
        System.out.println(Arrays.toString(ArraySum));
    }
}
