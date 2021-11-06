package com.busrayildiz.HackerrankQuestions;

import java.util.List;

public class BubbleSort {
    public static void countSwaps(List<Integer> a) {
        // Write your code here
        int swaps = 0;
        int n = a.size();
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-1;j++) {
                if(a.get(j)>a.get(j+1)){
                    swaps++;
                    swap(a, j, j+1);
                }
            }
        }

        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: "+a.get(0));
        System.out.println("Last Element: "+a.get(n-1));


    }

    public static void swap( List<Integer> list, int a, int b) {
        int temp = list.get(b);
        list.set(b, list.get(a));
        list.set(a, temp);
    }
}
