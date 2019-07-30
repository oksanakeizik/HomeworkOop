package lt.bit.hw;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * LT Parašykite programą, kuri užpildo 20 elementų masyvą atsitiktiniais skaičiais.
 * Surušiuokite gautą masyvą. suskaičiuokite Masyvo elementų reikšmių sumą.
 * EN Write a program that fills an array of 20 elements with random numbers.
 * Sort the resulting array. calculate the sum of the values ​​of the array elements.
 */

public class OP_010 {
    public static void main(String[] args) {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
            System.out.println(arr[i] + " ");
        }
        System.out.println("\nSorted: \n");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("\nSumArrays: \n");
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
        System.out.println(sum);
    }
}
