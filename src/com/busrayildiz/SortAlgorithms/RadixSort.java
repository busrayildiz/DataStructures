package com.busrayildiz.SortAlgorithms;

public class RadixSort {

    int width=4;

    public static void radixSort(int[] array){






    }

    private static void swap(int[] array, int i, int j) {

        if(i==j)
            return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
