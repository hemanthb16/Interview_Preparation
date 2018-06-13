package com.ds.examples

/**
 * Class provides the binary search algorithm with out using recursion
 *
 * Functionality: First it will search mid element, if found it will return
 * If not found, it will check left part or right part of mid element to search.
 * If it found part to search, again it will do same process.
 *
 * Time complexity : O(Log n)- Worst case.
 *                   O(1) - Best case
 *
 * Note: Array should be sorted in asc order.
 */
class BinarySearchWORecursion {

    public static void main(String[] args) {
        int[] intArray = [1, 15, 35, 56, 68, 72, 99, 105, 120]
        binarySearch(9, intArray, 15)
    }

    /**
     * Method to do binary search by given element
     * @param size the size of array
     * @param arrayToSearch array to search
     * @param search the element needs to search
     */
    static void binarySearch(int size, int[] arrayToSearch, int search) {
        long first = 0
        long last = size - 1;
        int mid = (first + last) /2
        while (first <= last) {
            if (search == arrayToSearch[mid]) {
                println " Found $mid"
                break
            } else if (search < arrayToSearch[mid]) {
                last = mid-1;
            } else {
                first = mid + 1
            }
            mid = (first + last) / 2
        }
        if (first > last) {
            println 'Not found'
        }
    }
}
