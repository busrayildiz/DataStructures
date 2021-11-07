package com.busrayildiz.SearchAlgorithms;

public class LinearSearch {

    public static void linearSearch(int[] array , int item){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==item){
                System.out.println("The item " + item + " is found at position " + i);
            }
        }
    }
}
