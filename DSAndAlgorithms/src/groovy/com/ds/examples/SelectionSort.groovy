package com.ds.examples

/**
 * sorts the elements by comparing every element with big element, and if any found big than the swap index will change
 */
class SelectionSort {

    public static void main(String[] args) {

        int[] intArray = [22, -15, 7, 35, 55, 45, 72]
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int indexToSwap = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[indexToSwap]) {
                    indexToSwap = i
                }
                println indexToSwap
            }
            swap(intArray, lastUnsortedIndex, indexToSwap)
        }

        for (int i = 0; i < intArray.length; i++) {
            println intArray[i]
        }
    }

    static void swap(int[] array, int i, int j) {
        if (i == j) {
            return
        }

        int temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }
}
