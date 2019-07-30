package lt.bit.hw;

/**
 * LT Parašykite programą, kuri atspausdina pateiktą lentelę.
 * Užduoties sprendimui galite naudoti sąlyginius sakinius ir ciklus.
 * 1 0 0 0 0 0 0 0 0 0
 * 0 1 0 0 0 0 0 0 0 0
 * 0 0 1 0 0 0 0 0 0 0
 * 0 0 0 1 0 0 0 0 0 0
 * 0 0 0 0 1 0 0 0 0 0
 * 0 0 0 0 0 1 0 0 0 0
 * 0 0 0 0 0 0 1 0 0 0
 * 0 0 0 0 0 0 0 1 0 0
 * 0 0 0 0 0 0 0 0 1 0
 * 0 0 0 0 0 0 0 0 0 1
 * EN Write a program that prints the generate table.
 * You can use conditional sentences and cycles to solve a problem.
 */

import java.util.Arrays;

public class OP_011 {
    public static void main(String[] args) {
        int[][] table = new int[10][10];
        generateTable(table);
    }

    private static void generateTable(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int k = 0; k < table.length; k++) {
                if (i == k) {
                    table[i][k] = 1;
                } else {
                    table[i][k] = 0;
                }
            }
            System.out.println(Arrays.toString(table[i]));
        }
    }
}
