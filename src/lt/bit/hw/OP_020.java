package lt.bit.hw;

import java.util.Arrays;

/**
 * LT Parašykite programą, kuri rušiuoja String tipo masyvą.
 * EN Write a program that sorts a String array.
 */

public class OP_020 {
    public static void main(String[] args) {
        String[] names = new String[]{"Deividas", "Rokas", "Petras", "Irena"};

        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "  ");
        }
    }
}
