package lt.bit.hw.sortArrayOP_025;

import java.util.Arrays;

public class SortArraysAlgorithms {
    int[] array = new int[10000];

    public void generateRandomArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        System.out.println("Generate Random Array: " + (Arrays.toString(array)));
    }

    public void bubbleSort() {
        int size = array.length;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Bubble Sort: " + (Arrays.toString(array)));
    }

    public void insertionSort() {
        int i, yPosition, j;
        for (i = 1; i < array.length; i++) {
            yPosition = array[i];
            j = i - 1;

            while (j >= 0 && array[j] > yPosition) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = yPosition;
        }
        System.out.println("Insertion Sort: " + (Arrays.toString(array)));
    }

    public void sortArray() {
        Arrays.sort(array);
        System.out.println("Sort Array: " + (Arrays.toString(array)));
    }
}
