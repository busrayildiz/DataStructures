package com.busrayildiz.SortAlgorithms;

import static com.busrayildiz.SortAlgorithms.QuickSort.swap;

public class QuickSelect {
    private static int selectRecursion(int[] arr, int targetIndex) {
        return selectRecursion(arr, targetIndex, 0, arr.length - 1);
    }

    private static int selectRecursion(int[] arr, int targetIndex, int left, int right) {
        int partitionIndex = partition(arr, left, right);
        if (partitionIndex == targetIndex) return arr[partitionIndex];
        if (partitionIndex > targetIndex)
            return selectRecursion(arr, targetIndex, left, --partitionIndex);
        return selectRecursion(arr, targetIndex, ++partitionIndex, right);
    }

    private static int partition(int[] arr, int left, int right) {
        final int pivot = arr[right];
        int partitionIndex = left;
        while (left < right) {
            if (arr[left] < pivot) swap(arr, left, partitionIndex++);
            left++;
        }
        swap(arr, partitionIndex, right);
        return partitionIndex;
    }

    private static int select(int[] arr, int targetIndex) {
        int l = 0;
        int r = arr.length - 1;
        int partitionIndex = 0;
        int pivot = arr[r];
        int start = 0;
        int end = r;
        while (start <= end) {
            // If pivot is less than the selected and swap
            if (arr[start] < pivot) {
                swap(arr, start, partitionIndex++);
            }
            start++;
            if (start == end) {
                swap(arr, partitionIndex, end);
                if (partitionIndex == targetIndex) return arr[targetIndex];
                if (partitionIndex > targetIndex) {
                    r = --partitionIndex;
                } else {
                    l = ++partitionIndex;
                }
                start = l;
                partitionIndex = start;
                end = r;
                pivot = arr[r];
            }
        }
        return arr[targetIndex];
    }



}
