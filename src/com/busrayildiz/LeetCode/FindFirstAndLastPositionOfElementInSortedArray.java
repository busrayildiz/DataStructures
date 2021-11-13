package com.busrayildiz.LeetCode;

import static com.busrayildiz.SearchAlgorithms.BinarySearch.iterativeBinarySearch;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findStartingIndex(nums , target);
        result[1] = findEndingIndex(nums , target);

        return result;

    }

    private static int findStartingIndex(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int midpoint = start + (end-start)/2;

            if(nums[midpoint] >= target){
                end = midpoint - 1;
            }
            else{
                start=midpoint+1;
            }

            if(nums[midpoint]==target) index= midpoint;
        }

        return index;
    }

    private static int findEndingIndex(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length-1;

        while(start<=end) {
            int midpoint = start + (end - start) / 2;

            if (nums[midpoint] <= target) {
                start = midpoint + 1;
            }
            else{
                end = midpoint-1;
            }
            if(nums[midpoint]==target) index = midpoint;

        }
        return index;
    }

/***
    public static int binarySearch(int [] arr , int value){
        int start = 0;
        int end = arr.length-1;

        while(start < end){

            int mid = (start + end)/2;

            if(arr[mid] == value)
                return mid;
            else if(arr[mid] > value){
                end = mid;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
 ***/
}
