package com.busrayildiz;

import com.busrayildiz.LinkedList.LinkedList;

import static com.busrayildiz.SortAlgorithms.SelectionSort.selectionSort;

public class Main {

    public static void main(String[] args) {

       int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int i = 0 ; i < intArray.length; i++){
            System.out.print(intArray[i] + ",");
        }
        System.out.println();
        selectionSort(intArray);

    }


}
