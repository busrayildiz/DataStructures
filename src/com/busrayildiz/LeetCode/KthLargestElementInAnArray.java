package com.busrayildiz.LeetCode;

import java.util.Arrays;
import java.util.stream.IntStream;

import static com.busrayildiz.SortAlgorithms.QuickSort.quickSort;

public class KthLargestElementInAnArray {
    public static int findKthLargest(int[] nums, int k) {

            int[] sorted = quickSort(nums);

            return sorted[sorted.length - k];
    }
}
