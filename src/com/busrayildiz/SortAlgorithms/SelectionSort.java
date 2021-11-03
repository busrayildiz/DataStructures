package com.busrayildiz.SortAlgorithms;

public class SelectionSort {

    public static void swap(int[] array, int i, int j) {

        if (i == j)
            return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public static void selectionSort(int[] array) {


        for(int i=array.length - 1 ; i>0 ; i-- ) { // 6 5 4 3 2 1
            int largest = 0;

            for (int j = 0; j <= i; j++) {
                if(array[j] > array[largest]){
                    largest = j;
                }
                swap(array, largest, i);
            }

        }

        for(int i = 0 ; i < array.length; i++){
            System.out.print(array[i] + ",");
        }

    }
}
