package com.ds.examples

/**
 * Class to do linear search
 *
 * Functionality: It will check element one by one, if found prints index
 *
 * Time complexity : Worst case - O(n), Best case - O(1)
 *
 * @Author Hemanth Kumar
 */
class LinearSearch {

    public static void main(String[] args) {
        int[] intArray = [10, 12, 56, 78, 89, 56]
        linearSearch(6, intArray, 78)
    }

    /**
     * Method to search element in linear way
     * @param size the size of array to search
     * @param arrayToSearch the array to search
     * @param search the element needs to search
     */
    static void linearSearch(int size, int[] arrayToSearch, int search) {
        int resultIndex = 0;
        for (int i = 0; i < size - 1; i++) {
            if (arrayToSearch[i] == search) {
                resultIndex = i;
            }
        }
        if (resultIndex != 0) {
            println "Found index $resultIndex"
        } else {
            println "Not Found"
        }
    }
}
