package com.blp.algorithm;

public class InsertionSort {

    /* function to sort an aay with insertion sort */
    void insert(int[] arr) {
        int temp;

        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            int j = i - 1;
            /* Move the elements greater than temp to one position ahead from their current position*/
            while (j >= 0 && temp <= arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    /* function to print the array */
    void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = {92, 50, 5, 20, 11, 22};
        InsertionSort sort = new InsertionSort();
        System.out.println("Before sorting array elements are - ");
        sort.printArr(arr);
        sort.insert(arr);
        System.out.println();
        System.out.println("After sorting array elements are - ");
        sort.printArr(arr);
        System.out.println();
    }
}

