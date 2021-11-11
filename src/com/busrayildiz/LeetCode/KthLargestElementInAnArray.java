package com.busrayildiz.LeetCode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class KthLargestElementInAnArray {
    public static int findKthLargest(int[] nums, int k) {

        int[] sorted = Arrays.stream(nums).sorted().toArray();

            return sorted[sorted.length - k];
    }
}
