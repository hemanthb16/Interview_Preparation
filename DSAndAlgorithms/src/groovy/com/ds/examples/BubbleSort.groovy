package com.ds.examples

/**
 * Sorts the array of elements by comparing the one by one, if first one greater than second then it will swap.
 *
 * For every iteration we will move big number to last position up to unsorted position
 *
 * Time complexity - Worst case O(N^2)
 *
 * @Author Hemanth Kumar
 */
class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = [22, -15, 7, 35, 55, 45, 72]
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            println intArray[i]
        }
    }

    /**
     * Method to swap array elements
     * @param intArray the intArray need to swap
     * @param i the element to swap
     * @param j the element to swap
     */
    static void swap(int[] intArray, int i, int j) {
        if (i == j) {
            return
        }
        int temp = intArray[i]
        intArray[i] = intArray[j]
        intArray[j] = temp
    }
}
