package lt.bit.hw;

/**
 * LT Parašykite programą, kuri pašalina dublikatus (pasikartojančias reikšmes) iš int tipo masyvo.
 * Masyvą sugeneruoti naudojant Random klasę.
 * EN Write a program that removes duplicates (duplicate values) from an int type array.
 * The array is generated using the Random class.
 */

import java.util.Arrays;

public class OP_021 {
    public static void main(String[] args) {
        int[] randomArray = new int[5];


        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = (int)(Math.random() * 10);
        }
        System.out.println(Arrays.toString(randomArray));

        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray));
        removeDuplicate(randomArray);
    }

    private static void removeDuplicate(int[] randomArray) {
        int[] tempArr = new int[randomArray.length];
        int j = 0;
        for (int i = 0; i < randomArray.length - 1; i++) {
            if (randomArray[i] != randomArray[i + 1]) {
                tempArr[j++] = randomArray[i];
            }
        }
        if (randomArray[randomArray.length - 1] != randomArray[randomArray.length - 2]){
            tempArr[j++]= randomArray[randomArray.length - 1];
        }

        for (int i = 0; i < j; i++) {
            System.out.print(tempArr[i]);
        }
    }
}