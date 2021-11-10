package com.blp.algorithm;

/**
 * Sort string array using insertion sort
 */
public class InsertionSort {

    public static void main(String[] args) {
        String[] arr = {"Aishu", "Neha", "Dhanu", "Ovi", "Sai pallavi"};
        String[] sortedArray = sortString(arr, arr.length);
        print(sortedArray);
    }

    /**
     *  To Sort array call method sortString
     */
    public static String[] sortString(String array[], int length) {
        String temp = "";
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    /**
     * Call method print to print sorted array
     * @param sortedArray
     */
    public static void print(String[] sortedArray) {
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}
