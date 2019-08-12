package lt.bit.hw.sortArrayOP_025;

import java.util.Arrays;

/**
 * LT Naudojant objektinio programavimo principus realizuokite masyvų rūšiavimo programą.
 * Turi būti panaudoti bent tris rūšiavimo algoritmai. Masyvo ilgis > 10000.
 * EN Implement an array sort program using object-oriented programming principles.
 * At least three sorting algorithms must be used. Array length> 10000.
 */

public class Main {
    public static void main(String[] args) {
        SortArraysAlgorithms sorting = new SortArraysAlgorithms();
        sorting.generateRandomArray();
        sorting.bubbleSort();
        sorting.insertionSort();
        sorting.sortArray();
    }
}
