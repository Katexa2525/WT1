package org.example.task7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] myArray = {5.1, 10, 6, 12.5, 3, 24, 7, 8};
        double[] sortedArray = bubbleSort(myArray);
        System.out.println(Arrays.toString(sortedArray));
    }
    public static double[] bubbleSort(double[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    double temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        return arr;
    }
}