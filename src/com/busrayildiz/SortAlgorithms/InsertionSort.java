package com.busrayildiz.SortAlgorithms;

public class InsertionSort {

    public static void swap(int[] array, int i, int j) {

        if (i == j)
            return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public static void insertionSort(int[] array) {

        for (int i = 0; i < array.length-1 ; i++) {
            for (int j = i; j >= 0; j--) {
                if(array[j]>array[j+1])
                    swap(array,j,j+1);
            }

        }

        for(int i = 0 ; i < array.length; i++){
            System.out.print(array[i] + ",");
        }

    }
}
