package com.blp.algorithm;

public class BubbleSort {

    /* To sort array call bubble sort method */
    private static void bubbleSort(int[] arr) {

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    /* To print array call print method */
    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Array Before Bubble Sort");
        print(arr);

        System.out.println();

        bubbleSort(arr);//sorting array elements using bubble sort
        System.out.println("Array After Bubble Sort");
        print(arr);
    }
}
